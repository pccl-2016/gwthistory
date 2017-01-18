package com.exampl.app.gwthistory.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GWTHistoryDemo implements EntryPoint {


	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		Nav nav = new Nav();
		RootPanel.get("nav").add(nav);
		
		Home home = new Home();
		RootPanel.get("content").add(home);
	}
}
