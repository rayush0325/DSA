import java.util.Scanner;
public class ReversalRotation {
    static void reverseArray(int[] arr,int beg, int end){
        while(beg<end){
            int temp=arr[beg];
            arr[beg]=arr[end];
            arr[end]=temp;
            beg++;
            end--;
        }
    }
    static void rotateArray(int[] arr, int d){
        reverseArray(arr,0,d-1);
        reverseArray(arr,d,arr.length-1);
        reverseArray(arr,0,arr.length-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("array size :");
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<arr.length;i++){
            System.out.print("element no. :");
            arr[i]=sc.nextInt();
        }
        System.out.println("your array");
        for(int element:arr){
            System.out.print(element+" ");
        }
        System.out.print("enter length to rotate :");
        int d=sc.nextInt();
        sc.close();
        rotateArray(arr, d);
        System.out.println("\narray after rotation");
        for(int element: arr){
            System.out.print(element+" ");
        }
    }
}
