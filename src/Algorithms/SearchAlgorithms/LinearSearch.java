package Algorithms.SearchAlgorithms;

public class LinearSearch {
    public static void main(String[] args) {
        System.out.println(linearSearch(new int[]{1,2,3,4,5,6}, 6));
    }

    /***
     * Linear Search on numbers array. Time complexity is O(n).
     * @param numbers array of numbers
     * @param target target to find in the array
     * @return array index
     */
    private static int linearSearch(int[] numbers, int target){
        int index = 0;
        for (int number : numbers){
            if(number == target)
                return index;
            index++;
        }
        return -1;
    }
}
