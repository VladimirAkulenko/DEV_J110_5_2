/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author USER
 */

//Вычисление интеграла заданной функции методом прямоугольников
public class MethodRectangles {
    public static double findIntegral (Function func, double left, double right, double part){
        double result =0;
        double h = (right-left)/part;
        for (int i=0; i<part; i++){
            result +=h*func.getFunc(left+i*h);
        }
        return result;
    }
}
