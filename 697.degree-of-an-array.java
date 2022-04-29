/*
 * @lc app=leetcode id=697 lang=java
 *
 * [697] Degree of an Array
 */

// @lc code=start
import java.util.Arrays;

class Main {
    int k = -1;

    public int[] MostFrequency(int[] nums) {
        int a[] = new int[10];
        // int p[] = new int[10];
        int highest = nums[0];
        // int hp = 0;
        for (int i = 1; i < nums.length; i++) {
            if (highest < nums[i]) {
                highest = nums[i];
                // hp = i;
            }

        }

        for (int i = 0; i < nums.length; i++) {
            if (highest == nums[i]) {
                k = k + 1;
                a[k] = i;

            }
        }

        int MF[] = new int[k + 1];
        for (int i = 0; i < k + 1; i++) {
            MF[i] = a[i];
        }
        return MF;
    }

    public void findShortestSubArray() {
        int nums[] = { 49999, 100, 2, 100, 4, 100 };
        int range[][] = new int[2][10];
        int frequency[] = new int[10];
        for (int i = 0; i < 10; i++) {
            frequency[i] = 0;
            for (int j = 0; j < nums.length; j++) {
                // System.out.println("frequency of " + i + " at " + j + "is " + frequency[i]);
                if (i == nums[j] && frequency[i] == 0) {
                    // System.out.println("Inside if when i=" + i + " j= " + j + "with f= " +
                    // frequency[i]);
                    range[0][i] = j;
                    // System.out.println("range is= " + range[0][i]);
                    frequency[i]++;
                } else if (i == nums[j]) {
                    range[1][i] = j;
                    frequency[i]++;
                }
            }
        }
        // Testing Area
        System.out.println("Frequncies :-");
        for (int i = 0; i < 10; i++)
            System.out.print(frequency[i] + "\t");
        System.out.println("\n" + "Ranges :-");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(range[i][j] + "\t");
            }
            System.out.println();
        }
        //
        int check[] = new int[k + 1];
        check = MostFrequency(frequency);
        System.out.println("Highest Frequencies");
        for (int i = 0; i < k + 1; i++)
            System.out.print(check[i] + "\t");
        int answer[] = new int[k + 1];
        for (int i = 0; i < k + 1; i++) {
            answer[i] = range[1][check[i]] - range[0][check[i]] + 1;
        }
        Arrays.sort(answer);
        System.out.println();
        System.out.println(answer[0]);
        // return answer[0];

    }

    public static void main(String[] args) {
        Main obj = new Main();
        // int answer[] = { 1, 2, 2, 3, 1, 4, 2 };
        // System.out.println(obj.findShortestSubArray(answer));
        obj.findShortestSubArray();
    }

}
// @lc code=end
