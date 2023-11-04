package Emu_StepDefinition;

import Emu_PageAction.Emu_HomePageAction;
import Emu_PageAction.Emu_SearchPageAction;
import Emu_Utility.Emu_Base;
import cucumber.api.java.en.Then;

public class Emu_Search extends Emu_Base {
	Emu_HomePageAction emu_HomePageAction = new Emu_HomePageAction();
	Emu_SearchPageAction emu_SearchPageAction = new Emu_SearchPageAction();
	
	@Then("^select baby from dropdown click on search button$")
	public void select_baby_from_dropdown_click_on_search_button() throws Throwable {
		emu_HomePageAction.selectbabyfromdropdownclickonsearchbutton();
	}

	@Then("^mouse hover on clothing$")
	public void mouse_hover_on_clothing() throws Throwable {
		emu_SearchPageAction.mousehoveronclothing();
	}

	@Then("^click dresses$")
	public void click_dresses() throws Throwable {
		emu_SearchPageAction.clickdresses();
	}

	@Then("^scroll down and click on the children place check box$")
	public void scroll_down_and_click_on_the_children_place_check_box() throws Throwable {
		emu_SearchPageAction.scrolldownandclickonthechildrenplacecheckbox();  
	}

	

	
	
	
}
