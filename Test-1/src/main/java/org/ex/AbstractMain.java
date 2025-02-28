package org.ex;

public abstract class AbstractMain {
    //beacause of X1 method this class is abstract
        abstract void x1(); //abstract method dont have body
        //Beacause of this method this class is abstract
        static {
            System.out.println("this is static block");
        }
    AbstractMain(){
            System.out.println("This is abstract method Constrctor");
        }
        abstract void x2();
        void x3() {//method with body is called as concrete method
            System.out.println("This is concrete method");
        }
        public static void main(String[] args) {
            //Main main=new Main(); //Abstract class can't create object
        }


}
