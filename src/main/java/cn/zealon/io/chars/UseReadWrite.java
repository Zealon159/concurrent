package cn.zealon.io.chars;

import cn.zealon.io.bytes.UseInputStream;

import java.io.*;

/**
 * @Author: zealon
 * @Version: 1.0
 */
public class UseReadWrite {

    public static void main(String[] args){

        String path = UseInputStream.class.getClassLoader().getResource("").getPath();

        BufferedReader reader = null;
        BufferedWriter writer = null;

        try {
            reader = new BufferedReader(
                new InputStreamReader(
                    new FileInputStream(path+"/resources.txt")
                )
            );
            writer = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream(path+"/resources_copy.txt")
                    )
            );
            String s;
            while((s=reader.readLine())!=null){
                System.out.println(s);
                writer.write(s);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
