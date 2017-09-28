package tableLampI;

public class LightBulb {
	private String LightBulbStatus;
	public String getLightBulbStatus() {
		return LightBulbStatus;
	}
	public void setLightBulbStatus(String lightBulbStatus) {
		LightBulbStatus = lightBulbStatus;
	}
	public LightBulb() {
		LightBulbStatus = "Lightbulb off";
	}
	public void on(){
		LightBulbStatus = "Lightbulb on";
		System.out.println(LightBulbStatus);
	}
	public void off(){
		LightBulbStatus = "Lightbulb off";
		System.out.println(LightBulbStatus);
	}

}
