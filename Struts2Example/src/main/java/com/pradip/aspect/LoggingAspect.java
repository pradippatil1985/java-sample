package com.pradip.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {

	@Around("execution(* com.pradip.user.*.*.*(..))")
	public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {
		Logger LOGGER = Logger.getLogger(joinPoint.getTarget().getClass());
		LOGGER.debug("Method execution : " + joinPoint.getTarget().getClass().toString() + "."
				+ joinPoint.getSignature().getName() + " Started...");
		// System.out.println("hijacked arguments : "
		// +Arrays.toString(joinPoint.getArgs()));
		joinPoint.proceed(); // continue on the intercepted method
		LOGGER.debug("Method execution: " + joinPoint.getTarget().getClass().toString() + "."
				+ joinPoint.getSignature().getName() + " Ends!!");
	}

	@AfterThrowing(pointcut = "execution(* com.pradip.user.*.*.*(..))", throwing = "error")
	public void logAfterThrowing(JoinPoint joinPoint, Throwable error) {
		Logger LOGGER = Logger.getLogger(joinPoint.getTarget().getClass());
		LOGGER.debug("logAfterThrowing() is running!");
		LOGGER.debug(
				"hijacked : " + joinPoint.getTarget().getClass().toString() + "." + joinPoint.getSignature().getName());
		LOGGER.debug("Exception : " + error);
		LOGGER.debug("******");
	}
}
