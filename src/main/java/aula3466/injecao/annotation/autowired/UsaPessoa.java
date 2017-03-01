package aula3466.injecao.annotation.autowired;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsaPessoa {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("3466ApplicationContext.xml");

		BeanPessoa pessoa = (BeanPessoa) context.getBean("pessoa");

		System.out.println(pessoa);

		context.close();
	}
}
