package com.exampl.app.gwthistory.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class Page1 extends Composite {

	private static Page1UiBinder uiBinder = GWT.create(Page1UiBinder.class);

	interface Page1UiBinder extends UiBinder<Widget, Page1> {
	}

	public Page1() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
