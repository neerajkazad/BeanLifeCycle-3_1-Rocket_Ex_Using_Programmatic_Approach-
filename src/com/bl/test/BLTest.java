package com.bl.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.bl.beans.Rocket;

public class BLTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/bl/common/application-context.xml"));
		Rocket rocket = factory.getBean("rocket", Rocket.class);
		System.out.println(rocket);
		Rocket moonRocket = factory.getBean("moonRocket", Rocket.class);
		System.out.println(moonRocket);
		System.out.println("Finished...");
		((ConfigurableListableBeanFactory)factory).destroySingletons();
	}
}
