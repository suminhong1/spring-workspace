package com.kh.character;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Character {

	private String name;
	private int level;
	private Weapon weapon;
	
	public String quest(String questName) throws Exception {
		System.out.println(questName + "퀘스트 진행 중...");
		return questName + "퀘스트 진행중";
	}
}
