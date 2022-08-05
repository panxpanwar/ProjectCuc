package Manager;

import Pages.Page_homePage;
import Pages.Page_loginPage;

public class PageObjectManager {
	private Page_homePage hp;
	private Page_loginPage lp;
	public Page_homePage getHomePage() {
		if (hp==null) {
		hp = new Page_homePage();}		
		return hp;
	}

	
	public Page_loginPage getLoginPage() {
		if (lp==null) {
		lp = new Page_loginPage();}
		return lp;
	}
	
}
