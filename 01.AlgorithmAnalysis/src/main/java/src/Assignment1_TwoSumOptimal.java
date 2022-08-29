package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Assignment1_TwoSumOptimal {
    public static void main(String[] args) {
       // int[] array = new int[]{20, 2, 23, 8, 9, 11};
        int[] array = {20, 2,  23, 7, 9,11};   int target = 11;
        System.out.println(Arrays.toString(twoSumOptimalSolution(array, target)));
    }

    public static int[] twoSumOptimalSolution(int[] array, int targetValue) {
        // Complexity of the solution is O(n) but I have space complexity of O(n)
        // create hashmap
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int potentialMatch = targetValue - array[i];
            if (map.containsKey(potentialMatch)) return new int[]{i, map.get(potentialMatch)};
            else map.put(array[i], i);

        }
        return new int[]{};
    }

   /* public static int[] twoSumOptimalSolutionUmran(int[] nums, int target) {  // O(n)  Do not work

        int[] indexes = new int[2];
        ArrayList<Integer> tmp = new ArrayList<>();

        for (int num : nums) {   //copy unsorted input array to tmp ArrayList
            tmp.add(num);
        }
        Arrays.sort(nums);     // input array is sorted
        System.out.println(Arrays.toString(nums));
        for (int i = 0, j = 1; i < nums.length; i++, j++) {
            if (nums[i] > target) continue;          // target lover than current
            if (target - nums[i] == nums[j]) {                  // getting the indexes for sorted array

                indexes[0] = i;
                indexes[1] = j;
                 break;
            }
        }
        if (indexes[0]==indexes[1]) return new int[]{};
        indexes[0] = tmp.indexOf(nums[indexes[0]]);      //finding indexes for unsorted input
        indexes[1] = tmp.indexOf(nums[indexes[1]]);
        return indexes;
    }*/

}
