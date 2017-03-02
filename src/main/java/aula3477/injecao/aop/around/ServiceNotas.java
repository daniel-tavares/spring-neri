package aula3477.injecao.aop.around;

public class ServiceNotas implements IServiceNotas {

	public Double calculaMedia(Double nota1, Double nota2) {
		return (nota1 + nota2) / 2;
	}

}
