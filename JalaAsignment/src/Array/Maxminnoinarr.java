package Array;

public class Maxminnoinarr {
	public static void main(String[] args) {
	

	
	int a[]= {1,33,444,555,666,6,432};
	int max=a[0];
	int min=a[0];
	int size=a.length;
	for(int i=0; i<size; i++) {
		if(a[i]>max) {
			max=a[i];
		}
	}
System.out.println("Max no "+max);



for(int i=0; i<size; i++) {
	if(a[i]<min) {
		min=a[i];
	}
}
System.out.println("min no array"+min);


}
}