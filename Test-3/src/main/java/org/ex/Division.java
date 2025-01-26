package org.ex;


public class Division {

    int div(int x,int y) { //passing argument

        int d=x/y;
        return d;
    }
    int divisions()
    {
        int a=5;
        int b=10;
        int div=a/b;
        return div;

    }
    static void divide() {
        int x=20;
        int y=30;
        System.out.println("Divide=="+(x/y));
    }
    public static void main(String[] args) {
        Division division=new Division();
        int A=division.div(90,30);
        System.out.println("Division is =="+A);
        //Not passing parameters
        int b=division.divisions();
        System.out.println(" Div is =="+b);
        divide();
    }
}


