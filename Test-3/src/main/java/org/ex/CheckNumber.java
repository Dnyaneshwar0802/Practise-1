import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int permanantNumber=100;
        System.out.println("Enter the number");
        int userNum=sc.nextInt();
        if(permanantNumber==userNum){
            System.out.println("Number is Equal");
        }else if(permanantNumber>userNum){
            System.out.println("Entered Number is Less than System Number");
        } else {
            System.out.println("Entered Number is bigger than System Number");

        }

    }
}
