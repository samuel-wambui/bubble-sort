//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
 static int [] nums = { 8,2,1,4,5,6,3};
 static int size = nums.length;
 static int temp=0;
 public static void bubbleSort(){
     for(int i=0;i<size;i++){
         for(int j=0;j<size-i-1;j++){
             if(nums[j]>nums[j+1]){
                 temp=nums[j];
                 nums[j]= nums[j+1];
                nums[j+1] = temp;

             }

             }
         }

 }


    public static void main(String[] args) {
        bubbleSort();
        System.out.println("Sorted array:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

