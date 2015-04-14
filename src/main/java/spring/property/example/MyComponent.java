package spring.property.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {

	@Value("${componentProperty}")
	String componentProperty;
	
	@Value("${componentBoolean}")
	boolean componentBoolean;
}
