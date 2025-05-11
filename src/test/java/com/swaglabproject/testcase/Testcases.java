package com.swaglabproject.testcase;

import java.util.concurrent.TimeoutException;

import org.testng.annotations.Test;

import com.swaglabproject.actiondriver.Actions;
import com.swaglabproject.base.BaseClass;
import com.swaglabproject.pages.obj_DynamicID;

public class Testcases extends BaseClass {
	Actions action = new Actions();
	
	@Test
	public void Dynamic_ID() {
		//Check whether the element is displayed by locating it dynamically
		obj_DynamicID dynamic = new obj_DynamicID(driver);
		action.SelectOption(dynamic.selectOptions, "Dynamic ID", "a");
		try {
			action.isElementDisplayed(dynamic.dynamicIDButton);
		} catch (TimeoutException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
