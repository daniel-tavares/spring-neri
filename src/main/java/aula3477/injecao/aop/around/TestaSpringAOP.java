package aula3477.injecao.aop.around;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestaSpringAOP {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("3477ApplicationContext.xml");

		IServiceNotas servicoNotas = (IServiceNotas) context.getBean("servicoNotas");

		System.out.println(servicoNotas.calculaMedia(15d, 7d));

		context.close();
	}
}
