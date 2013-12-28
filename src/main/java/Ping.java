import java.io.IOException;
import java.net.InetAddress;

/**
 * Created with IntelliJ IDEA.
 * User: gangimo
 * Date: 2013/12/29
 * Time: 2:37
 * To change this template use File | Settings | File Templates.
 */
public class Ping {

	int exec(String address){
		try{
			InetAddress inet = InetAddress.getByName(address);
			boolean isReachable = inet.isReachable(10);
			System.out.println(isReachable);
		}catch (IOException e){
			e.printStackTrace();
			return 1;

		}
		return 0;
	}

	public static void main(String argv[]) {
		Ping ping = new Ping();
		ping.exec(argv[0]);


	}
}
