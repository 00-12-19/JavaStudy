package com.spring.test;

class Moter{
	public void Drive() {
		System.out.println("드라이브");
	}
	public void Brake() {
		System.out.println("브레이크");
	}
}

class Car extends Moter {
	public void CarName () {
		System.out.println("Car");
	}
}

class WheelCount{
	public int wheel() {
		return 4;
	}
}

class WindowCount{
	public int window() {
		return 2;
	}
}

public class Quiz {
	public static void main(String[] args) {
		
		Moter m = new Moter();
		m.Drive();
		m.Brake();
		System.out.println();
		
		Car c = new Car();
		c.CarName();
		c.Drive();
		c.Brake();
		System.out.println();
		
		WheelCount wheel = new WheelCount();
		int wheelcount = wheel.wheel();
		System.out.println("Wheel Count : " + wheelcount);
		
		WindowCount window = new WindowCount();
		int windowcount = window.window();
		System.out.println("Window Count : " + windowcount);
	}
}