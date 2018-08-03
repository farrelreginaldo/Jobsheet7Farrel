/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobapercabangan;

import java.util.Scanner;
import javax.sound.midi.SysexMessage;

/**
 *
 * @author Farrel
 */
public class CobaPercabangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String identitas = "Muhammad Farrel Reginaldo Ahnaf / X RPL 5 / 24";
        System.out.println("Identitas : " + identitas);
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nilai a ? ");
        int a = scanner.nextInt();
        
        System.out.println("\nIF.. 1");
        if (a < 5) System.out.println("nilai kurang dari 5");
        
        System.out.println("\nIF.. 2");
        if (a == 5)
            System.out.println("nilai a = 5");
        
        System.out.println("\nIF.. 3");
        if (a > 5) {
            System.out.println("isi variable a : " + a);
            System.out.println("nilai a lebih dari 5");
        }
        
        System.out.println("\nIF..ELSE..");
        if(a < 5) {
            System.out.println("isi variabel a : " + 5);
            System.out.println("nilai kurang dari 5");
        } else System.out.println("nilai a lebih dari atau sama dengan 5");
        }
    }
    

