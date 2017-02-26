package aula3401.injecao.via.setter;

public class BeanPessoa {

	private String nome;
	private String fone;
	private String cpf;
	private Integer idade;
	private Character sexo;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Character getSexo() {
		return sexo;
	}

	public void setSexo(Character sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("\nNome: ");
		sb.append(this.nome);
		sb.append("\nTelefone: ");
		sb.append(this.fone);
		sb.append("\nCpf: ");
		sb.append(this.cpf);
		sb.append("\nIdade: ");
		sb.append(this.idade);
		sb.append("\nSexo: ");
		sb.append(this.sexo);

		return sb.toString();
	}

}
