import java.util.Scanner;
class Armstrong {
    static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            num = num/10;
            count++;
        }

        return count;
    }

    static boolean isArmstrongNumber(int num) {
        int temp = num;
        int count = countDigits(num);
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            int power = 1;
            for (int i = 0; i < count; i++) {
                power = power*digit;
            }
            sum = sum+power;
            num = num/10;
        }
        return sum == temp;
    }


    public static void main(String[] args) {
        int num = 153;
        int count = countDigits(num);
        System.out.println(count);
        isArmstrongNumber(num);
        System.out.println(isArmstrongNumber(num));
        System.out.println(issArmstrongNumber(num));

        if (issArmstrongNumber(num)) {
            System.out.println(num + " is an Armstrong Number.");
        } else {
            System.out.println(num + " is not an Armstrong Number.");
        }
    }

    // Recursive approach

    static int calculateArmSum(int num, int sum) {
        if (num == 0) {
            return sum;
        }
        int digit = num % 10;
        return calculateArmSum(num / 10, sum + (int) Math.pow(digit, (int)
                Math.log10(num) + 1));
    }
    static boolean issArmstrongNumber(int num) {
        int sum = calculateArmSum(num, 0);
        return sum == num;
    }
}
