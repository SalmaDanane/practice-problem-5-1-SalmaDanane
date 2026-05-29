public class PracticeProblem{
	
	public static void main(String[] args) {
		
	}
	
	public static int[] createIntArray() {
		int[] arr;
		arr = new int[5];
		for (int v1 = 0; v1 < arr.length; v1++){
		    arr[v1]= v1 + 1;
		}
		return arr;
	}

	public static String[] createArray(String v1, String v2, String v3, String v4) {
		return new String[] {v1,v2,v3,v4};
	}

	public static String getElement(int i1, String[] arr) {
		return arr[i1];
	}

	public static void replaceElement(int i1, double d1, double[] arr) {
		arr[i1] = d1 ;
	}

	
}
