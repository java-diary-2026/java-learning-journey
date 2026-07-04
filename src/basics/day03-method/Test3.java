package method.Test;

public class Test3 {
    static void main(String[] args) {
        int[] arr = {1,3,5,7,2,9};
        int max = getMax(arr);
        System.out.println(max);
    }

    static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
