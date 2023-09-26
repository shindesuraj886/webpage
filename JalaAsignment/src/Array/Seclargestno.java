package Array;

public class Seclargestno {
	public static void main(String[] args) {
		int array[]= {1,3,5,6,7,9};
		int size=array.length;
		for(int i=0; i<size; i++) {
			for(int j=i+1; j<size; j++) {
				if(array[i]>array[j]) {
					int temp = array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
	System.out.println("second largest no=" +array[size-2]);
}
}