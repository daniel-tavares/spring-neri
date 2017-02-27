package aula3435.injecao.factory.bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsaPessoa {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("3435ApplicationContext.xml");

		BeanPessoa beanPessoa = context.getBean("beanPessoaFactoryClass", BeanPessoa.class);

		System.out.println(beanPessoa.getNome());

		context.close();
	}
}
