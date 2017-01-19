package com.exampl.app.gwthistory.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class Page2 extends Composite {

	private static Page2UiBinder uiBinder = GWT.create(Page2UiBinder.class);

	interface Page2UiBinder extends UiBinder<Widget, Page2> {
	}

	public Page2() {
		initWidget(uiBinder.createAndBindUi(this));
		History.newItem("page2");
	}

}
