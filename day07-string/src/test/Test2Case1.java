package test;

public class Test2Case1 {
    static void main(String[] args) {
        String strA = "abcde";
        String strB = "ABC";

        boolean result = check(strA, strB);
        System.out.println(result);


    }

    public static String rotate(String strA){
        char first = strA.charAt(0);
        String end = strA.substring(1);
        return end + first;
    }

    public static boolean check(String strA,String strB){
        for (int i = 0; i < strA.length(); i++) {
            strA = rotate(strA);
            if(strA.equals(strB)){
                return true;
            }
        }
        return false;
    }
}
