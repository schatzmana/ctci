package chapter1;

public class isUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String testStr = "i; like: to' :eat~";
		String testStr2 = "hello world";
		String testStr3 = "maui";
		//System.out.println( isStringUnique(testStr) );
		System.out.println( isStringUnique(testStr2) );
		
		/* 
		char x = 55;
		System.out.println(x);
		int y = 'd';
		System.out.println(y);
		*/

	}
	
	public static boolean isStringUnique (String someWord){
		int numChars = someWord.length();
		
		for (int i=0; i<numChars; i++) {
			Character current = someWord.charAt(i); 
			System.out.println(current);
			for (int j=i+1; j<numChars; j++) {
				Character next = someWord.charAt(j);
				if (current.compareTo(next)==0) {
					return false;
				}
			}
		}
		return true;
	}

}
