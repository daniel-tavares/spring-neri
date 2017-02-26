package aula3412.injecao.lazy.init;

public class BeanPessoa {

	private String nome;

	public BeanPessoa() {
		System.out.println("Executou o construtor!");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
