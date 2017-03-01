package aula3471.injecao.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AspectAdvicePessoa {

	// Simbolos para PointCuts = . << ponto ex: grava. = gravaA ou gravaB etc...
	// Simbolos para PointCuts = + << mais ex: grava.+ = gravaCliente ou gravaBairro etc... [mas nao com grava]
	// Simbolos para PointCuts = * << vezes ex: grava.* = grava gravaA ou gravaB etc...
	// Simbolos para PointCuts = \ << barra ex: \grava. = cliente.grava  [mas nao com grava]
	@Before("execution(public * *(..))")
	public void manipulouDados() {
		System.out.println("manipulouDados()");
	}
}
