package com.cybage;

public abstract class Language {
	String language;
	String genre;
	
	protected
	Language()
	{
		this.language="";
		this.genre="";
	}
	
	Language(String lang, String gnr)
	{
		this.language=lang;
		this.genre=gnr;
	}
	
	String getLanguage()
	{
		return this.language;
	}
	String getGenre()
	{
		return this.genre;
	}
	
	void setGenre(String gnr)
	{
		this.genre=gnr;
	}
	
	void setLanguage(String lang)
	{
		this.language=lang;
	}
	
	abstract int calculate();
}
