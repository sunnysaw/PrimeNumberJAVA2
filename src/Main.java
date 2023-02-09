import java.util.Scanner;
/*
Question : Write a program to check whether the number is prime or not.
 */
public class Main {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for checking prime or not :");
        int a = sc.nextInt();
        for (int i = 2; i <= a; i++){
            if (a % i == 0){
                count++;
            }
        }
        if (count == 1){
            System.out.println("Given number is a prime number : " + a);
        }else
            System.out.println("Given number is not a prime number : " + a);
    }
}