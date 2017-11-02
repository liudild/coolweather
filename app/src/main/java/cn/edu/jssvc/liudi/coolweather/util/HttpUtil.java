package cn.edu.jssvc.liudi.coolweather.util;

/**
 * Created by 511 on 2017/11/2.
 */
public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
