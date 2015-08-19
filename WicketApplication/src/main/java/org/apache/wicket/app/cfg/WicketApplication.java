package org.apache.wicket.app.cfg;

import org.apache.wicket.Page;
import org.apache.wicket.app.ui.LoginPage;
import org.apache.wicket.protocol.http.WebApplication;

public class WicketApplication extends WebApplication {

	@Override
	public Class<? extends Page> getHomePage() {
		System.out.println("getHomePage()");
		return LoginPage.class;
	}
	
	@Override
	protected void init() {
		System.out.println("Iniciando aplicação com o framework Wicket!!!");
		super.init();
	}

}
