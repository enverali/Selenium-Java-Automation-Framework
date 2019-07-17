package org.exostar.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;


public class Util {
	
	public WebDriver driver;
	
	/**
	 * default constructor
	 */
	public Util() {	}
	
	/**
	 * @param driver
	 * driver initialization
	 */
	public Util(WebDriver driver) {	this.driver = driver;}
	
	/**
	 * @param milliseconds
	 * this is use for the pause or wait
	 */
	public static void pause(Integer milliseconds){
        try {
            TimeUnit.MILLISECONDS.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

