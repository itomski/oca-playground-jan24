package de.lubowiecki.exceptions;

public class ExceptionTest4 {

    public static void main(String[] args) {

        System.out.println(doSomething(10, 5));

        try {
            int i = Integer.parseInt("abc");
            //int i = 5/0;
        }
        catch(Exception e) {
            if(e instanceof NumberFormatException)
                throw e;

            System.out.println("Problem");
        }
    }

    static int doSomething(int a, int b) {
        int res = 0;

        try {
            res = a / b;
            return res;
        }
        finally {
            res++;
            // verändert das return aus dem try
            return res; // return ist optional
        }
    }
}
