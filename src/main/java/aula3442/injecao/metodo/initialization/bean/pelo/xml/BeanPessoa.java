package aula3442.injecao.metodo.initialization.bean.pelo.xml;

public class BeanPessoa {

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

	public void qualquerCoisa() {
		System.out.println("Executou o método init pelo XML");
	}

}
