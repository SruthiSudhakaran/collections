package section2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CricketTournament {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<String, Long> hm=new HashMap<String, Long>();
        String playerName=null;
        Long score=null;
        System.out.println("Enter the number of players");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Enter the details of the player "+(i+1));
            playerName=sc.nextLine();
            score=sc.nextLong();
            hm.put(playerName, score);
        }
        LinkedHashMap<String, Long> l=new LinkedHashMap<String,Long>(hm);
        ArrayList<String> key=new ArrayList<String>();
        ArrayList<Long> value=new ArrayList<Long>();
        l.putAll(hm);
        for (Map.Entry<String, Long> me: hm.entrySet()) {
            key.add(me.getKey());
            value.add(me.getValue());
        }
        Long max=Collections.max(value);
        int index=-1;
        for (int i = 0; i < value.size(); i++) {
            if(max==value.get(i)) {
                index=i;
                break;
            }
            
        }
        System.out.println(key.get(index));
            sc.close();
        }

}
