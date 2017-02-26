package aula3406.injecao.colecoes.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsaPessoa {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("3406ApplicationContext.xml");

		System.out.println(context.getBean("pessoa", BeanPessoa.class));

		context.close();
	}
}
