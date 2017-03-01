package aula3466.injecao.annotation.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class BeanPessoa {

	private String nome;
	private String sobrenome;
	@Autowired
	private BeanEndereco endereco;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public BeanEndereco getEndereco() {
		return endereco;
	}

	public void setEndereco(BeanEndereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "\nNome: " + nome + "\nSobrenome: " + sobrenome + "\nEndereco: " + endereco;
	}

}
