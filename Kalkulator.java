package org.example;

import java.util.Scanner;

public class Kalkulator {

// Napisz program, który odczytuje od użytkownika dwie liczby oraz znak działania,
//     a następnie oblicza i wyświetla wynik. Program powinien wspierać dodawanie, odejmowanie,
//     mnożenie i dzielenie. Wynik powinien być przedstawiany w formie A + B = C, np 2 + 2 = 4.
 public static Integer getNumber1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe calkowita");
        int number1 = scanner.nextInt();
        return number1;
    }
    public static Integer chose() {
        String[] operations = new String[]{"1 - DODAWANIE", "2 - ODEJMOWANIE", "3 - MNOZENIE", "4 - DZIELENIE"};
        System.out.println("Wybierz operacje sposrod podanych:");
        for (int i = 0; i < operations.length; i++){
            System.out.println(operations[i]);}
        Scanner scanner2 = new Scanner(System.in);
        int operation = scanner2.nextInt();
        return operation;
    }
 public static Integer countNumber(Integer operation, Integer number1, Integer number2) {
    if (operation==1){
        Integer a =number1+number2;
        return a;}
    else if (operation==2) {
        Integer a  =number1-number2;
        return a;}
    else if (operation==3) {
        Integer a  =number1*number2;
        return a;}
    else if (operation==4 && number1!=0 && number2!=0) {
        Integer a  =number1/number2;
        return a;}
        return null;}
    public static String chooseChar(Integer operation) {
        if (operation==1){
            String a = "+";
            return a;}
        else if (operation==2) {
            String a = "-";
            return a;}
        else if (operation==3) {
            String a = "*";
            return a;}
        else if (operation==4) {
            String a = "/";
            return a;}
        return null;}

    public static void main(String[] args) {
        Integer number1=getNumber1();
        Integer number2=getNumber1();
        Integer userChose = chose();

        Integer result = countNumber(userChose, number1, number2);

        String resultAsString = Integer.toString(result);
        var resultChar = chooseChar(userChose);
        String messageConcatenated = number2 + " " + "= " + resultAsString;
        System.out.println(number1+resultChar + messageConcatenated );
    }
}
