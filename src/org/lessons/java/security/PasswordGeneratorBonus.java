package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGeneratorBonus {
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);

        System.out.println("inserisci il tuo nome");
        String name = input.nextLine();

        System.out.println("inserisci il tuo cognome");
        String surname = input.nextLine();

        System.out.println("inserisci il tuo colore preferito");
        String favColor = input.nextLine();

        System.out.println("inserisci il giorno di nascita");
        int dayBirth = input.nextInt();

        System.out.println("inserisci il tuo mese di nascita");
        int monthBirth = input.nextInt();

        System.out.println("inserisci il tuo anno di nascita");
        int yearBirth = input.nextInt();

        int sumBirth;



        sumBirth = dayBirth + monthBirth + yearBirth;

        System.out.println(name + "-" + surname + "-" + favColor + "-" + sumBirth);

    }
}
