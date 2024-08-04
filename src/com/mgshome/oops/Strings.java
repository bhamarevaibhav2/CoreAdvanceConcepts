package logical_basic;

public class Strings {

	public static String revstr1(String str) {

		char ch[] = str.toCharArray();
		int arrlength = ch.length;
		String revstr = "";
		for (int i = 0; i < arrlength; i++) {
			char cha = ch[i];
			revstr = cha + revstr;
		}
		return revstr;
	}

	public static String revstr2(String str) {
		String revstr = "";
		for(int i=0; i< str.length();i++)
		{
			char ch = str.charAt(i);
			revstr = ch+revstr;
		}
		return revstr;
	}

	public static void main(String[] args) {

		// immutable means we cant change it or cant do the operations like add remove element
		String str = "H"; // literal in string pool
		str = "E"; 
		System.out.println(str);//output E

		// mutable but not thread safe
		StringBuilder st = new StringBuilder("H"); // object in heap
		st.append("E"); //HE

		// mutable but thread safe
		StringBuffer sf = new StringBuffer("sd");

		sf.append("sr");

		System.out.println(sf); // sdsr

		String revsstrwithconvertstringtoarr = revstr1("Hello World");
		String revsstrwithdirect = revstr2("welcome");

		System.out.println(revsstrwithconvertstringtoarr);
		System.out.println(revsstrwithdirect);
		System.out.println("-------------------------------------------");
		
	}

}
