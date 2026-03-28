package basics;

import java.lang.Math;

public class BasicMaths {

    static int countDigits(int n) {

        if (n == 0)
            return 1;

        int d = 0;
        n = Math.abs(n);
        while (n != 0) {
            n = n / 10;
            d++;
        }

        return d;
    }

    static int reverseNum(int n) {
        int reverse = 0;

        while (n != 0) {

            int tmp = n % 10;
            reverse = reverse * 10 + tmp;
            n /= 10;
        }

        return reverse;
    }

    static boolean amstrong(int a) {

        if (a < 0)
            return false;
        if (a < 10)
            return true;

        int sum = 0;
        int n = a;

        int length = countDigits(a);

        while (n != 0) {
            sum = sum + (int) Math.pow((n % 10), length);
            n /= 10;
        }

        if (sum == a)
            return true;

        return false;
    }

    static boolean isPrime(int num) {
        if (num < 1) {
            return false;
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    static int fgcd(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }

        if (a == 0) {
            return b;
        }
        return a;
    }

    public static void main(String[] args) {
        int num = 123456;
        int num2 = 121;

        System.out.println("digitl count" + countDigits(num));
        System.out.println("Reversed number " + reverseNum(num));

        if (reverseNum(num2) == num2) {
            System.out.println("yes " + num2 + " is palindrome number.");
        } else {
            System.out.println("No! " + num2 + " is palindrome number.");
        }

        if (isPrime(13)) {
            System.out.println("yes its a prime number.");
        } else {
            System.out.println("No! its not an prime number");
        }

        System.out.println("153 is amstrong : " + amstrong(153));

        System.out.println("GCD of 64 & 78 is :" + fgcd(64, 78));


        // practice questions
    }   
}