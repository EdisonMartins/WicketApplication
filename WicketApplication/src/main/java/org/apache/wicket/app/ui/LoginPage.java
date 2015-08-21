package org.apache.wicket.app.ui;

import org.apache.wicket.app.ui.panel.LoginPanel;
import org.apache.wicket.app.ui.template.JugTemplate;

public class LoginPage extends JugTemplate {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public LoginPage() {
		
		super();
		System.out.println("LoginPage");
		replace(new LoginPanel(CONTENT_ID));
		getMenuPanel().setVisible(false);

		
	}

}
