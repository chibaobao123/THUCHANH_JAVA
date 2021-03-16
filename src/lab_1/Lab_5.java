/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_1;
import java.io.*;
import java.util.*;

/**
 *
 * @author Administrator
 */
public class Lab_5 {
     
//    /**
//     * main
//     * 
//     * @param args
//     */
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("NHAP SO NGUYEN 1 : ");
        int a  = x.nextInt();
        System.out.println("NHAP SO NGUYEN 2 : ");
        int b  = x.nextInt();
        // tính USCLN của a và b
        System.out.println("USCLN của " + a + " và " + b + " là: " + USCLN(a, b));
        // tính BSCNN của a và b
        System.out.println("BSCNN của " + a + " và " + b + " là: " + BSCNN(a, b));
    }
     
//    /**
//     * Tìm ước số chung lớn nhất (USCLN)
//     * 
//     * @param a: số nguyên dương
//     * @param b: số nguyên dương
//     * @return USCLN của a và b
//     */
    public static int USCLN(int a, int b) {
        if (b == 0) return a;
        return USCLN(b, a % b);
    }
     
//    /**
//     * Tìm bội số chung nhỏ nhất (BSCNN)
//     * 
//     * @param a: số nguyên dương
//     * @param b: số nguyên dương
//     * @return BSCNN của a và b
//     */
    public static int BSCNN(int a, int b) {
        return (a * b) / USCLN(a, b);
    }
}
