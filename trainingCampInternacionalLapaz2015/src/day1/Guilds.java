package day1;


import java.util.ArrayList;

import java.util.Scanner;

public class Guilds {

	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
//		Deque<Integer> tambor1 = new ArrayDeque<Integer>();
//		Deque<Integer> tambor2 = new ArrayDeque<Integer>();
//		Deque<Integer> tambor3 = new ArrayDeque<Integer>();
		while (in.hasNext()) {
			
		
		ArrayList<Integer> tambor1 = new ArrayList<Integer>();
		ArrayList<Integer> tambor3 = new ArrayList<Integer>();
		ArrayList<Integer> tambor2 = new ArrayList<Integer>();
		
		
		double n = in.nextDouble();
		
	
		for (int i = 0; i < n; i++) 
			tambor1.add(in.nextInt());
		for (int i = 0; i < n; i++) 
			tambor2.add(in.nextInt());
		for (int i = 0; i < n; i++) 
			tambor3.add(in.nextInt());
		int variable = 0;
		for (int i = 0; i < tambor1.size(); i++)
		{
			variable += tambor1.get(i)+tambor3.get(i)+tambor2.get(i);
					
		}
		double total = variable/n;
		System.out.println(Math.round(Math.rint(total/3)));
	}
	}
}
