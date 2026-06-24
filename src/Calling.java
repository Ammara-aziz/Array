import java.util.Arrays;
import java.util.Scanner;

public class Calling {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter no of elements");
        int size = sc.nextInt();

        //System.out.println("Enter Number: ");
        int[] numArray = new int[size];

        int[] summAverage = RandomChallenges.inputArray(numArray);
        for(int num : summAverage){
            System.out.println(num);
        }
        boolean isSort = RandomChallenges.isSorted(numArray);
        if(isSort){
            System.out.println("Array is sorted.");
        }
        else{
            System.out.println("Array is not sorted.");
        }
        RandomChallenges.occurences(numArray);
        RandomChallenges.RepeatingAlphabetsSummary();

        System.out.println("Enter Decimal Number to convert to Binary");
        int deci = sc.nextInt();
        System.out.println("Decimal Number - "+ deci);
        System.out.println("Binary - ");
        RandomChallenges.deciToBinary(deci);

    }
}
