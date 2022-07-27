
public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = 0;
        int last = nums.length - 1;
        int a[] = new int[2];
        int mid = (first + last) / 2;
        while (first <= last) {
            if (nums[mid] < target) {
                first = mid + 1;
            } else if (nums[mid] == target) {

                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        if (first > last) {
            a[0] = -1;
            a[1] = -1;
            return a;
        }
        a[0] = mid;
        a[1] = mid;
        if (nums.length == 2) {
            if (nums[0] == target)
                a[0] = 0;
            if (nums[1] == target)
                a[1] = 1;
            return a;
        }

        int l1 = mid - 1;
        int l2 = mid + 1;
        while (l1 >= 0) {

            if (nums[l1] == target) {
                a[0] = l1;
                l1--;
            }
            if (nums[l2] == target) {
                a[1] = l2;
                l2++;
            }
            if (l2 >= nums.length)
                break;

            if (nums[l1] != target && nums[l2] != target)
                break;

        }
        return a;
    }

    // public static void main(String[] args) {
    // Solution obj = new Solution();
    // int a[] = { 1, 2, 2 };
    // int c[] = obj.searchRange(a, 2);
    // for (int i = 0; i < c.length; i++)
    // System.out.print(c[i] + "\t");
    // }
}