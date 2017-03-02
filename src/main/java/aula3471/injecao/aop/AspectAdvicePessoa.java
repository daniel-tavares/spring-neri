package aula3471.injecao.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
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

	// Executa antes de cada método publico
	@Before("execution(public * *(..))")
	public void manipulouDadosBefore() {
		System.out.println("\nmanipulouDadosBefore()");
	}

	// Executa apos cada metodo publico
	@After("execution(public * *(..))")
	public void manipulouDadosAfter() {
		System.out.println("manipulouDadosAfter()");
	}

	// Executa apos cada metodo publico onde o inicio do metodo seja igual a
	// "consulta"
	@After("execution(public * consulta*(..))")
	public void afterConsultas() {
		System.out.println("Consulta");
	}

	// Executa apos cada metodo publico nde o nome do metodo seja
	// "consultaPessoaPeloCodigo"
	@After("execution(public * consultaPessoaPeloCodigo(..))")
	public void afterConsultasPorCodigo() {
		System.out.println("Consultou por codigo");
	}

	// Executa em todos os métodos publicos sempre que o método não ocorrer erro
	@AfterReturning("execution(public * *(. .))")
	public void afterReturning() {
		System.out.println("afterReturning()");
	}

	// Executa em todos os métodos publicos sempre que o método ocorrer um erro
	@AfterThrowing("execution(public * *(. .))")
	public void afterThrowing() {
		System.out.println("afterThrowing()");
	}

}
