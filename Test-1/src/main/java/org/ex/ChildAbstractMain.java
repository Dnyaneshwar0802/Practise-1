package org.ex;

public class ChildAbstractMain extends AbstractMain{
    //extend keyword for abstract class

        @Override //write so we jnow we overriding method
        void x1() { //if 2 method abstract them we must need to implement all 2 method
            System.out.println("implement X1 in child");

        }

        @Override
        void x2() {//if we dont want to implement all method make class abstract
            System.out.println("implement X2 in child");

        }
        public static void main(String[] args) {
            ChildAbstractMain childMain=new ChildAbstractMain();
            childMain.x1();
            childMain.x2();
            childMain.x3();
        }


}
