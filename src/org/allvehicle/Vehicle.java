package org.allvehicle;

import org.fourwheeler.FourWheeler;
import org.threewheeler.ThreeWheeler;
import org.twoheeler.TwoWheeler;

public class Vehicle {
	public void vehicleNecessery() {
		// TODO Auto-generated method stub
System.out.println("vehiclenecessery");
	}
	
public static void main(String[] args) {
 Vehicle  v=new Vehicle();
 TwoWheeler two=new  TwoWheeler();
 ThreeWheeler three=new  ThreeWheeler(); 
 FourWheeler four=new  FourWheeler();
 v.vehicleNecessery();
 two.cycle();
 three.Auto();
 four.car();
 four.bus();
 four.lorry();
 two.bike();
}
}
