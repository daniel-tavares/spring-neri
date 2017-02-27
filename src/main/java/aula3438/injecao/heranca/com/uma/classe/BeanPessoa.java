package aula3438.injecao.heranca.com.uma.classe;

public class BeanPessoa {

	private String nome;
	private String cidade;
	private String cpf;
	private String apelido;

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

	public void mostrarDados() {
		System.out.println("Nome: " + nome + "\nCidade: " + cidade + "\nCpf: " + cpf + "\nApelido: " + apelido);
	}

}
