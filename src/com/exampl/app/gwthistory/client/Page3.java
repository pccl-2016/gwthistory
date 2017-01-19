package com.exampl.app.gwthistory.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class Page3 extends Composite {

	private static Page3UiBinder uiBinder = GWT.create(Page3UiBinder.class);

	interface Page3UiBinder extends UiBinder<Widget, Page3> {
	}

	public Page3() {
		initWidget(uiBinder.createAndBindUi(this));
		History.newItem("page3");
	}

}
