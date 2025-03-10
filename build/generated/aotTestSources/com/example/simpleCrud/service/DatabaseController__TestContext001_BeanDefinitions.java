package com.example.simpleCrud.service;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link DatabaseController}.
 */
@Generated
public class DatabaseController__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'databaseController'.
   */
  public static BeanDefinition getDatabaseControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DatabaseController.class);
    beanDefinition.setInstanceSupplier(DatabaseController::new);
    return beanDefinition;
  }
}
