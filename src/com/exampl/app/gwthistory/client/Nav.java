package com.exampl.app.gwthistory.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

public class Nav extends Composite {

	private static NavUiBinder uiBinder = GWT.create(NavUiBinder.class);

	interface NavUiBinder extends UiBinder<Widget, Nav> {
	}

	@UiField Button home;
	@UiField Button page1;
	@UiField Button page2;
	@UiField Button page3;
	@UiField Button page4;
	public Nav() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	@UiHandler("home")
	void onHomeClick(ClickEvent e) {
		History.newItem("home");
	}

	@UiHandler("page1")
	void onPage1Click(ClickEvent e) {
		History.newItem("page1");
	}
	@UiHandler("page2")
	void onPage2Click(ClickEvent e) {
		History.newItem("page2");
	}
	@UiHandler("page3")
	void onPage3Click(ClickEvent e) {
		History.newItem("page3");
	}
	@UiHandler("page4")
	void onPage4Click(ClickEvent e) {
		History.newItem("page4");
	}
}
