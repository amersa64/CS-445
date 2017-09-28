package button;

import lightBulb.LightBulb;
import tableLampII.ITableLamp;

public class Button {
	private ITableLamp lightbulb;
	private String buttonStatus;
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
	public Button() {
		lightbulb =  new LightBulb();
		buttonStatus = "Button switched to OFF";
	}
	public void switchOn(){
		buttonStatus = "Button switched to ON";
		System.out.println(buttonStatus);
		lightbulb.on();
	}
	public void switchOff(){
		buttonStatus = "Button switched to OFF";
		System.out.println(buttonStatus);
		lightbulb.off();
	}
	
	}
