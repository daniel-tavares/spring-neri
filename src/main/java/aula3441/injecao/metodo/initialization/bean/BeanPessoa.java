package aula3441.injecao.metodo.initialization.bean;

import org.springframework.beans.factory.InitializingBean;

public class BeanPessoa implements InitializingBean {

	private String nome;

	public BeanPessoa() {
		System.out.println("Executou o construtor");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Metodo que sempre sera executado ao inicializar um bean");

	}

}
