package aula3433.injecao.factory.method;

public class BeanPessoa {

	private String nome;

	public BeanPessoa() {
		System.out.println("Executou Construtor");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public static BeanPessoa novaInstancia() {
		System.out.println("Executou método novaInstancia");
		return new BeanPessoa();
	}
}
