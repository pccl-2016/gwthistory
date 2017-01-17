package com.exampl.app.gwthistory.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class Page4 extends Composite {

	private static Page4UiBinder uiBinder = GWT.create(Page4UiBinder.class);

	interface Page4UiBinder extends UiBinder<Widget, Page4> {
	}

	public Page4() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
