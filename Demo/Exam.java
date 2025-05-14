public class Exam {
    public static void main(String[] args) {
        int[]arr = {5,4,3,2,1};
        int max_elem = arr[0];
        int min_elem = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max_elem < arr[i]) {
                max_elem = arr[i];
            } 
            if (min_elem > arr[i])  {
                min_elem = arr[i];
            }
        }
        System.out.println("Maximum element of the array is : " + max_elem);
        System.out.println("Minimum element of the array is : " + min_elem);
    }
}
