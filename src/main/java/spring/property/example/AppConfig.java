package spring.property.example;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;

@Configuration
@ComponentScan("spring.property.example")
@PropertySource("example.properties")
public class AppConfig {

	/**
	 * Uses the environment to inject the property into the beans that do not have the @Value attribute
	 * 
	 * @param environment
	 * @return
	 */
	@Bean
	public MyBean myBean(Environment environment) {
		MyBean bean = new MyBean();
		bean.beanProperty = environment.getProperty("beanProperty");
		return bean;
	}
	
	/**
	 * Loads the properties into the beans using the @Value attribute
	 * 
	 * @return
	 */
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(Environment environment) {
		PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
		propertySourcesPlaceholderConfigurer.setEnvironment(environment);
		return propertySourcesPlaceholderConfigurer;
	}
}
