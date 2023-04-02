package ArrayEasy;

import java.util.Arrays;

//        Initially sort the given array. And declare a variable to store the minimum difference, and initialize it to INT_MAX. Let the variable be min_diff.
//        Find the subarray of size m such that the difference between the last (maximum in case of sorted) and first (minimum in case of sorted) elements of the subarray is minimum.
//        We will run a loop from 0 to (n-m), where n is the size of the given array and m is the size of the subarray.
//        We will calculate the maximum difference with the subarray and store it in diff = arr[highest index] – arr[lowest index]
//        Whenever we get a diff less than the min_diff, we will update the min_diff with diff.
public class ChocolateDistribution {
    static int findMinDiff(int arr[], int n, int m) {
        // if there are no chocolates or
        // number of students is 0
        if (m == 0 || n == 0)
            return 0;
        // sort the given packets
        Arrays.sort(arr);

        // number of students cannot be
        // more than number of packets

        if (n < m)
            return -1;

        // largest number of  chocolates
        int min_diff = Integer.MAX_VALUE;

        // Find the subarray of size m
        // such that difference between
        // last (maximum in case of
        // sorted) and first (minimum in
        // case of sorted) elements of
        // subarray is minimum.
        for (int i = 0; i + m - 1 < n; i++) {
            int diff = arr[i + m - 1] - arr[i];
            if (diff < min_diff)
                 min_diff= diff;
        }
        return min_diff;
    }
    public static void main(String[] args) {
 int[] arr = { 12, 4,  7,  9,  2,  23, 25, 41, 30,
                40, 28, 42, 30, 44, 48, 43, 50 };
    int m =7;
    int n = arr.length;
        System.out.println("Min difference is "+ findMinDiff(arr,n,m));
    }
}
