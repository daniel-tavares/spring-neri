package aula3442.injecao.metodo.initialization.bean.pelo.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsaPessoa {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("3442ApplicationContext.xml");

		BeanPessoa beanPessoa = context.getBean("beanPessoa", BeanPessoa.class);

		System.out.println(beanPessoa.getNome());

		context.close();
	}
}
