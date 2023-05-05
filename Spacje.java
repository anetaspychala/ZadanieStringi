package org.example;


/**
 * Hello world!
 *
 */
public class Spacje {

    //Odkurzacz do spacji: napisz program, który oczyszcza dany tekst ze wszystkich nadmiarowych spacji,
    // pozostawiając tylko pojedyncze między słowami. Np Ala   ma           kota                 -> Ala ma kota
    public static void main(String[] args) {
        String text = "Ala  ma              kota";
        String textAfterRemoveSpaces = text.replaceAll(" +", " ");
        System.out.println(textAfterRemoveSpaces);
    }}













