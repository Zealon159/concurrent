package cn.zealon.io.bytes;

import java.io.*;

/**
 * @Author: zealon
 * @Version: 1.0
 */
public class UseInputStream {
    public static void main(String[] args) {

        String path = UseInputStream.class.getClassLoader().getResource("").getPath();

        System.out.println(path);


        FileInputStream fis=null;
        FileOutputStream fos=null;
        try  {
            fis = new FileInputStream(new File(path+"/resources.txt"));
            //File newFile = new File(path+"/a.txt");
            //newFile.createNewFile();
            fos = new FileOutputStream(new File(path+"/resources_copy.txt"));
            int ch;

            while((ch=fis.read()) != -1){
                fos.write(ch);
            }

        }catch (FileNotFoundException ex){
            ex.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fis.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
