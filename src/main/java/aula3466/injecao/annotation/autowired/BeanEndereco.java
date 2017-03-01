package aula3466.injecao.annotation.autowired;

public class BeanEndereco {

	private String rua;
	private String bairro;
	private Integer numero;

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return rua + ", " + bairro + ", " + numero;
	}
}
