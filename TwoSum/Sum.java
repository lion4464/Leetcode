package TwoSum;

public class Sum {
    public static void main(String[] args) {
       int[] nums = {2,7,11,15};
        int target = 9;
        Sum s=new Sum();
        int[] ar=s.twoSum(nums,target);
        for (int e:ar) {
            System.out.println("e = " + e);
        }
    }

    public  int[] twoSum(int[] nums, int target) {
        int[] list =new int[2];
        if (nums.length>=2&&nums.length<=Math.pow(10,4)&&target>=-Math.pow(10,9)&&target<=Math.pow(10,9)){
            for (int i = 0; i <nums.length; i++) {
                for (int j = i+1; j <nums.length; j++) {
                    if (nums[i]+nums[j]==target){
                        list[0]=i;
                        list[1]=j;
                        break;
                    }
                }
            }
            return list;
        }
    return list;
    }

}
