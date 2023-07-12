package org.lessons.java.security;

public class PasswordGenerator {
    public static void main(String[] args) {

        String name;
        String surname;
        String favColor;
        int dayBirth;
        int monthBirth;
        int yearBirth;
        int sumBirth;

        name = "Yassine";
        surname = "Qaanabou";
        favColor = "Red";
        dayBirth = 12;
        monthBirth = 2;
        yearBirth = 2000;

        sumBirth = dayBirth + monthBirth + yearBirth;

        System.out.println(name + "-" + surname + "-" + favColor + "-" + sumBirth);

    }
}
