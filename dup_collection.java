//Assignment 9.2
package java_session9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class dup_collection {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		char ch ;
		String name,temp=null;;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		ArrayList<String> al = new ArrayList<String>();
		ArrayList<String> al1 = new ArrayList<String>();
		
		System.out.println("Want to enter the name(Y/N)");
		ch=sc.next().charAt(0);
		
		if(ch=='y'||ch=='Y')
		{
			do{
				System.out.println("Enter the names to be added");
				name=br.readLine();
				al.add(name);
				System.out.println("Want to enter the name(Y/N)");
				ch=sc.next().charAt(0);
			}while(ch=='y'||ch=='Y');
		}
		
					
		
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			temp=(String) it.next();
			if(al1.contains(temp))
			{
				continue;
			}
			else
			{
				al1.add(temp);
			}
		}
		
		
	}

}
