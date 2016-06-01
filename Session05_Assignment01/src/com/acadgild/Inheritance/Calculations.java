package com.acadgild.Inheritance;

public class Calculations extends Area{
	
	double base = 5;
	double height = 5;
	
	
public void areaRectangle(){
		
		area = aLength * aWidth;
		System.out.println(area);
		
	}

public void areaTriangle(){
	
	
	area = base *  height / 2;
	System.out.println(area);
	
}

}
