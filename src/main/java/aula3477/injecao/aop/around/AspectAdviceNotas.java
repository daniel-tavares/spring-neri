package aula3477.injecao.aop.around;

import javax.swing.JOptionPane;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AspectAdviceNotas {

	@Around("execution(public * * (. .))")
	public Object calcularMedia(ProceedingJoinPoint pJoinPoint) throws Throwable {

		Object[] notas = pJoinPoint.getArgs();

		if ((Double) notas[0] > 10) {
			JOptionPane.showMessageDialog(null, "Nota invalida");
			throw new RuntimeException("Nota invalida");
		}

		return pJoinPoint.proceed();
	}
}
