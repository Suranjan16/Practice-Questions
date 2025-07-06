public class SecondHeighestElement {
    public static void main(String[] args) {
       
        int[] arr = {10,11,12,13,14,15};

        System.out.println(findSecondMax(arr));
    }

    public static int findSecondMax(int[]a) {
        int max = a[0];
        for (int aa: a) {
            if (aa > max) {
                max = aa;
            }
        }

        int sMax = a[0];
        for(int aa : a) {
            if (aa != max && aa > sMax) {
                 sMax = aa;
            }
        }
        return sMax;
    }
}