package com.cybage;

import java.util.Scanner;

public class AlbumImplement implements AlbumService
{
	Album arr[]=new Album[100];
	public static int count=0;
	@Override
	public void add(String an,String artn,String lng,String grn,int sngs,int prce,int stk) {
		
		arr[count]= new Album();
	
		arr[count].setAlbumName(an);

		arr[count].setArtist(lng);
	
		arr[count].setGenre(grn);
	
		arr[count].setLanguage(lng);

		arr[count].setAlbumSong(sngs);

		arr[count].setAlbumPrice(prce);

		arr[count].setAlbumStock(stk);	
		count++;
	}

	@Override
	public void disply() {
		// TODO Auto-generated method stub
		for(int i=0;i<count;i++) {
			System.out.println(arr[i]);
		}
	}
}
