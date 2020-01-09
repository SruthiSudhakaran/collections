package section1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class SortScore {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> team = new ArrayList<Integer>();
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int score = sc.nextInt();
            team.add(score);
        }
        Collections.sort(team);
        Iterator i = team.iterator();
        while (i.hasNext()) {
            Integer ii = (int) i.next();
            System.out.println(ii);
        }
        sc.close();

    }

}
