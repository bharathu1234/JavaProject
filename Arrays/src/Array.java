
public class Array {
	
	public static void main(String[] args) {
		int[] array1 = {1,2,3,4,5};
		int[] array2 = new int[10];
		
		System.arraycopy(array1, 0, array2, 0, 5);
		
		System.out.println("Array 1 : ");
		
		for(int value:array1) {
			System.out.print(value + " ");
		}
		
		System.out.println(" ");
		System.out.println("Array 2 : ");
		
		for(int value:array2) {
			System.out.print(value + " ");
		}
		
	}

}
