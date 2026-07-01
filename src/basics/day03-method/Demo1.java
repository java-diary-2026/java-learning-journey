package method.Test;
import java.util.Scanner;
import java.util.Arrays;

public class Demo1 {
    static int[] a;
    static boolean[] used;
    static int[] path;
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n];
        used = new boolean[n];
        path = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        // 关键：先排序，保证按从小到大的顺序选择元素
        Arrays.sort(a);
        backtrack(0);
    }

    static void backtrack(int pos) {
        if (pos == n) {
            // 输出格式修正：无末尾空格
            for (int i = 0; i < n; i++) {
                if (i > 0) {
                    System.out.print(" ");
                }
                System.out.print(path[i]);
            }
            System.out.println();
            return;
        }
        // 关键：必须按 0~n-1 顺序遍历数组，才能保证字典序
        for (int i = 0; i < n; i++) {
            if (!used[i]) {
                used[i] = true;
                path[pos] = a[i];
                backtrack(pos + 1);
                used[i] = false;
            }
        }
    }
}