package org.ex;

public class ProductException extends RuntimeException {
    public ProductException() {
        System.out.println("Default");
    }
    ProductException(String msg){
        super(msg);
    }
}
