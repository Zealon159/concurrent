package cn.zealon.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.*;

/**
 * @auther: Zealon
 * @Date: 2018-12-17 10:56
 */
public class CaseSocket {
    public static void main(String[] args) throws IOException {
        /*InetAddress address = InetAddress.getLocalHost();
        System.out.println(address.getHostName()+":"+address.getHostAddress()+":"+address.getAddress());*/

        //使用URL读取网页内容
        //创建一个URL实例
        /*URL url =new URL("https://zealon.cn");
        InputStream is = url.openStream();//通过openStream方法获取资源的字节输入流
        InputStreamReader isr =new InputStreamReader(is,"UTF-8");//将字节输入流转换为字符输入流,如果不指定编码，中文可能会出现乱码
        BufferedReader br =new BufferedReader(isr);//为字符输入流添加缓冲，提高读取效率
        String data = br.readLine();//读取数据
        while(data!=null){
            System.out.println(data);//输出数据
            data = br.readLine();
        }
        br.close();
        isr.close();
        is.close();*/

        Socket socket ;
    }
}
