package Exception;


// Checked -Compile time Exception-
// Unchecked - Runtime Exception-


public class Demo1 {

	public static void main(String[] args) throws InterruptedException {

		//runtime
		int arr[] = { 10, 20 };
		System.out.println(arr[3]);
		
		
//		COMPILE TIME
		Thread.sleep(2000);

	}

}
