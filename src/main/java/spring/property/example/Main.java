package spring.property.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	private Main() {
		
	}
	
	public static void main(String[] args) {
		
		Object obj = new Object();
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		try {
			
			MyBean myBean = context.getBean(MyBean.class);
			System.out.println("MyBean.beanProperty = " + myBean.beanProperty);
			
			MyComponent myComponent = context.getBean(MyComponent.class);
			System.out.println("MyComponent.componentProperty = " + myComponent.componentProperty);
			
			synchronized (obj) {
				obj.wait();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			context.close();
		}
	}
}
