package com.cybage;

class Album extends Language{
	
	String albumname;
	String artist;
	int songs;
	int price;
	int stock;
	static int albumid=0; 
	public
	Album() {
		super();
		this.albumid++;
		this.albumname="";
		this.artist="";
		this.price=0;
		this.songs=0;
		this.stock=0;
	}
	Album(String an, String art,int sng, int pr, int s, String lang, String gnr) {
		super(lang,gnr);
		this.albumid++;
		this.albumname=an;
		this.artist=art;
		this.price=pr;
		this.songs=sng;
		this.stock=s;
	}
	
	String getAlbumName()
	{
		return this.albumname;
	}
	String getArtist()
	{
		return this.artist;
	}
	int getAlbumID()
	{
		return this.albumid;
	}
	int getAlbumPrice()
	{
		return this.price;
	}
	int getAlbumSong()
	{
		return this.songs;
	}
	int getAlbumStock()
	{
		return this.stock;
	}
	
	void setAlbumName(String am)
	{
		 this.albumname=am;
	}
	void setArtist(String art)
	{
		this.artist=art;
	}
	void setAlbumPrice(int pr)
	{
		this.price=pr;
	}
	void setAlbumSong(int sng)
	{
		this.songs=sng;
	}
	void setAlbumStock(int s)
	{
		this.stock=s;
	}
	void display()
	{
		System.out.println("Album ID: "+albumid);
		System.out.println("Album: "+albumname+"\nArtist: "+artist+"\nSongs: "+songs+"\nPrice: "+price+"\nLanguage: \"+this.language+\"\\nGenre: \"+this.genre+\"\n");
		System.out.println("Album Sales: "+calculate()+" Rs\n");
	}
	
	@Override
    public String toString() {
return "Album: "+this.albumname+"\nArtist: "+this.artist+"\nSongs: "+this.songs+"\nPrice: "+this.price+"\nLanguage: "+this.language+"\nGenre: "+this.genre+"\n";
    }
	@Override
	int calculate() {
		return this.price*this.stock;
	}
	
}