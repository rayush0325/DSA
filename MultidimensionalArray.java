public class MultidimensionalArray {
    public static void main(String[] args) {
        int[][][] arr=new int[3][][];
        //now we have a memory for an array that can hold 3 objects, for now this array has null values
        arr[0]=new int[2][];
        //now we have memory for array at 0th index of 1st level array that can hold 2 objects
        arr[0][0]=new int[1];
        //now we have memory for array at 0th index of 2nd level array that can hold 1 objects
    }
}
