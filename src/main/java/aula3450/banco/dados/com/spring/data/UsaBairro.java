package aula3450.banco.dados.com.spring.data;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsaBairro {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("3450ApplicationContext.xml");

		BairroRepository bairroRepository = context.getBean("bairroRepository", BairroRepository.class);

		BeanBairro beanBairro = new BeanBairro();

		beanBairro.setNome("Monte Castelo");

		bairroRepository.save(beanBairro);

		context.close();
	}
}
