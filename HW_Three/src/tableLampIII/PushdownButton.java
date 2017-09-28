package tableLampIII;

import lightBulb.LightBulb;
import tableLampII.ITableLamp;

public class PushdownButton {
	private ITableLamp lightbulb;
	private String buttonStatus;
	public PushdownButton() {
		lightbulb =  new LightBulb();
		buttonStatus = "Button switched to OFF";
	}
	public ITableLamp getLightbulb() {
		return lightbulb;
	}
	public void setLightbulb(ITableLamp lightbulb) {
		this.lightbulb = lightbulb;
	}
	public String getButtonStatus() {
		return buttonStatus;
	}
	public void setButtonStatus(String buttonStatus) {
		this.buttonStatus = buttonStatus;
	}
	public void PushButton(){
		if(buttonStatus.equals("Button switched to OFF")){
			setButtonStatus("Button switched to ON");
			System.out.println(buttonStatus);
			lightbulb.on();
		}else{
			setButtonStatus("Button switched to OFF");
			System.out.println(buttonStatus);
			lightbulb.off();
		}
	}


}
