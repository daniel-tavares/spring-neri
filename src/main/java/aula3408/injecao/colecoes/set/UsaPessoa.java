package aula3408.injecao.colecoes.set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsaPessoa {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("3408ApplicationContext.xml");

		System.out.println(context.getBean("pessoa", BeanPessoa.class));

		context.close();
	}
}
