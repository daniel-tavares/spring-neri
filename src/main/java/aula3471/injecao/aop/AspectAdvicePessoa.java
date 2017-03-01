package aula3471.injecao.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AspectAdvicePessoa {

	// Simbolos para PointCuts = . << ponto ex: grava. = gravaA ou gravaB etc...
	// Simbolos para PointCuts = + << mais ex: grava.+ = gravaCliente ou
	// gravaBairro etc... [mas nao com grava]
	// Simbolos para PointCuts = * << vezes ex: grava.* = grava gravaA ou gravaB
	// etc...
	// Simbolos para PointCuts = \ << barra ex: \grava. = cliente.grava [mas nao
	// com grava]
	@Before("execution(public * *(..))")
	public void manipulouDadosBefore() {
		System.out.println("\nmanipulouDadosBefore()");
	}

	@After("execution(public * *(..))")
	public void manipulouDadosAfter() {
		System.out.println("manipulouDadosAfter()");
	}

	@After("execution(public * consulta*(..))")
	public void afterConsultas() {
		System.out.println("Consulta");
	}

	@After("execution(public * consultaPessoaPeloCodigo(..))")
	public void afterConsultasPorCodigo() {
		System.out.println("Consultou por codigo");
	}
}
