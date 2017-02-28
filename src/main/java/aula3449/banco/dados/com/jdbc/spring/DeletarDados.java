package aula3449.banco.dados.com.jdbc.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class DeletarDados {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("3449ApplicationContext.xml");

		JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);

		jdbcTemplate.update("DELETE FROM bairro WHERE bai_codigo = 1;");

		context.close();
	}
}
