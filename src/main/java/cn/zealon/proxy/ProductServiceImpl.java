package cn.zealon.proxy;

/**
 * @auther: Zealon
 * @Date: 2018-10-19 15:02
 */
public class ProductServiceImpl implements ProductService {
    @Override
    public void addProduct(String productName) {
        System.out.println("添加了产品："+productName);
    }

    @Override
    public void modifyProduct(String productName) {
        System.out.println("修改了产品："+productName);
    }
}
