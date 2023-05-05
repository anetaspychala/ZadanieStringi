package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Palindromy {
    //Analiza stringów: napisz program, który sprawdza, czy dany string jest palindromem (odczytuje się go tak samo od przodu, jak i od tyłu, np Anna),
// heterogramem (żadna litera się nie powtarza, np Mateusz), pangramem (zawiera wszystkie litery alfabetu łacińskiego,
// np The quick brown fox jumps over a lazy dog), oraz, czy dane dwa stringi są anagramami (składają się z tych samych liter, np Tom Marvolo Riddle - I am Lord Voldemort)
    public static String scanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj slowo");
        String name = scanner.nextLine();
        return name;
    }

    //PALINDROM
    public static Boolean palindrom(String name) {
        String reversed = new StringBuilder(name).reverse().toString();
        if (name.equals(reversed)) {
            return true;
        } else {
            return false;
        }
    }

    //Heterogram
    public static Boolean heterogram(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        String sortedStr = new String(charArray);
        for (int i = 0; i < sortedStr.length(); i++) {
            Character firstLetter = sortedStr.charAt(i);
            Character secondLetter = sortedStr.charAt(i + 1);
            if (firstLetter != secondLetter) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

    //ANAGRAM
    public static Boolean anagram(String word1, String word2) {
        char[] charArray1 = word1.toCharArray();
        Arrays.sort(charArray1);
        String sortedword1 = new String(charArray1);
        char[] charArray2 = word2.toCharArray();
        Arrays.sort(charArray2);
        String sortedword2 = new String(charArray2);
        if (sortedword1.equals(sortedword2)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String user = scanner();
        if (heterogram(user)) {
            System.out.println("Podane slowo jest heterogramem");
        } else if (palindrom(user)) {
            System.out.println("Podane slowo jest palindromem");
        } else {
            System.out.println("Podane slowo nie jest heterogramem ani palindromem");
        }
        System.out.println("Zadanie z anagramem");
        String user2 = scanner();
        String user3 = scanner();
        if (anagram(user2, user3)) {
            System.out.println("Podane slowa sa anagramem");}
            else {
                System.out.println("Podane slowa nie sa anagramem");
            }
        }
    }
