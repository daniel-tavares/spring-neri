package aula3471.injecao.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestaSpringAOP {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("3471ApplicationContext.xml");

		IServicoPessoa servicoPessoa = context.getBean("servicoPessoa", IServicoPessoa.class);

		servicoPessoa.gravaPessoa();
		servicoPessoa.excluirPessoa();
		servicoPessoa.alterarPessoa();
		servicoPessoa.consultaPessoaPeloNome("Daniel");
		servicoPessoa.consultaPessoaPeloCodigo(2l);

		context.close();
	}
}
