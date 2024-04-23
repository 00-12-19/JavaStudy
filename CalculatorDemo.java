package com.spring.test;

abstract class AbstractCalculator {
    int left, right;

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    int _sum() {
        return this.left + this.right;
    }

    public abstract void sum();

    public abstract void avg();

    public void run() {
        sum();
        avg();
    }
}

class CalculatorDecoPlus extends AbstractCalculator {
    @Override
    public void sum() {
        System.out.println("+ 합계 :" + _sum());
    }

    @Override
    public void avg() {
        System.out.println("+ 평균 :" + (this.left + this.right) / 2);
    }
}

class CalculatorDecoMinus extends AbstractCalculator {
    @Override
    public void sum() {
        System.out.println("- 합계 :" + _sum());
    }

    @Override
    public void avg() {
        System.out.println("- 평균 :" + (this.left + this.right) / 2);
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {
        AbstractCalculator c1 = new CalculatorDecoPlus();
        c1.setOprands(10, 20);
        c1.run();

        AbstractCalculator c2 = new CalculatorDecoMinus();
        c2.setOprands(10, 20);
        c2.run();
    }
}
