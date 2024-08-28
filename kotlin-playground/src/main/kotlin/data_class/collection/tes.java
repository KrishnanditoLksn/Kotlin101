package data_class.collection;

public class tes {
    public static void main(String[] args) {
        int [] array = {-2,-1,-1,1,2,3};
        System.out.println(maximumCount(array));
    }

    public static  int maximumCount(int[] nums) {
        int pos = 0, neg = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > 0) {
                pos++;
            }
            if (nums[i] < 0) {
                neg++;
            }

        }

        return pos;
    }
}
