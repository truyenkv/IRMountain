package IRMountain;

import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import IRMountain.steps.ContactInformation1Step;
import IRMountain.steps.LoginSteps;
import IRMountain.steps.PortalServiceCatalogStep;
import IRMountain.steps.PortalServiceDetailStep;
import cucumber.api.java.en.Given;

public class IronMain {
	
	@Steps 
	ContactInformation1Step serviceOrderSt;
	
	@Steps
	PortalServiceDetailStep serviceDetailSt;
	
	@Steps
	LoginSteps loginSt;
	
	@Steps
	PortalServiceCatalogStep catalogSt;
	
	@Given("^Open \"([^\"]*)\"$")
	public void open(String url) {
		loginSt.accessUrl(url);
	}

	@Given("^Login site by \"([^\"]*)\" and \"([^\"]*)\" account\\.$")
	public void login_site_by_and_account(String username, String password) {
		 loginSt.input_username(username);
		 loginSt.input_password(password);
		 loginSt.click_On_Loginbtn();
	}
	
	@Given("^Go to Service Catalog screen\\.$")
	public void go_to_Service_Catalog_screen() {
	    loginSt.click_On_ServiceCatalog();
	}

	@Given("^Take searchs with keyword \"([^\"]*)\" and go to service detail$")
	public void take_searchs_with_keyword_and_go_to_service_detail(String keyword) {
	    catalogSt.enter_keyword(keyword);
	}
	
	@Given("^Take order new service with email \"([^\"]*)\"\\.$")
	public void take_order_new_service(String email){
		catalogSt.click_On_Service();
		serviceDetailSt.Click_On_Order_Button();
		serviceOrderSt.Enter_Contact_Information_Page1(email);
		serviceOrderSt.Next_Screen();
	}

	@Given("^Go to notification screen\\.$")
	public void go_to_notification_screen()  {
	    
	}

	@Given("^Approve service request\\.$")
	public void approve_service_request() {
	    
	}


}
