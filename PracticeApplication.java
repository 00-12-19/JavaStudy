package com.spring.test;

import java.util.Arrays;
import org.springframework.boot.autoconfigure.SpringBootApplication;

class Calculator{
	
	private int left;
	private int right;

	public void setOprands(int left, int right) {
		this.left = left;
		this. right = right;
	}
	public void sum() {
		System.out.println(this.left + this.right);
	}
	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
}

@SpringBootApplication
public class PracticeApplication {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		
		Calculator c2 = new Calculator();
		c2.setOprands(20, 40);
		c2.sum();
		c2.avg();
	}

}
