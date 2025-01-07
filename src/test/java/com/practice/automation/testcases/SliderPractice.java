package com.practice.automation.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.practice.objectrepository.AutomateHomepageIObjects;

import lib.BaseClass;

public class SliderPractice extends BaseClass{
	
	AutomateHomepageIObjects AHPAO =new AutomateHomepageIObjects(driver);
	

	@Test
	public  void main(){
		System.out.println("Inside initiateChromeAndURL main");
		
		//assertEquals(true, AHPAO.validatePageHeader());
		AHPAO.ClickSliderButton();
		  
		
		
		 
		
	    
		
		System.out.println("End of initiateChromeAndURL main");
	  
	}

	
		}


