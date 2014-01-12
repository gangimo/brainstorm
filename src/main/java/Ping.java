import java.io.IOException;
import java.net.InetAddress;

/**
 * Created with IntelliJ IDEA.
 * User: gangimo
 * Date: 2013/12/29
 * Time: 2:37
 */
public class Ping {

	int exec(String address) {
		try {
			InetAddress inet = InetAddress.getByName(address);
			boolean isReachable = inet.isReachable(10);
			System.out.println(address + ":" + isReachable);
		} catch (IOException e) {
			e.printStackTrace();
			return 1;
		}
		return 0;
	}

	public static int main(String argv[]) {
		Ping ping = new Ping();
		return ping.exec(argv[0]);
	}
}
