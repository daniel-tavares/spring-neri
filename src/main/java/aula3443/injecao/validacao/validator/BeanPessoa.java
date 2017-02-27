package aula3443.injecao.validacao.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class BeanPessoa implements Validator {

	private String nome;
	private Integer filhos;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getFilhos() {
		return filhos;
	}

	public void setFilhos(Integer filhos) {
		this.filhos = filhos;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\nFilhos: " + filhos;
	}

	@SuppressWarnings("rawtypes")
	public boolean supports(Class clazz) {
		return BeanPessoa.class.equals("clazz");
	}

	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "nome", "Nome não pode ser vazio");
		BeanPessoa beanPessoa = (BeanPessoa) target;
		if (beanPessoa.filhos < 0) {
			errors.rejectValue("filhos", "Numero de filhos negativo");
		} else if (beanPessoa.filhos > 50) {
			errors.rejectValue("filhos", "Filhos em demasia");
		}
	}

}
