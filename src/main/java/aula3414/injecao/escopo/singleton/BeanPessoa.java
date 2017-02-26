package aula3414.injecao.escopo.singleton;

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
