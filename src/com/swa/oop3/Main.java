package com.swa.oop3;

public class Main {

	public static void main(String[] args) {
		Shape shape;
        

		Square squ = new Square();
        shape = squ;
        squ.setValues(9,9);
        System.out.println("Area of square : " + shape.getArea());
        

        Triangle tri = new Triangle();       
        shape = tri;
        tri.setValues(9,9);
        System.out.println("Area of triangle : " + shape.getArea());
        
        Circle cir = new Circle();
        shape = cir;   
        cir.setValues(9);   
        System.out.println("Area of circle : " + shape.getArea());
	}

}
