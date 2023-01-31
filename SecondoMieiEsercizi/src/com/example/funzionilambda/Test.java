package com.example.funzionilambda;

public class Test {

    public static void main(String[] args) {


        FirstInterface f = () -> System.out.println("hello world");
        SecondInterface s = (firstString, secondString) -> firstString.equals(secondString);
        SecondInterface c = (a,b) -> {
            boolean bool = a.equals(b);
            return bool;
        };

        c.areEquals("bau","miao");


        if (s.areEquals("ciao", "ciao")) {
            System.out.println("Le due stringhe sono uguali");
        }

        ThirdInterface t = num -> {
            int i = 2;
            int a = i + num;
            return a;
        };

        int valore= 4;
        System.out.println ("\nvalore = "+valore+"\nvalore + 2 = "+t.plus2(valore));


        ThirdInterface x = num -> {
            int i = 2;
            int a = i + num;
            return a;
        };

        int mioValore=4;
        Pippo oggetto = new Pippo();
        oggetto.funzioneProva((a)-> a+2,mioValore);

    }



}
