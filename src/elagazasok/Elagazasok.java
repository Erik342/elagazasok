/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package elagazasok;

import java.util.Scanner;


/**
 *
 * @author zirkl
 */
public class Elagazasok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int szam = 5;
        if (szam >=0)
            System.out.println("A szam pozitiv!");
      
        else
            System.out.println("A szám negatív");
        
        boolean feltetel = (szam >=0);
        if(feltetel) {
            System.out.println("A szám negatív");
        }
           else {
                   System.out.println("A szam pozitiv");
                 }
        System.out.println("Kerek egy szamot!");
        Scanner be =new Scanner(System.in);
        int a = be.nextInt();
        System.out.println("Kerek egy masik szamt!");
        int b = be.nextInt();
        if (a<b) {
            System.out.printf("A %d nagyobb, mint %d", b, a);
        }
        else {
            System.out.printf("A %d nagyobb ,mint %d",a,b);
        }
        
        
        }
    }

               
     