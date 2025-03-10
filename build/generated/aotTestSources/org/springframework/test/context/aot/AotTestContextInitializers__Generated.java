package org.springframework.test.context.aot;

import com.example.simpleCrud.SimpleCrudApplicationTests__TestContext001_ApplicationContextInitializer;
import java.lang.Class;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import org.springframework.aot.generate.Generated;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Generated mappings for {@link AotTestContextInitializers}.
 */
@Generated
public class AotTestContextInitializers__Generated {
  public static Map<String, Supplier<ApplicationContextInitializer<? extends ConfigurableApplicationContext>>> getContextInitializers(
      ) {
    Map<String, Supplier<ApplicationContextInitializer<? extends ConfigurableApplicationContext>>> map = new HashMap<>();
    map.put("com.example.simpleCrud.SimpleCrudApplicationTests", () -> new SimpleCrudApplicationTests__TestContext001_ApplicationContextInitializer());
    map.put("com.example.simpleCrud.model.SimpleClientTests", () -> new SimpleCrudApplicationTests__TestContext001_ApplicationContextInitializer());
    map.put("com.example.simpleCrud.model.SimpleCrudTests", () -> new SimpleCrudApplicationTests__TestContext001_ApplicationContextInitializer());
    map.put("com.example.simpleCrud.model.SimpleDeserializationTests", () -> new SimpleCrudApplicationTests__TestContext001_ApplicationContextInitializer());
    map.put("com.example.simpleCrud.model.SimpleSerializationTests", () -> new SimpleCrudApplicationTests__TestContext001_ApplicationContextInitializer());
    map.put("com.example.simpleCrud.model.exceptions.DatabaseExceptionTests", () -> new SimpleCrudApplicationTests__TestContext001_ApplicationContextInitializer());
    map.put("com.example.simpleCrud.model.exceptions.DeserializationExceptionTests", () -> new SimpleCrudApplicationTests__TestContext001_ApplicationContextInitializer());
    map.put("com.example.simpleCrud.provider.ClientDeserializationTests", () -> new SimpleCrudApplicationTests__TestContext001_ApplicationContextInitializer());
    map.put("com.example.simpleCrud.provider.CrudDefaultMapTests", () -> new SimpleCrudApplicationTests__TestContext001_ApplicationContextInitializer());
    return map;
  }

  public static Map<String, Class<? extends ApplicationContextInitializer<?>>> getContextInitializerClasses(
      ) {
    Map<String, Class<? extends ApplicationContextInitializer<?>>> map = new HashMap<>();
    map.put("com.example.simpleCrud.SimpleCrudApplicationTests", SimpleCrudApplicationTests__TestContext001_ApplicationContextInitializer.class);
    map.put("com.example.simpleCrud.model.SimpleClientTests", SimpleCrudApplicationTests__TestContext001_ApplicationContextInitializer.class);
    map.put("com.example.simpleCrud.model.SimpleCrudTests", SimpleCrudApplicationTests__TestContext001_ApplicationContextInitializer.class);
    map.put("com.example.simpleCrud.model.SimpleDeserializationTests", SimpleCrudApplicationTests__TestContext001_ApplicationContextInitializer.class);
    map.put("com.example.simpleCrud.model.SimpleSerializationTests", SimpleCrudApplicationTests__TestContext001_ApplicationContextInitializer.class);
    map.put("com.example.simpleCrud.model.exceptions.DatabaseExceptionTests", SimpleCrudApplicationTests__TestContext001_ApplicationContextInitializer.class);
    map.put("com.example.simpleCrud.model.exceptions.DeserializationExceptionTests", SimpleCrudApplicationTests__TestContext001_ApplicationContextInitializer.class);
    map.put("com.example.simpleCrud.provider.ClientDeserializationTests", SimpleCrudApplicationTests__TestContext001_ApplicationContextInitializer.class);
    map.put("com.example.simpleCrud.provider.CrudDefaultMapTests", SimpleCrudApplicationTests__TestContext001_ApplicationContextInitializer.class);
    return map;
  }
}
