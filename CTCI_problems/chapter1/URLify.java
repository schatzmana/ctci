package chapter1;

public class URLify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "www. Hello World ! .com";
		urlifyStr(str1);

	}
	
	public static String urlifyStr(String strToUrl) {
		System.out.println(strToUrl);
		char[] chars = strToUrl.toCharArray();
		
		Character whiteSp = ' ';
		
		for (int i=0; i<strToUrl.length(); i++) {
			if (whiteSp.compareTo(chars[i]) == 0){
				chars[i]='%';
			}
		}
		String newString = new String(chars);
		System.out.println(newString);
		return newString;
	}

}
