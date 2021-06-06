package activites;

import java.util.ArrayList;

public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
		al.add("tom");
		al.add("Jerry");
		al.add("Nikki");
		al.add("boom");
		al.add("chita");
		System.out.println("The values in the list is");
		for(String s:al)
		{
			System.out.println(s);
		}
		
		System.out.println("The third value is="+al.get(2));
		System.out.println("Check the name="+al.contains("boom"));
		System.out.println("The values in the list is="+al.size());
		System.out.println("Remove the Jerry from list is="+al.remove(1));
		System.out.println("After the  remove values in the list is");
		for(String s:al)
		{
			System.out.println(s);
		}

	}

}
