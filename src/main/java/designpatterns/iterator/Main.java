package designpatterns.iterator;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList al = new ArrayList<String>();
        al.add(100);
        al.add(true);
        al.add("Hello");
        System.out.println(al.toString());
        int[] values = new int[] {1, 2, 4, 5};
        Container c = new Container(values);
        while (c.hasNext()){
            int n = c.next();
            System.out.println(n);
        }
    }

}