package com.exampl.app.gwthistory.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GWTHistoryDemo implements EntryPoint {


	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		//add navigation
		Nav nav = new Nav();
		RootPanel.get("nav").add(nav);
		
		//show the home page
		Home home = new Home();
		RootPanel.get("content").add(home);
		
		
		//add history mechanism
		History.addValueChangeHandler(new ValueChangeHandler<String>() {
			
			@Override
			public void onValueChange(ValueChangeEvent<String> event) {
				//get the history token
				String historyToken = event.getValue();
				
				//show corresponding page, parse history token if necessary
				switch(historyToken) {
				case "home": 
					clearAndShowPage(new Home());
					break;
				case "page1":
					clearAndShowPage(new Page1());
					break;
				case "page2":
					clearAndShowPage(new Page2());
					break;
				case "page3":
					clearAndShowPage(new Page3());
					break;
				case "page4":
					clearAndShowPage(new Page4());
					break;
				default:
					Window.alert("Wrong history token! Can't find page.");
				}
			}
		});
	}
	
	private void clearAndShowPage(Widget page) {
		RootPanel.get("content").clear();
		RootPanel.get("content").add(page);
	}
}
