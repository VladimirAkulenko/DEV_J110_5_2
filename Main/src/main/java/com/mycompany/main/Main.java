/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.main;

/**
 *
 * @author USER
 */
public class Main {

    private final static double PART = 100;

    public static void main(String[] args) {

        //Вложенный класс
        double f1 = MethodRectangles.findIntegral(new LnX(),2, 5, PART);
        System.out.println("f1 = "+ f1);

        //Анонимный класс
        double f2 = MethodRectangles.findIntegral(new Function() {
            @Override
            public double getFunc(double x) {
                return x*(x+1);}
        },3,4,PART);
        System.out.println("f2 = " + f2);

        // Ссылка на статический метод
        double f3 = MethodRectangles.findIntegral(ExpMinus :: expMinus,0.01,2,PART);
        System.out.println("f3 = " + f3);

        //Ссылка на метод экземпляра
        Function powX2 = new PowX2();
        double f4 = MethodRectangles.findIntegral(powX2,1,3,PART);
        System.out.println("f4 = "+ f4);

        //Лямбда-выражение
        double f5 = MethodRectangles.findIntegral((double x) -> x*Math.sin(x),0,1,PART);
        System.out.println("f5 = " + f5);

    }

    private static class LnX implements Function{

        @Override
        public double getFunc(double x) {
            return Math.log(x);
        }
    }
}
