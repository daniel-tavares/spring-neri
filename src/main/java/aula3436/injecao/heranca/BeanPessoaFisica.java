package aula3436.injecao.heranca;

public class BeanPessoaFisica extends BeanPessoa {

	private String cpf;
	private String apelido;

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
		System.out.println("Nome: " + getNome() + "\nCidade: " + getCidade() + "\nCpf: " + getCpf() + "\nApelido: "
				+ getApelido());
	}
}
