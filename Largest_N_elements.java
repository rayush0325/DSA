public class Largest_N_elements {
    static int[] n_largest(int[] arr, int n){
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=arr[i];
        }
        for(int i=n;i<arr.length;i++){
            for(int j=0;j<n;j++){
                if(nums[j]<arr[i]){
                    nums[j]=arr[i];
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr={10, 4, 3, 50, 23, 90};
        int[] nums=n_largest(arr,3);
        for(int el: nums){
            System.out.print(el+" ");
        }
    }
}
