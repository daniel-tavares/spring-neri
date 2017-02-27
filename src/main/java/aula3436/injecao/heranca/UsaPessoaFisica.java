package aula3436.injecao.heranca;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsaPessoaFisica {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("3436ApplicationContext.xml");

		BeanPessoaFisica beanPessoaFisica = context.getBean("pessoaFisica", BeanPessoaFisica.class);

		beanPessoaFisica.mostrarDados();

		context.close();
	}
}
