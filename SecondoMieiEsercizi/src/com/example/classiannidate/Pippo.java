package com.example.classiannidate;

public class Pippo {

    public int numero;

    public void metodo() {
        System.out.println("hello world");
    }

    public class Inner {
        public void prova() {
            numero = 3;
            metodo();
        }
    }


    public static class InnerStatic {
        private int first, second;

        public InnerStatic(int first, int second) {
            this.first = first;
            this.second = second;
        }

        public int somma(){
            return first+second;
        }
    }

    public void secondoMetodo() {
        int a = 2;
        final int val = 3;

        class Local {

            public void x() {
                metodo();
                numero = 4;
                System.out.println(val);
            }
        }

        Local c = new Local();
    }

}
