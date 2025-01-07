import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class MaxNumber {

    //UC2

    public float testMax(float num1, float num2, float num3) {
        float max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        return max;
    }//UC1
    public int testMax(int num1, int num2, int num3) {
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        return max;
    }
}
class MaxString {
    public String testMax(String str1, String str2, String str3) {
        String max = str1;
        if (str2.compareTo(max) > 0) {
            max = str2;
        }
        if (str3.compareTo(max) > 0) {
            max = str3;
        }
        return max;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
/*
        System.out.print("Enter the first number: ");
        float num1 = scanner.nextFloat();

        System.out.print("Enter the second number: ");
        float num2 = scanner.nextFloat();

        System.out.print("Enter the third number: ");
        float num3 = scanner.nextFloat();

        MaxNumber maxObj = new MaxNumber();
        float maxi = maxObj.testMax(num1, num2, num3);
        System.out.println("Maximum number is " + maxi);
*/
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        System.out.print("Enter the third string: ");
        String str3 = scanner.nextLine();

        MaxString maxObj = new MaxString();
        String maxString = maxObj.testMax(str1, str2, str3);
        System.out.println("Maximum string is: " + maxString);
        scanner.close();
    }
}