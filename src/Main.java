import java.util.Scanner;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// Generic class to hold three variables of a generic type
class GenericMax<T extends Comparable<T>> {
    private T[] elements;

    public GenericMax(T... elements) {
        this.elements = elements;
    }

    public void  findMaximum() {
         findMaximum(elements);
    }


    public void findMaximum(T... elements) {
        T max = elements[0];
        for (T value : elements) {
            if (value.compareTo(max) > 0) {
                max = value;
            }
        }
        printMax(max);

    }
    public void printMax(T max) {
        System.out.println("Max Value From Print Function: " + max);
    }
}
public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        // Strings

        System.out.println("Enter strings separated by space ");
        try{
            String line = sc.nextLine();
            String[] strings = line.split(" ");

        GenericMax<String> stringMax = new GenericMax<>(strings);
        stringMax.findMaximum();
        }
        catch (Exception e){
            System.out.println("Enter Some Strings");
        }
        // Integers
        System.out.print("Enter integers separated by space : ");
        try {
            String line = sc.nextLine();
            String[] intStrings = line.split(" ");
            Integer[] integers = new Integer[intStrings.length];
            for (int i = 0; i < intStrings.length; i++) {
                integers[i] = Integer.parseInt(intStrings[i]);
            }

        GenericMax<Integer> intMax = new GenericMax<>(integers);
        intMax.findMaximum();
        }
        catch (Exception e){
            System.out.println("Error handling Please Enter Some Integers");
        }
        // Floats
        System.out.print("Enter floats separated by space : ");
        try {
            String line = sc.nextLine();
            String[] floatStrings = line.split(" ");
            Float[] floats = new Float[floatStrings.length];
            for (int i = 0; i < floatStrings.length; i++) {
                floats[i] = Float.parseFloat(floatStrings[i]);
            }

        GenericMax<Float> floatMax = new GenericMax<>(floats);
         floatMax.findMaximum();
        }
        catch (Exception e){
            System.out.println("Error Handling Please Enter Float Numbers");
        }
        sc.close();
    }
}