package IRMountain.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import IRMountain.pages.PortalServiceDetailScreen;

public class PortalServiceDetailStep extends ScenarioSteps{

	PortalServiceDetailScreen serviceDetailSr;
	@Step
	public void Click_On_Order_Button() {
		serviceDetailSr.Click_On_Order_button();
	}

}
