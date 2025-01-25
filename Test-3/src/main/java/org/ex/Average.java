package org.ex;


public class Average {
    static void avg() {
        int a=20,b=30,c=40,d=10,e=20;
        int add=a+b+c+d+e;
        int 	AVG=add/5;
        System.out.println("Average is =="+AVG);

    }
    int fiveAvg(int v,int w ,int x,int y,int z) {
        int sum=v+w+x+y+z;
        int div=sum/5;
        return div;
    }
    public static void main(String[] args) {
        avg();
        Average average=new Average();
        int AS=average.fiveAvg(10, 10, 10, 10, 10);
        System.out.println("Average is =="+AS);
    }
}

