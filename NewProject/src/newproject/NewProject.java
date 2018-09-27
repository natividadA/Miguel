/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newproject;

/**
 *
 * @author Student
 */
public class NewProject {

    public static double power(double base, int exponent) {
        
        double result = base;
        
        for(int x = 1; x < exponent; x++) {
            result = result*base;   
        }
        return result;
    }

    public static void main(String[] args) {
        double x = power(4, 3);
        System.out.println(x);
    }
}
