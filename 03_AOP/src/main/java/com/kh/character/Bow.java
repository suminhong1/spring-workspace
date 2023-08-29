package com.kh.character;

public class Bow extends Weapon{

	public Bow() {}
	
	public Bow(String name) {
		super(name);
	}
	
	@Override
	public String attack() throws Exception {
		return "활을 쏜다.";
	}

}
