package aula3446.banco.dados.com.spring;

import javax.swing.JOptionPane;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsaPessoa {

	public static void main(String[] args) {

		// BeanPessoa beanPessoa = new BeanPessoa();
		// beanPessoa.setNome("Daniel Freitas ");

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("3393ApplicationContext.xml");
		BeanPessoa beanPessoa = context.getBean("beanPessoa", BeanPessoa.class);

		JOptionPane.showMessageDialog(null, beanPessoa.getNome());

		context.close();
	}
}
