package aula3403.injecao.via.construtor;

public class BeanPessoa {

	private String nome;
	private String fone;
	private String cpf;
	private Integer idade;
	private Character sexo;

	public BeanPessoa(String nome, String fone, String cpf, Integer idade, Character sexo) {
		this.nome = nome;
		this.fone = fone;
		this.cpf = cpf;
		this.idade = idade;
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
