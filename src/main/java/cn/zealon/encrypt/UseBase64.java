package cn.zealon.encrypt;


import java.util.Base64;

/**
 * Base64 加解密
 * @auther: Zealon
 * @Date: 2018-06-27 14:56
 */
public class UseBase64 {

    public static void main(String[] args){

        String text = "zealon@126.com";

        String encoderText = encoder(text);
        System.out.println(encoderText);

        String decoderText = decoder(encoderText);
        System.out.println(decoderText);
    }

    /**
     * 解密
     * @param text
     * @return
     */
    public static String decoder(String text){
        Base64.Decoder decoder = Base64.getDecoder();
        byte[] mm = decoder.decode(text);
        return new String(mm);
    }

    /**
     * 加密
     * @param text
     * @return
     */
    public static String encoder(String text){
        Base64.Encoder encoder = Base64.getEncoder();
        byte[] mm = encoder.encode(text.getBytes());
        return new String(mm);
    }
}
