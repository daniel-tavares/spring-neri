package aula3471.injecao.aop;

public class ServicoPessoa implements IServicoPessoa {

	public void gravaPessoa() {
		System.out.println("gravaPessoa()");
	}

	public void excluirPessoa() {
		System.out.println("excluirPessoa()");
		throw new RuntimeException("Erro para teste do Throwing");
	}

	public void alterarPessoa() {
		System.out.println("alterarPessoa()");

	}

	public String consultaPessoaPeloNome(String nome) {
		System.out.println("consultaPessoaPeloNome(String nome)");
		return nome;
	}

	public String consultaPessoaPeloCodigo(Long codigo) {
		System.out.println("consultaPessoaPeloCodigo(Long codigo)");
		return "" + codigo;
	}

}
