package servlet;/*
 *ClassName:JerryMouse
 *UserName:小阎王丷
 *CreateTime:2020/9/17 13:56
 */


import java.io.IOException;
import java.net.*;
import java.io.*;
/*

 */
public class JerryMouse {
    public static void main(String[] args) throws IOException {
        //创建ServerSocket（套接字）
        ServerSocket server=new ServerSocket(8081);
        while (true){
            System.out.println("等待客户端连接");
           Socket socket= server.accept();
            System.out.println("客户端已连接");
            //获取输出流

           OutputStream out= socket.getOutputStream();

            String s = "Hello World";

            String protocal="HTTP/1.1 200 OK\r\n";
            protocal+="Content-Length: " + s.getBytes().length + "\r\n";
            protocal+="Content-Type: text/html\r\n";

            out.write(protocal.getBytes()); //发送协议头
            out.write("\r\n".getBytes()); //发送空行
            out.write(s.getBytes()); //发送数据

            out.flush();
            out.close();
        }
    }
}
