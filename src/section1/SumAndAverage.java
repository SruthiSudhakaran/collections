package section1;

import java.util.ArrayList;
import java.util.Scanner;

public class SumAndAverage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> team = new ArrayList<Integer>();
        int sum = 0;
        float avg = 0;
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int score = sc.nextInt();
            team.add(score);
        }
        for (Object object : team) {
            sum = sum + (int) object;
        }
        System.out.println(sum);
        for (Object object : team) {
            avg=(float)sum/(float)team.size();            
        }
        System.out.printf("%.2f",avg);
        sc.close();
    }

}
