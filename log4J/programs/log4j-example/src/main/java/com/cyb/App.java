package com.cyb;

import org.apache.logging.log4j.LogManager;
/**
 * Hello world!
 *
 */
import org.apache.logging.log4j.Logger;
public class App 
{
	public static final Logger log = LogManager.getLogger(App.class.getName());
    public static void main( String[] args )
    {
        log.info("This is info message");
    }
}
