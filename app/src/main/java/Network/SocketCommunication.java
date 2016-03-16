package Network;

import android.app.Application;

import java.net.URISyntaxException;

import io.socket.client.IO;
import io.socket.client.Socket;

/**
 * Created by محمد on 15/03/2016.
 */
public class SocketCommunication extends Application {
private Socket socket ;{

        try {
            socket = IO.socket(Constants.SERVER_URL);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
    public  void socketConnect(){
        socket.connect();
    }
    public void socketDisconnect(){
        socket.disconnect();
    }

    public Socket getSocket() {
        return socket;
    }
}
