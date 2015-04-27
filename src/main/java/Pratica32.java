
import static java.lang.Math.exp;
import static java.lang.Math.sqrt;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cliente
 */
public class Pratica32 {
    public static void main(String[] args) {
        double r;
        r=densidade(-1,67,3);
        System.out.println(r);
    }
    
    public static double densidade(double x, double media, 
           double desvio) {
        double d = (exp((-1/2)*((x-media)/(desvio))*((x-media)/(desvio))))/sqrt(2*Math.PI*desvio);
       return d;
    }
    
}
