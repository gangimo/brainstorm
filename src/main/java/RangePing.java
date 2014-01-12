/**
 * Created with IntelliJ IDEA.
 * User: gangimo
 * Date: 2014/01/12
 * Time: 16:33
 * To change this template use File | Settings | File Templates.
 */
public class RangePing {
	void exec(int start, int end) {
		Ping ping = new Ping();
		for (int i = start; i <= end; i++) {
			ping.exec("192.168.1." + Integer.toString(i));
		}

	}
}
