/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningInterfaces;

/**
 *
 * @author User
 */

public abstract class Animals {

	String type = "Animal";
	String name;
	boolean head;
	boolean mouth;
	boolean eyes;
	boolean nose;	
	boolean legs;
	
	
	
	@Override
	public String toString() {
		return "Animals [type=" + type + ", name=" + name + "]";
	}

	public Animals(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public void eat(){
		poop();
	}
	
	public String poop(){
		System.out.println("pooping!\n");
		return "poop";
	}
}

