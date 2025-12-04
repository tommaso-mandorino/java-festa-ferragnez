package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] guests = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi",
                "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };

        System.out.print("Come ti chiami? ");
        String name = scanner.nextLine();
        scanner.close();

        boolean guestFound = false;
        int i;
        
        for (i = 0; i < guests.length; i++) {
            if (name.replaceAll(" ", "").toLowerCase().equals(guests[i].replaceAll(" ", "").toLowerCase())) {
                guestFound = true;
                break;
            }
        }

        i = 0;
        while (i < guests.length) {
            if (name.replaceAll(" ", "").toLowerCase().equals(guests[i].replaceAll(" ", "").toLowerCase())) {
                guestFound = true;
                break;
            } else {
                i++;
            }
        }

        if (guestFound) {
            System.out.println("Benvenuto/a alla festa, " + guests[i] + '!');
        } else {
            System.out.println("Ci dispiace " + name + ", ma non sei tra gli invitati della festa!");
        }

    }

}