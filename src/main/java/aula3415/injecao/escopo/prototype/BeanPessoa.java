package aula3415.injecao.escopo.prototype;

public class BeanPessoa {

	private String nome;

	public BeanPessoa() {
		System.out.println("Executou o Construtor!");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
