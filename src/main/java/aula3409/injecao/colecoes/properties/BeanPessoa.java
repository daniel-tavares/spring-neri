package aula3409.injecao.colecoes.properties;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class BeanPessoa {

	private String nome;
	private String fone;
	private String cpf;
	private Integer idade;
	private Character sexo;

	private List<String> listaDeIrmaos;
	private Map<String, Integer> videoaulasQuantidade;
	private Set<String> filhos;
	private Properties conexao;

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

	public List<String> getListaDeIrmaos() {
		return listaDeIrmaos;
	}

	public void setListaDeIrmaos(List<String> listaDeIrmaos) {
		this.listaDeIrmaos = listaDeIrmaos;
	}

	public Map<String, Integer> getVideoaulasQuantidade() {
		return videoaulasQuantidade;
	}

	public void setVideoaulasQuantidade(Map<String, Integer> videoaulasQuantidade) {
		this.videoaulasQuantidade = videoaulasQuantidade;
	}

	public Set<String> getFilhos() {
		return filhos;
	}

	public void setFilhos(Set<String> filhos) {
		this.filhos = filhos;
	}

	public Properties getConexao() {
		return conexao;
	}

	public void setConexao(Properties conexao) {
		this.conexao = conexao;
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
		sb.append("\nIrmaos: \n");
		sb.append(this.listaDeIrmaos);
		sb.append("\nVideoaulas e quantidade");
		sb.append(this.videoaulasQuantidade);
		sb.append("\nFilhos: ");
		sb.append(this.filhos);
		sb.append("\nConexao: ");
		sb.append(this.conexao);

		return sb.toString();
	}

}
