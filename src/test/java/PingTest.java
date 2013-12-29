import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: gangimo
 * Date: 2013/12/29
 * Time: 3:31
 */
public class PingTest {
	Ping ping = new Ping();

	@Test
	public void localhost() {
		assertEquals(ping.exec("127.0.0.1"), 0);
	}

	@Test
	public void pingError() {
		assertEquals(ping.exec("lalalalla"), 1);
	}


	@Test
	public void main() {
		String[] argv = {"127.0.0.1"};
		assertEquals(ping.main(argv), 0);
	}

	@Test
	public void mainError() {
		String[] argv = {"hoge"};
		assertEquals(ping.main(argv), 1);
	}
}
