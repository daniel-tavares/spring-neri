package aula3450.banco.dados.com.spring.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bairro")
public class BeanBairro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bai_codigo")
	private Long numero;

	@Column(name = "bai_nome")
	private String nome;

	public BeanBairro() {

	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
