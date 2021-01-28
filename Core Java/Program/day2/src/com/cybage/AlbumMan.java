package com.cybage;

import java.util.Scanner;

public class AlbumMan {
	public static void main(String[] args) {
	
		AlbumImplement ai = new AlbumImplement();
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("Enter Choice: 1.Add Album 2.Display All Albums\n ");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				String an,artn,lng,grn;
				int sngs,prce,stk;
				System.out.println("Enter Album Name: ");
				an=sc.nextLine();
				
				System.out.println("Enter Artist Name: ");
				artn=sc.nextLine();
			
				System.out.println("Enter Genre: ");
				grn=sc.nextLine();
			
				System.out.println("Enter Language: ");
				lng=sc.nextLine();
				
				System.out.println("Enter Songs: ");
				sngs=sc.nextInt();
			
				System.out.println("Enter Price: ");
				prce=sc.nextInt();
			
				System.out.println("Enter Stock: ");
				stk=sc.nextInt();	
				
				ai.add(an,artn,lng,grn,sngs,prce,stk);
				break;
					
			case 2: ai.disply();
					break;
			}
		}while(choice!=3);
	}
}
