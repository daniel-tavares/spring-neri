package aula3471.injecao.aop;

public interface IServicoPessoa {

	public void gravaPessoa();

	public void excluirPessoa();

	public void alterarPessoa();

	public String consultaPessoaPeloNome(String nome);

	public String consultaPessoaPeloCodigo(Long codigo);
}
