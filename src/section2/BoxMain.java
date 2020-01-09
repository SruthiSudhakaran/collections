package section2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BoxMain {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       Set<Box> s=new HashSet<Box>();
       System.out.println("enter the number of box");
       int n=sc.nextInt();
       for (int i = 0; i < n; i++) {
        System.out.println("Enter the Box "+(i+1)+" details");
        System.out.println("Enter length");
        double length=sc.nextDouble();
        System.out.println("Enter Width");
        double width=sc.nextDouble();
        System.out.println("Enter Height");
        double height=sc.nextDouble();
        Box b=new Box(length, width, height);        
        b.setVolume(length,width,height);
        s.add(b);
        }
       System.out.println("Unique in the Set are");
       for (Box box : s) {
        System.out.println(box);
    }
       sc.close();
    }

}
