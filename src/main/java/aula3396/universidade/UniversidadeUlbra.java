package aula3396.universidade;

public class UniversidadeUlbra {

	private Aluno aluno = null;
	private Professor professor = null;
	private QuadroNegro quadroNegro = null;

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public QuadroNegro getQuadroNegro() {
		return quadroNegro;
	}

	public void setQuadroNegro(QuadroNegro quadroNegro) {
		this.quadroNegro = quadroNegro;
	}

	public void aula() {
		quadroNegro.mostra_perg_resp("Bem-vindos a aula");
		String pergunta = aluno.pergunta();
		quadroNegro.mostra_perg_resp(pergunta);
		String resposta = professor.resposta();
		quadroNegro.mostra_perg_resp(resposta);
		quadroNegro.mostra_perg_resp("Fim da aula!");
	}

}
