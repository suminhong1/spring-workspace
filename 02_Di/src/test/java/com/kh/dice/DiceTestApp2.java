package com.kh.dice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DiceTestApp2 {

	public static void main(String[] args) {
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/main/resources/config/dice.xml"));
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("/config/dice.xml");
		
		Player p1  = (Player) factory.getBean("player1");
		p1.playDice(3);
		System.out.println("========================");
		System.out.println("선택된 주사위 수의 통합은 : " + p1.getTotalValue());
		System.out.println("========================");
		
		Player p2  = (Player) factory.getBean("player2");
		p2.playDice(3);
		System.out.println("========================");
		System.out.println("선택된 주사위 수의 통합은 : " + p2.getTotalValue());
		System.out.println("========================");
		
		Player p3  = (Player) factory.getBean("player3");
		p3.playDice(3);
		System.out.println("========================");
		System.out.println("선택된 주사위 수의 통합은 : " + p3.getTotalValue());
		System.out.println("========================");
	}

}
