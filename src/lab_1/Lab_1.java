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
public class Lab_1 {

//    /**
//     * @param args the command line arguments
//     */
    public static void main(String[] args) {
        // TODO code application logic here
//        System.out.println("HELLO CAC BAN!!!");     
//        System.out.println("I'M BAO");
//        System.out.println("THIS IS MY FIRST PROJECT");
        Scanner x = new Scanner(System.in);
////        
//        System.out.println("NHAP MA SINH VIEN : ");
//        String mssv  = x.nextLine();
//        System.out.println("NHAP HO TEN SINH VIEN : ");
//        String hoten  = x.nextLine(); 
//        System.out.println("NHAP TUOI : ");
//        int age  = x.nextByte();
//        System.out.println("NHAP NAM SINH : ");
//        float year  = x.nextFloat();
//        System.out.println("NHAP DIEM TRUNG BINH : ");
//        float diemtb  = x.nextFloat();
        
        // bai 4
        System.out.println("NHAP SO NGUYEN 1 : ");
        int a1  = x.nextInt();
        System.out.println("NHAP SO NGUYEN 2 : ");
        int a2  = x.nextInt();
        
        int c = a1+a2;
        int d = a1-a2;      
        int e = a1*a2;    
        float f =(float) a1/a2;
        
        System.out.println("TONG: "+c);       
        System.out.println("HIEU: "+d);
        System.out.println("TICH: "+e);
        System.out.println("THUONG: "+f);
    }
}


