package Chapter2_String;

public class Chapter2_String {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5.1
		{
		String str = "표현할 문자";
		String emptyString= "";
		String escapeChars = "그가  \"자바7은 새로운 변화다\" 라고 말했다.";
		String escapeChars2 =" 가 \\나\t다 \n 라 \r 마  \' ";
		String title = "자바7" + " 프로그래밍";
		String auther = "최범균";
		String display = title + "," + auther;
		int numberOfVotes = 430;
		String message = "투표수:" + numberOfVotes;
		
		System.out.println(str);
		System.out.println(emptyString);
		System.out.println(escapeChars);
		System.out.println(escapeChars2);
		System.out.println(title);
		System.out.println(display);
		System.out.println(message);
	}{
		//5.2
		String str = "자바 7 프로그래밍";
		String str2 = str.substring(3);
		String str3 = str.substring(3,7);
		int length = "자바 7 프로그래밍".length();
		String someCode ="somecode";
		int beginIndex= someCode.length()-3;
		String last3chars = someCode.substring(beginIndex, someCode.length());
				
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println("길이 = " + length);
		System.out.println(someCode);
		System.out.println(beginIndex);
		System.out.println(last3chars);
		
		
		
	}

}
}