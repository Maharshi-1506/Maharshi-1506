import java.net.*;
import java.io.*;

class client1 {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("127.0.0.1", 7777);
        if (s.isConnected()) {
            System.out.println("connected successfully");
        }
        FileOutputStream fout = new FileOutputStream("receive.txt");
        DataInputStream din = new DataInputStream(s.getInputStream());
        int r;
        while ((r = din.read()) != -1) {
            fout.write((char) r);
        }
        s.close();
    }
}
