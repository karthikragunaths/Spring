
package com.journaldev.spring.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeAspectJoinPoint {

	@Before("execution(public void com.journaldev.spring.model..set*(*))")
	public void loggingAdvice(JoinPoint joinPoint) {
		System.out.println("Before running loggingAdvice on method=" + joinPoint.toString());

		System.out.println("Agruments Passed=" + Arrays.toString(joinPoint.getArgs()));

	}

	// Advice arguments, will be applied to bean methods with single String argument
	@Before("args(name)")
	public void logStringArguments(String name) {
		System.out.println("String argument passed=" + name);
	}
}

/**

We can use JoinPoint as parameter in the advice methods and using it get the method signature or the target object.

We can use args() expression in the pointcut to be applied to any method that matches the argument pattern. 
If we use this, then we need to use the same name in the advice method from where argument type is determined. 
We can use Generic objects also in the advice arguments.


*/