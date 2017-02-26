package aula3396.universidade;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IniciaAulaComSpring {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("3396ApplicationContext.xml");

		UniversidadeUlbra universidadeUlbra = context.getBean("universidade", UniversidadeUlbra.class);

		universidadeUlbra.aula();

		context.close();

	}

}
