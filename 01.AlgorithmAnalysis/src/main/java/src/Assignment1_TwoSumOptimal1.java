package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment1_TwoSumOptimal1 {
    public static void main(String[] args) {
        int[] array = {20, 2, 23, 7, 9, 11};
        int target = 11;
        System.out.println(Arrays.toString(twoSumOptimalSolution_OlMe(array, target)));
    }
    public static int[] twoSumOptimalSolution_OlMe(int[] array, int targetValue) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            int potentialMatch = targetValue - array[i];
            if (list.contains(potentialMatch)) return new int[]{i, list.indexOf(potentialMatch)};
            else list.add(array[i]);
        }
        return new int[]{};
    }
}