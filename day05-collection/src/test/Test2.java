package test;

import java.util.Scanner;

public class Test2 {
    static void main(String[] args) {
        int[] scoreArr = getScores();
        for (int i = 0; i < scoreArr.length; i++) {
            System.out.println(scoreArr[i]);
        }
        int max = getMax(scoreArr);
        int min = getMin(scoreArr);
        int sum = getSum(scoreArr);
        int avg = (sum - max - min) / (scoreArr.length - 2);
        System.out.println("选手的最终得分为:" + avg);

    }

    public static int getSum(int[] scoreArr) {
        int sum = 0;
        for (int i = 0; i < scoreArr.length; i++) {
            sum = sum + scoreArr[i];
        }
        return sum;
    }

    public static int getMax(int[] scoreArr) {
        int max = scoreArr[0];
        for (int i = 1; i < scoreArr.length; i++) {
            if (scoreArr[i] > max) {
                max = scoreArr[i];
            }
        }
        return max;
    }

    public static int getMin(int[] scoreArr) {
        int min = scoreArr[0];
        for (int i = 1; i < scoreArr.length; i++) {
            if (scoreArr[i] < min) {
                min = scoreArr[i];
            }
        }
        return min;
    }

    public static int[] getScores() {
        int[] scores = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; ) {
            System.out.println("请输入评委的打分");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100) {
                scores[i] = score;
                i++;
            } else {
                System.out.println("成绩超出了预期,继续录入,当前的i为:" + i);
            }
        }
        return scores;
    }


}
