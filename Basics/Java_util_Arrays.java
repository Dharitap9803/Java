//Write a program which will demonstrate the java.util.Arrays class methods like sort, copyOf, copyOfRange, fill, binarySearch, equals, toString etc..


import java.util.Arrays;

public class Java_util_Arrays
{
    public static void main(String[] args)
     {
        int[] numbers = {5, 3, 8, 2, 1};

        
        Arrays.sort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));

        
        int[] copy = Arrays.copyOf(numbers, numbers.length);
        System.out.println("Copied Array: " + Arrays.toString(copy));

        
        int[] rangeCopy = Arrays.copyOfRange(numbers, 1, 4);
        System.out.println("Range Copied Array: " + Arrays.toString(rangeCopy));

        
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 10);
        System.out.println("Filled Array: " + Arrays.toString(filledArray));

        
        int index = Arrays.binarySearch(numbers, 3);
        System.out.println("Index of 3: " + index);

        
        int[] numbers2 = {5, 3, 8, 2, 1};
        boolean areEqual = Arrays.equals(numbers, numbers2);
        System.out.println("Arrays are equal: " + areEqual);

        
        String arrayString = Arrays.toString(numbers);
        System.out.println("Array as String: " + arrayString);
    }
}
