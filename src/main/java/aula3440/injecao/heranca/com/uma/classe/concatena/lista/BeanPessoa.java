package aula3440.injecao.heranca.com.uma.classe.concatena.lista;

import java.util.List;

public class BeanPessoa {

	private String nome;
	private String cidade;
	private String cpf;
	private String apelido;
	private List<String> irmaos;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public List<String> getIrmaos() {
		return irmaos;
	}

	public void setIrmaos(List<String> irmaos) {
		this.irmaos = irmaos;
	}

	public void mostrarDados() {
		System.out.println("Nome: " + nome + "\nCidade: " + cidade + "\nCpf: " + cpf + "\nApelido: " + apelido
				+ "\nIrmaos: " + irmaos);
	}

}
