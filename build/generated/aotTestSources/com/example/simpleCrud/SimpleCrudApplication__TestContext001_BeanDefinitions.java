package com.example.simpleCrud;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link SimpleCrudApplication}.
 */
@Generated
public class SimpleCrudApplication__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'simpleCrudApplication'.
   */
  public static BeanDefinition getSimpleCrudApplicationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(SimpleCrudApplication.class);
    beanDefinition.setTargetType(SimpleCrudApplication.class);
    ConfigurationClassUtils.initializeConfigurationClass(SimpleCrudApplication.class);
    beanDefinition.setInstanceSupplier(SimpleCrudApplication$$SpringCGLIB$$0::new);
    return beanDefinition;
  }
}
