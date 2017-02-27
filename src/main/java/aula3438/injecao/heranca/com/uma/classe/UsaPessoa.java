package aula3438.injecao.heranca.com.uma.classe;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsaPessoa {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("3438ApplicationContext.xml");

		BeanPessoa pessoa = context.getBean("pessoa", BeanPessoa.class);

		pessoa.mostrarDados();

		context.close();
	}
}
