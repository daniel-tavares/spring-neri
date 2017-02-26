package aula3396.universidade;

public class IniciaAulaSemSpring {

	public static void main(String[] args) {
		UniversidadeUlbra ub = new UniversidadeUlbra();
		ub.setAluno(new Aluno());
		ub.setProfessor(new Professor());
		ub.setQuadroNegro(new QuadroNegro());
		ub.aula();
	}
}
