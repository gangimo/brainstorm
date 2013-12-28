import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: gangimo
 * Date: 2013/12/29
 * Time: 3:31
 */
public class PingTest {
	@Test
	public void localhost() {
		Ping ping = new Ping();
		assertEquals(ping.exec("127.0.0.1"), 0);
	}
}
