package aula3416.injecao.arquivo.externo.propriedades;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsaPessoa {

	public static void main(String[] args) {

		// O arquivo 3416ApplicationContext.xml também é para o mesmo proposito,
		// porem com o arquivo do ApplicationContext modificado, a forma abaixo
		// é utilizando o xmlns:context
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("3417ApplicationContext.xml");

		BeanPessoa beanPessoa = context.getBean("beanPessoa", BeanPessoa.class);

		System.out.println(beanPessoa.getNome());

		context.close();
	}
}
