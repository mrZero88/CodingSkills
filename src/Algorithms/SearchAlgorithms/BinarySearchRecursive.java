package Algorithms.SearchAlgorithms;

import java.util.Arrays;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        System.out.println(binarySearchRecursive(new int[]{1,2,3,4,5,6,7,8,9,10}, 1));
    }

    /***
     * Binary Search Recursive over an array of numbers. Time complexity is O(log(n)).
     * By binary search the array of numbers needs to be sorted or else unexpected results may happen.
     * @param numbers array of numbers
     * @param target number to find in the array
     * @return true if found, false otherwise
     */
    private static boolean binarySearchRecursive(int[] numbers, int target){
        if(numbers.length == 0)
            return false;

        int midpoint = numbers.length/2;

        if(numbers[midpoint] == target)
            return true;
        else if(numbers[midpoint] < target)
            return binarySearchRecursive(Arrays.copyOfRange(numbers, midpoint+1, numbers.length),target);
        else
            return binarySearchRecursive(Arrays.copyOfRange(numbers, 0, midpoint),target);
    }
}
