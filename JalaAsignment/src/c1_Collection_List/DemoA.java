package c1_Collection_List;

import java.util.ArrayList;

public class DemoA {
public static void main(String[] args) {
	ArrayList<Integer>al=new ArrayList<Integer>();
     al.add(10);
     al.add(12);
     al.add(22);
     al.add(22);
     al.add(44);
     al.add(33);
     System.out.println(al.size());


for(int i=0; i<al.size(); i++) {
	System.out.println(al.get(i));
	
}
for (Integer object : al) {
	System.out.println(object);
}
}
}
