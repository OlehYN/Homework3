package com.javaee.dependency.homework3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javaee.dependency.homework3.fighter.Fighter;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Fighter naruto = (Fighter) context.getBean("naruto");
		
		System.out.println("Shinobi");
		System.out.println("Atack: " + naruto.attack());
		System.out.println("Defense against 12: " + naruto.defend(12));
		System.out.print("Excuses: ");
		naruto.tellExcuse();
		
		System.out.print("Victory: ");
		naruto.celebrateVictory();
		
		System.out.println();
		System.out.println();
		
		Fighter gopnic = (Fighter) context.getBean("gopnic");
		
		System.out.println("Gopnic");
		System.out.println("Atack: " + gopnic.attack());
		System.out.println("Defense against 12: " + gopnic.defend(12));
		System.out.print("Excuses: ");
		gopnic.tellExcuse();
		
		System.out.print("Victory: ");
		gopnic.celebrateVictory();
		
		System.out.println();
		System.out.println();
		
		Fighter jackieChan = (Fighter) context.getBean("jackieChan");
		
		System.out.println("Jackie Chan");
		System.out.println("Atack: " + jackieChan.attack());
		System.out.println("Defense against 12: " + jackieChan.defend(12));
		System.out.print("Excuses: ");
		jackieChan.tellExcuse();
		
		System.out.print("Victory: ");
		jackieChan.celebrateVictory();
		((ClassPathXmlApplicationContext) context).close();

	}

}
