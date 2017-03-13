package jisuanqi;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by dyh on 17-3-2.
 */
interface IOStrategy{
    public void service(java.net.Socket socket);
}
public class nwserver {
    public nwserver(int port,IOStrategy ios){
        try{
            ServerSocket ss = new ServerSocket(port);
            System.out.println("Server is ready!");
            while (true){
                Socket socket = ss .accept();
                ios.service(socket);
            }
        }
        catch(Exception e){
            e.printStackTrace();
            System.exit(0);
        }
    }
}
