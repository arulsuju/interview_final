package org.codelity.mutiplechoice;
import java.io.*;
public class New {
	public static void main(String args[]) {
		String s;
		try {
			FileReader fr=new FileReader("input.txt");
			BufferedReader br=new BufferedReader(fr);
			while((s=br.readLine())!=null) {
				System.out.println(s);
				//br.flush();
				
			}
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
