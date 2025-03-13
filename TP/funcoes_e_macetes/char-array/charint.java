public class Main {
    
	public static void main(String[] args) {
		
		String str = "abbcdaefc";
		
		int[] arr = new int[127];
		
		for(int i = 0; i < str.length(); i++) {
		    
		    arr[str.charAt(i)]++;
		}
		
		for(int i = 0; i < str.length(); i++) {
		    
		    System.out.print(str.charAt(i) + " - ");
		    System.out.println(arr[str.charAt(i)]);
		}
	}
}