package classworks;

public class question1 {
    public static int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        for (int i=0;i<n;++i) {
            for (int j=i+1; j<n;++j) {
                if (nums[i]+nums[j]==target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int []arr={2,7,11,18};
        int target=9;
        for (int i:twoSum(arr,target))
        System.out.println(i);
    }
}


