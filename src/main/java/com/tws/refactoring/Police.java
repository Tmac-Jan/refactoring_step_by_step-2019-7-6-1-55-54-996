package com.tws.refactoring;

public class Police {
    public boolean checkDriver(Driver driver) {
        return driver.age>=18;
    }

    public static void main(String[] args) {
        int number1 = 100;
        int number2 = 100;
        System.out.println(number1 == number2);

        Integer number3 = new Integer(100);
        Integer number4 = new Integer(100);

        System.out.println(number3 == number4);
    }

}
