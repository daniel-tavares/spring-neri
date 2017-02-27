package aula3443.injecao.validacao.validator;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;

public class UsaPessoa {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("3443ApplicationContext.xml");

		BeanPessoa beanPessoa = context.getBean("beanPessoa", BeanPessoa.class);

		System.out.println(beanPessoa);

		Errors erro = new BeanPropertyBindingResult(beanPessoa, "BeanPessoa");
		beanPessoa.validate(beanPessoa, erro);

		for (Object erros : erro.getAllErrors()) {
			System.out.println(erros.toString());
		}

		context.close();
	}
}
