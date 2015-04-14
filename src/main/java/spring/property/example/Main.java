package spring.property.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	private Main() {
		
	}
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		try {
			
			MyBean myBean = context.getBean(MyBean.class);
			System.out.println("MyBean.beanProperty = " + myBean.beanProperty);
			
			MyComponent myComponent = context.getBean(MyComponent.class);
			System.out.println("MyComponent.componentProperty = " + myComponent.componentProperty);
			System.out.println("MyComponent.componentBoolean = " + myComponent.componentBoolean);
			
		} finally {
			context.close();
		}
	}
}
