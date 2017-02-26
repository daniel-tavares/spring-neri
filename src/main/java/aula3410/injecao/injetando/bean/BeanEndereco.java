package aula3410.injecao.injetando.bean;

public class BeanEndereco {

	private String descricao;
	private Integer numero;
	private String Bairro;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return Bairro;
	}

	public void setBairro(String bairro) {
		Bairro = bairro;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("\nEndereco: ");
		sb.append(this.descricao);
		sb.append("\nNumero: ");
		sb.append(this.numero);
		sb.append("\nBairro: ");
		sb.append(this.Bairro);

		return sb.toString();
	}

}
