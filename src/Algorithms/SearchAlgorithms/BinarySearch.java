package Algorithms.SearchAlgorithms;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, 10));
    }

    /***
     * Binary Search on array of numbers. Time complexity is O(log(n)).
     * By binary search the array of numbers needs to be sorted or else unexpected
     * results may happen.
     * 
     * @param numbers array of numbers
     * @param target  to find in the array
     * @return index
     */
    private static int binarySearch(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;

        while (start <= end) {
            int middlepoint = (start + end) / 2;

            if (numbers[middlepoint] == target)
                return middlepoint;
            else if (numbers[middlepoint] < target) {
                start += 1;
            } else {
                end -= 1;
            }
        }

        return -1;
    }
}
