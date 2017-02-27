package aula3434.injecao.factory.method.com.parametro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsaPessoa {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("3434ApplicationContext.xml");
		BeanPessoa beanPessoa = context.getBean("beanPessoaFactory", BeanPessoa.class);

		System.out.println(beanPessoa.getNome());

		context.close();
	}
}
