import java.util.Arrays;

public class Assignment1 {

    public static void main(String[] args) {
        int [] nums={0,1,0,3,12};
        int a=0;
        for (int i=0;i<nums.length;i++)
            if (nums[i]!=0)
                nums[a++]=nums[i];
        for (int j=a;j< nums.length;j++)
            nums[j]=0;
         for (int i=0;i<nums.length;i++)
            System.out.print(  nums[i]+" ");


    }
}
