package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("iveskite 5 zodzius: ");

        Scanner skaneris = new Scanner(System.in);

        String[] Zodziai = new String[5];

        for (int i= 0; i<5; i++) {
            String zodis1 = skaneris.nextLine();
            Zodziai[i]=zodis1;
        }
        for (int a = 0; a <5; a++){
            System.out.println(Zodziai[a]);
        }
    }
}
