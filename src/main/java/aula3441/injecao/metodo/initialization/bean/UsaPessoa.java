package aula3441.injecao.metodo.initialization.bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsaPessoa {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("3441ApplicationContext.xml");

		BeanPessoa beanPessoa = context.getBean("beanPessoa", BeanPessoa.class);

		System.out.println(beanPessoa.getNome());

		context.close();
	}
}
