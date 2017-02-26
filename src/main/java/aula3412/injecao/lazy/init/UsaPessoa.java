package aula3412.injecao.lazy.init;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsaPessoa {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("3412ApplicationContext.xml");

		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}

		BeanPessoa beanPessoa = context.getBean("beanPessoa", BeanPessoa.class);

		System.out.println(beanPessoa.getNome());

		context.close();
	}
}
