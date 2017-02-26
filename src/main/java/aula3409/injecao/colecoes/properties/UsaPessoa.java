package aula3409.injecao.colecoes.properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsaPessoa {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("3409ApplicationContext.xml");

		System.out.println(context.getBean("pessoa", BeanPessoa.class));

		context.close();
	}
}
