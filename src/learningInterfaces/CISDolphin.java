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

public class CISDolphin extends CreaturesInTheSea implements CuteAndCuddly {

	public CISDolphin(String name, boolean swim, int legs) {
		super(name, swim = true, legs = 0);
	}


	String color = "grey";
	
	
	
	@Override
	public void interact() {
		System.out.println("Coming to cuddle");

	}

	@Override
	public String hug(){		//methods can also be implemented
		return "hug";
	}
	
	@Override
	public String cuddle(){
		return "cuddle";
	}
	
	
	static String giveJoy(){
		System.out.println("Printing class version");
		return "A whole lot of joy.";
	}
}

