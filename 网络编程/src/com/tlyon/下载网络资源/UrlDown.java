package com.tlyon.下载网络资源;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class UrlDown {
    public static void main(String[] args) throws Exception {
       // URL url = new URL("https://m801.music.126.net/20210823113948/ca119b0b7811aadc40203593badc32b9/jdymusic/obj/wo3DlMOGwrbDjj7DisKw/10480692552/83d9/f53c/2431/798e0686ab059cc64525bc58e26519c5.mp3");
        URL url = new URL("http://m701.music.126.net/20210823122425/8e53aa15f1297c7427a90b66543cca4d/jdymusic" +
                "/obj/wo3DlMOGwrbDjj7DisKw/8708798537/d7df/5b6b/20be/c45ae8acfea229a31cd7bc85ce136669.mp3");

        //连接到这个资源
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();

        InputStream inputStream = urlConnection.getInputStream();

        FileOutputStream fileOutputStream = new FileOutputStream("放空.mp3");

        byte[] buffer = new byte[1024];
        int len;
        while ((len = inputStream.read(buffer)) != -1) {
            fileOutputStream.write(buffer, 0, buffer.length);
        }
        fileOutputStream.close();
        inputStream.close();
        urlConnection.disconnect();

    }
}
