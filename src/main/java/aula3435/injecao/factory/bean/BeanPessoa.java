package aula3435.injecao.factory.bean;

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

	public static BeanPessoa novaInstancia(String nome) {
		System.out.println("Executou método novaInstancia");

		BeanPessoa beanPessoa = new BeanPessoa();
		beanPessoa.setNome(nome);

		return beanPessoa;
	}
}
