package com.example.classiannidate;

//import classi da un jar
import com.example.mieClassi.Pluto;
import Esercizio.Motorino;



public class Test {

    public static void main(String[] args) {
        Pluto p= new Pluto();
        Motorino m= new Motorino(3.4f,"","");



        Pippo.InnerStatic i= new Pippo.InnerStatic(4,3);
        i.somma();


        //Istanziare oggetto classe Inner
        Pippo pippo= new Pippo();
        Pippo.Inner v = pippo.new Inner();

        Object pera = new Object();
        pera= new Object();
        pera= new Object();
        pera= new Object();





    }


}
