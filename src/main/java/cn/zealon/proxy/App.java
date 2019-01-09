package cn.zealon.proxy;

import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @auther: Zealon
 * @Date: 2018-10-19 15:04
 */
public class App {
    public static void main(String[] args) throws IOException {
        ProductService productService = new ProductServiceImpl();
        ProductService proxy = (ProductService) new JdkInvocationHandler().getInstance(productService);
        proxy.addProduct("面包");

        proxy.modifyProduct("面包");
    }
}
