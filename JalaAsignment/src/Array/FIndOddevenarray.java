package Array;

public class FIndOddevenarray {
	public static void main(String[] args) {
		
	
int arr[]= {1,2,3,4,5,6,7,8,9,10,11,12};
System.out.print("Even numbers are");

for(int i=0; i<arr.length; i++) {
	if(i%2==0) {
		System.out.print(arr[i]);
	}
	
}	
System.out.println("odd numbers are");
for(int i=0; i<arr.length; i++) {
	if(i%2 !=0) {
		System.out.print(arr[i]);
	}
}
	
	

}
}