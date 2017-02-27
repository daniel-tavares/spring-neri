package aula3440.injecao.heranca.com.uma.classe.concatena.lista;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsaPessoa {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("3440ApplicationContext.xml");

		BeanPessoa pessoa = context.getBean("pessoa", BeanPessoa.class);

		pessoa.mostrarDados();

		context.close();
	}
}
