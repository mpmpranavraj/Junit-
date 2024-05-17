package junit2;

public class ReverseString2 {
	public String reverseString(String str) {
		char [] charArray = str.toCharArray();
		int left = 0;
		int right =charArray.length -1;
		
		while (left < right) {
			char temp = charArray[right];
			charArray[right] = temp;
			
			left++;
			right--;
		}
		return new String(charArray);
		
	}

}
