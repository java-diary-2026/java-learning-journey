package method.Test;

public class Test1 {
    static void main(String[] args) {
        double area1 = getarea(5.7, 1.7);
        double area2 = getarea(3.8, 2.9);
        if (area1 > area2) {
            System.out.println("第一个长方形更大");
        } else {
            System.out.println("第二个长方形更大");
        }
    }

    static double getarea(double width, double len) {
        double area = width * len;
        return area;

    }
}

// day03: Java 基础语法学习 - 已推送到 GitHub
//2026.6.29 - 学习了commit规范