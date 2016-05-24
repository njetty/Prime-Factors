import java.util.Scanner;

public class PrimeFactors {

    public static void main(String[] args) {
	// write your code here
        System.out.printf("Enter a number:");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        primeFactors(num);
    }

    public static void primeFactors(int n){
        System.out.printf("The list of Prime Factors for "+n+" are: ");
        while (n%2 == 0){
            System.out.print(2+ " ");
            n = n/2;
        }

        for (int i = 3; i < Math.sqrt(n);i+=2){
            while (n%i == 0){
                System.out.print(i+ " ");
                n = n/i;
            }
        }

        if (n>2){
            System.out.print(n);
        }
    }
}
