package org.example.MajorityElement;

import java.util.Arrays;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int counter = 0;
        int freq = 0;

        for (int num : nums) {
            if (counter == 0) {
                freq = num;
            }

            if (num == freq) {
                counter++;
            } else {
                counter--;
            }
        }

        return freq;
    }


    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2};
        System.out.println(majorityElement(nums));
    }
}
