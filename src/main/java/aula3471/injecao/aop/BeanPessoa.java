package aula3471.injecao.aop;

public class BeanPessoa {

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Nome: " + nome;
	}

}
