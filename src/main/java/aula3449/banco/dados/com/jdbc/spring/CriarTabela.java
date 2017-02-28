package aula3449.banco.dados.com.jdbc.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class CriarTabela {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("3449ApplicationContext.xml");

		JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);

		jdbcTemplate.execute("CREATE TABLE bairro (bai_codigo BIGINT, bai_nome VARCHAR(50));");

		context.close();
	}
}
