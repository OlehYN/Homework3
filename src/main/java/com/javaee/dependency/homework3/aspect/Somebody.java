package com.javaee.dependency.homework3.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import com.javaee.dependency.homework3.fighter.Fighter;
import com.javaee.dependency.homework3.fighter.GopnicFighter;

@Aspect
public class Somebody {

	@Around("execution(* com.javaee.dependency.homework3.fighter.Fighter.attack(..))")
	public double logAround(ProceedingJoinPoint joinPoint) throws Throwable {
		Fighter fighter = (Fighter) joinPoint.getTarget();

		if (fighter instanceof GopnicFighter) {
			System.out.println("Глядач: покажи всім свою силу!!!");
			double damage = (Double) joinPoint.proceed();

			if (damage == 0)
				System.out.println("Глядач: Ех, я вже зрозумів, що ти програв...");
			else
				System.out.println("Глядач: Я вже бачу, що все буде норм!");
			return damage;
		} else {
			return (Double) joinPoint.proceed();
		}

	}
}
