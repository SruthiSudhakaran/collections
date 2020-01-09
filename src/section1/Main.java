package section1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Player> list=new ArrayList<Player>();
        System.out.println("Enter the number of players");
        int n=sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the player name");
            String name=sc.nextLine();
            System.out.println("Enter the country name");
            String country=sc.nextLine();
            System.out.println("Enter the skill");
            String skill=sc.nextLine();
            Player p=new Player(name, country, skill);
            list.add(p);
        }
        PlayerBO pbo=new PlayerBO();
        pbo.displayAllPlayerDetails(list);
        sc.close();

    }

}
