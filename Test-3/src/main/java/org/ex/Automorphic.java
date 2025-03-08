package org.ex;


public class Automorphic {
    static void check(int N) {
        int sq=0,M=N,count=0,X=1,Z=N;
        sq=N*N;
        for(int i=0;i<=N;i++) {
            if(M>0)
            {
                M=M/10;
                count++;  //154 means 3 it count
            }
        }
        for(int j=1;j<=count;j++) {
            X=X*10; //for 3 it gives 100
        }
        Z=sq%X;
	/*	System.out.println(sq);
		System.out.println(Z);
		System.out.println(N);
		System.out.println(X);*/
        if(N==Z) {
            System.out.println("Number is Automorphic");
        }
        else {
            System.out.println("Number is not Automorphic ");
        }
    }
    public static void main(String[] args) {
        check(25);
    }
}
