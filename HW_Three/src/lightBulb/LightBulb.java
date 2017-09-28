package lightBulb;

import tableLampII.ITableLamp;

public class LightBulb implements ITableLamp {
	private String Status;
	public String getStatus() {
		return Status;
	}
	public void setStatus(String lightBulbStatus) {
		Status = lightBulbStatus;
	}
	public LightBulb() {
		Status = "Lightbulb off";
	}
	public void on(){
		Status = "Lightbulb on";
		System.out.println(Status);
	}
	public void off(){
		Status = "Lightbulb off";
		System.out.println(Status);
	}

}
