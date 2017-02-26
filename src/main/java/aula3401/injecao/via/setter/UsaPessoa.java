package aula3401.injecao.via.setter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsaPessoa {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("3401ApplicationContext.xml");

		System.out.println(context.getBean("pessoa", BeanPessoa.class));

		context.close();
	}
}
