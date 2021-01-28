package com.cybage;

import java.util.Scanner;

public class AlbumMan {
	public static void main(String[] args) {
	
		AlbumImplement ai = new AlbumImplement();
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("Enter Choice: 1.Add Album 2.Display All Albums 3. Buy Album\n ");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				String an=null,artn = null,lng=null,grn=null;
				int sngs=0,prce=0,stk=0;
				try {
				System.out.println("Enter Album Name: ");
				an=sc.nextLine();
				if(an.equals(null))
				{
					throw new AlbumException("Album Name Not Specipied");
				}
				System.out.println("Enter Artist Name: ");
				artn=sc.nextLine();
				if(artn.equals(null))
				{
					throw new AlbumException("Artist Name Not Specipied");
				}
				System.out.println("Enter Genre: ");
				grn=sc.nextLine();
				if(grn.equals(null))
				{
					throw new AlbumException("Genre Not Specipied");
				}
				System.out.println("Enter Language: ");
				lng=sc.nextLine();
				if(lng.equals(null))
				{
					throw new AlbumException("Language Not Specipied");
				}
				System.out.println("Enter Songs: ");
				sngs=sc.nextInt();
				if(sngs<0)
				{
					throw new AlbumException("No. Of Songs Not Specipied");
				}
			
				System.out.println("Enter Price: ");
				prce=sc.nextInt();
				if(prce<0)
				{
					throw new AlbumException("Price Not Specipied");
				}
				
				System.out.println("Enter Stock: ");
				stk=sc.nextInt();	
				if(stk<0)
				{
					throw new AlbumException("Stock Not Specipied");
				}
				}catch(AlbumException ae)
				{
					System.err.println(ae.getMessage());
				}
				ai.add(an,artn,lng,grn,sngs,prce,stk);
				break;
					
			case 2: ai.disply();
					break;
					
			case 3: 
				System.out.println("Enter Album Name: ");
				an=sc.nextLine();
				
				System.out.println("Enter Artist Name: ");
				artn=sc.nextLine();
				ai.by(an,artn);
			}
		}while(choice!=4);
	}
}
