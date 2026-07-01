package method.Test;

public class Test4 {
    static void main(String[] args) {
        //定义数组
        int[] arr ={13,25,34,56,25,37,95};
        boolean flag = contains(arr,13);
        System.out.println(flag);
    }

    static boolean contains(int[] arr,int number) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == number){
                return true;
            }
        }
        return false;
    }




}
