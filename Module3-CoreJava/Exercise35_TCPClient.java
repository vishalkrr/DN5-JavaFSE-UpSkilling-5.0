import java.io.*;
import java.net.*;

public class Exercise35_TCPClient {

    public static void main(String[] args)
            throws Exception {

        Socket socket =
                new Socket(
                        "localhost",
                        5000
                );

        PrintWriter pw =
                new PrintWriter(
                        socket.getOutputStream(),
                        true
                );

        pw.println(
                "Hello Server"
        );

        socket.close();

    }

}
