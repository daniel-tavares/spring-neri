package aula3461.criando.anotacao;

import java.lang.reflect.Field;

public class TesteUsoAnotacao {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.setNome("Daniel");
		aluno.setEndereco("Maestro Francisco Gaia");
		aluno.setEmail("daniel.exatas@gmail.com");
		// aluno.setTelefone("39225256");

		try {
			validaCampos(aluno);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("ERRO!");
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	public static void validaCampos(Aluno aluno) throws Exception {
		Class<Aluno> aluno_class = (Class<Aluno>) aluno.getClass();
		Field[] camposAluno = aluno_class.getDeclaredFields();
		for (Field campo : camposAluno) {
			if (campo.isAnnotationPresent(NaoVazio.class)) {
				campo.setAccessible(true);
				if (campo.get(aluno) == null) {
					throw new RuntimeException("Este campo é obrigatório");
				}
			}
		}
	}

}
