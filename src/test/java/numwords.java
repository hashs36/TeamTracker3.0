import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class numwords {

	public static void main(String[] args) throws IOException {
		numwords n = new numwords();
		//n.wordsinstr();
		//n.initials();
		//n.ans();
		//n.readfile();
		n.searchstr();		}
	
	
	public void searchstr() throws IOException {
		// search a string in a file
	// taking input from user	
		String st ;
		boolean b=false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string which need to find ");
		st=sc.next();
		BufferedReader reader = new BufferedReader(new FileReader("C:/harish_misc/231120.txt"));
		Scanner s = new Scanner(reader);
		while (s.hasNext()) {
			if (st.equals(s.next())){
				System.out.println("found enter string ::"+st );
				 b=true;
				break;
			}}
		if (b==false) 
			System.out.println("String not found  in file");
		
		
	}
	public void wordsinstr() {
		// find  numbers of  words present in given string 
		Scanner sc = new Scanner(System.in)	;
		String s;
		boolean b=false;
		System.out.println("Enter string");
		s=sc.nextLine();
		String wds[] = s.split("\\s");
		System.out.println(wds.length);
		for( String wd : wds) {
			System.out.println(wd);	
		}
		
	}
	public void readfile() {
		/// from file find lines count,word count and  characters count
		int lines =0;
		int words =0;
		int cht = 0;
		BufferedReader Reader = null;//new BufferedReader("C:\harish_misc\231120.txt");
		try {
			Reader = new BufferedReader(new FileReader("C:/harish_misc/231120.txt"));
			try {
				String line=Reader.readLine();
				while (line!=null) {
					lines=lines+1;
					
				String[] wd = line.split(" ")	;
				words=words+wd.length;
										
				for (String w:wd )	{
					cht=cht+w.length();
					}
				line=Reader.readLine();	
				}
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("lines in the file is"+lines);
		System.out.println("words in the file is"+words);
		System.out.println("characters in the file is"+cht);
	}
	
	public void initials() {
		//Extract the first character of given words
		Scanner sc = new Scanner(System.in)	;
		String s;
		System.out.println("Enter string");
		s=sc.nextLine();
		String wds[] = s.split("\\s");
		for (String initial : wds) {
			System.out.println(initial.charAt(0));
		}
	}
	
	public void ans() {
		// find the character type in a given string 
		Scanner sc = new Scanner(System.in)	;
		String s;
		System.out.println("Enter string");
		s=sc.nextLine();
		int num=0;
		int alpha = 0;
		int spec = 0;
		for(int i=0;i<s.length();i++) {
		char	c=s.charAt(i);
			if (Character.isAlphabetic(c)) {
				alpha= alpha+1;
						
			}else if (Character.isDigit(c)) {
				num=num+1;
			}else
			{
				spec=spec+1;			
		}
					
	}System.out.println("number of alphbets in given string::"+alpha);
	System.out.println("number of digits in given string::"+num);
	System.out.println("number of special charaters in given string::"+spec);
		
	}}
