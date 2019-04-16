<center>
<a href="https://vaadin.com">
 <img src="https://vaadin.com/images/hero-reindeer.svg" width="200" height="200" /></a>
</center>


# I18NProvider - how to get a translation





```java
              final I18NProvider i18NProvider = VaadinService
                  .getCurrent()
                  .getInstantiator()
                  .getI18NProvider();
```

This few lines are introducing a new thing, that is available in Vaadin 10.
The interface **I18NProvider** is used to implement a mechanism for the internationalization 
of Vaadin applications.

The interface is simple and with only two methods to implement.

```java
public interface I18NProvider extends Serializable {
    List<Locale> getProvidedLocales();
    String getTranslation(String key, Locale locale, Object... params);
}
```

The first one should give back the list of Locales that could be handled from this implementation.
The second method is used to translate the message key itself. 
In this method the handling of a default translation or better the switch into a default language 
should be handled. Missing keys can be handled differently. Some developers are throwing 
an exception, but I prefer to return the key itself, 
together with the locale from the original request. 
This information is mostly better to use as a stacktrace.

The solution that is bundled with this demo is able to handle the Locales EN ad DE, fallback will be the locale EN.
The implementation is not dealing with reloads of message bundles during runtime or other 
features that are needed for professional environments.

```java
public class VaadinI18NProvider implements I18NProvider, HasLogger {

  public VaadinI18NProvider() {
    logger().info("VaadinI18NProvider was found..");
  }

  public static final String RESOURCE_BUNDLE_NAME = "vaadinapp";

  private static final ResourceBundle RESOURCE_BUNDLE_EN = getBundle(RESOURCE_BUNDLE_NAME , ENGLISH);
  private static final ResourceBundle RESOURCE_BUNDLE_DE = getBundle(RESOURCE_BUNDLE_NAME , GERMAN);


  @Override
  public List<Locale> getProvidedLocales() {
    logger().info("VaadinI18NProvider getProvidedLocales..");
    return List.of(ENGLISH ,
                   GERMAN);
  }

  @Override
  public String getTranslation(String key , Locale locale , Object... params) {
//    logger().info("VaadinI18NProvider getTranslation.. key : " + key + " - " + locale);
    return match(
        matchCase(() -> success(RESOURCE_BUNDLE_EN)) ,
        matchCase(() -> GERMAN.equals(locale) , () -> success(RESOURCE_BUNDLE_DE)) ,
        matchCase(() -> ENGLISH.equals(locale) , () -> success(RESOURCE_BUNDLE_EN))
    )
        .map(resourceBundle -> {
          if (! resourceBundle.containsKey(key))
            logger().info("missing ressource key (i18n) " + key);

          return (resourceBundle.containsKey(key)) ? resourceBundle.getString(key) : key;

        })
        .getOrElse(() -> key + " - " + locale);
  }
}
```
The Interface **I18NProvider** is implemented for example by the abstract class **Component**.
Having this in mind, we are now using the same 
mechanism for the page title as well as inside a Component. 

The last thing you should not forget is the activation of the **I18NProvider** implementation itself.
There are several ways you can use, I am using a simple approach inside the main method that will start
my app itself.

```setProperty("vaadin.i18n.provider", VaadinI18NProvider.class.getName());```



```java
public class BasicTestUIRunner {
  private BasicTestUIRunner() {
  }

  public static void main(String[] args) {
    setProperty("vaadin.i18n.provider", VaadinI18NProvider.class.getName());
    
    new Meecrowave(new Meecrowave.Builder() {
      {
//        randomHttpPort();
        setHttpPort(8080);
        setTomcatScanning(true);
        setTomcatAutoSetup(false);
        setHttp2(true);
      }
    })
        .bake()
        .await();
  }
}
```