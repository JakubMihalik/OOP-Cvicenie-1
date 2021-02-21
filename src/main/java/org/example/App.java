package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Ahoj svet");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadal si slovo: " + scanner.nextLine());
    }
}
