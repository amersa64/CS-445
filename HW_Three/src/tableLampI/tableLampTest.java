package tableLampI;

import static org.junit.Assert.*;

import org.junit.Test;

public class tableLampTest {

	@Test
	public void test() {
		Button myButton = new Button();
		assertEquals(myButton.getButtonStatus(),"Button switched to OFF");
		assertEquals(myButton.getLightbulb().getLightBulbStatus(),"Lightbulb off");
		myButton.switchOn();
		assertEquals(myButton.getButtonStatus(),"Button switched to ON");
		assertEquals(myButton.getLightbulb().getLightBulbStatus(),"Lightbulb on");
		myButton.switchOff();
		assertEquals(myButton.getButtonStatus(),"Button switched to OFF");
		assertEquals(myButton.getLightbulb().getLightBulbStatus(),"Lightbulb off");
	}

}
