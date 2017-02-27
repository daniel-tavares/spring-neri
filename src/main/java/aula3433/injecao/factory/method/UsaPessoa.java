package aula3433.injecao.factory.method;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsaPessoa {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("3433ApplicationContext.xml");
		BeanPessoa beanPessoa = context.getBean("beanPessoaFactory", BeanPessoa.class);

		System.out.println(beanPessoa.getNome());

		context.close();
	}
}
