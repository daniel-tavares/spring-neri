package aula3418.injecao.internacionalizacao;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsaInternacionalizacao {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("3418ApplicationContext.xml");

		MessageSource mensagem = context.getBean("messageSource", MessageSource.class);

		System.out.println("Em inglês: " + mensagem.getMessage("mensagem.bemvindo", null, Locale.US));

		System.out.println("Em português: " + mensagem.getMessage("mensagem.bemvindo", null, new Locale("pt", "BR")));

		System.out.println("Em espanhol: " + mensagem.getMessage("mensagem.bemvindo", null, new Locale("es", "MX")));

		context.close();
	}
}
