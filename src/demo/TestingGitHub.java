package demo;

public class TestingGitHub {

	public static void main(String[] args) {

		
		
		
		String name = "AshokRavi Pandranki";
		String reverse = "";
		
		for(int i =name.length()-1; i>=0;i--) {
			reverse = reverse + name.charAt(i);
			
		}
		System.out.println(reverse);
		
		StringBuffer sb = new StringBuffer(name);
		
		System.out.println(sb.reverse());
	}

}
