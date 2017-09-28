package tableLampIII;

import static org.junit.Assert.*;

import org.junit.Test;

public class tableLampTest {

	@Test
	public void test() {
		PushdownButton myButton = new PushdownButton();
		assertEquals(myButton.getButtonStatus(),"Button switched to OFF");
		assertEquals(myButton.getLightbulb().getStatus(),"Lightbulb off");
		myButton.PushButton();
		assertEquals(myButton.getButtonStatus(),"Button switched to ON");
		assertEquals(myButton.getLightbulb().getStatus(),"Lightbulb on");
		myButton.PushButton();
		assertEquals(myButton.getButtonStatus(),"Button switched to OFF");
		assertEquals(myButton.getLightbulb().getStatus(),"Lightbulb off");
	}

}
