package aula3407.injecao.colecoes.map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsaPessoa {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("3407ApplicationContext.xml");

		System.out.println(context.getBean("pessoa", BeanPessoa.class));

		context.close();
	}
}
