package Emu_StepDefinition;

import Emu_PageAction.Emu_HomePageAction;
import Emu_PageAction.Emu_SigninPageAction;
import Emu_Utility.Emu_Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Emu_Signin extends Emu_Base {
	 Emu_HomePageAction  emu_HomePageAction = new  Emu_HomePageAction();
	 Emu_SigninPageAction emu_SigninPageAction = new Emu_SigninPageAction();
	@Given("^open <\"([^\"]*)\"> em$")
	public void open_em(String URL) throws Throwable {
		EmLaunchURL(URL); 
	}

	@Then("^mouse hover on sign in em$")
	public void mouse_hover_on_sign_in_em() throws Throwable {
		emu_HomePageAction.mousehoveronsigninem();
	   
	}

	@Then("^click start here$")
	public void click_start_here() throws Throwable {
		emu_HomePageAction.clickstarthere();  
	}

	@Then("^enter invalid name mobile number enter password repassword click continue$")
	public void enter_invalid_name_mobile_number_enter_password_repassword_click_continue() throws Throwable {
		emu_SigninPageAction.enterinvalidnamemobilenumberenterpasswordrepasswordclickcontinue();   
	}

	@Then("^Verify user can not create account with wrong information$")
	public void verify_user_can_not_create_account_with_wrong_information() throws Throwable {
		emu_SigninPageAction.Verifyusercannotcreateaccountwithwronginformation(); 
	}


	
	
	
}
