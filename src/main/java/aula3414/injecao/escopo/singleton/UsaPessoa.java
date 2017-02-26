package aula3414.injecao.escopo.singleton;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsaPessoa {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("3414ApplicationContext.xml");

		BeanPessoa beanPessoa = context.getBean("beanPessoa", BeanPessoa.class);
		BeanPessoa beanPessoa1 = context.getBean("beanPessoa", BeanPessoa.class);
		BeanPessoa beanPessoa2 = context.getBean("beanPessoa", BeanPessoa.class);
		BeanPessoa beanPessoa3 = context.getBean("beanPessoa", BeanPessoa.class);

		System.out.println(beanPessoa);
		System.out.println(beanPessoa1);
		System.out.println(beanPessoa2);
		System.out.println(beanPessoa3);

		context.close();
	}
}
