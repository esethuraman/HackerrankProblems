package main.Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoStrings {

	public static void main(String[] args) throws IOException {
		int t;
		String s1, s2;
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		t = Integer.parseInt(in.readLine());

		for(int k = 0; k < t; k++){
			s1 = in.readLine();
			s2 = in.readLine();
			String status = "NO";
			
			for(char i = 'a'; i <= 'z'; i++){
				char tmp[] = {i};
				CharSequence cq = java.nio.CharBuffer.wrap(tmp);
				if(s1.contains(cq) && s2.contains(cq)){
					status = "YES";
					break;
				}
			}
			System.out.println(status);
		}
	}

}
