public class SumDoWhile {
    public static void main(String[] args) {

                int sum = 0;
                int number = 1;

                do {
                    sum += number;
                    number++;
                } while (number <= 5);

                System.out.println("The sum of integers from 1 to 5 is: " + sum);
            }
        }

