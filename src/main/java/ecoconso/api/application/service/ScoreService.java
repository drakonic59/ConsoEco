package ecoconso.api.application.service;

import ecoconso.api.application.config.DefaultContentTypeInterceptor;
import okhttp3.*;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ScoreService {

    private String BASE_URL = "https://world.openfoodfacts.org/api/v0/product/";

    OkHttpClient client = new OkHttpClient.Builder()
            .addInterceptor(
                    new DefaultContentTypeInterceptor("application/json"))
            .build();

    public String getScore(String code) throws IOException {
        Request request = new Request.Builder()
                .url(BASE_URL + code + "/.json")
                .build();

        Call call = client.newCall(request);
        Response response = call.execute();


        String first = response.body().string().split("\"product\":")[1];
        String second = first.split("\"ecoscore_data\":")[1];
        String result = second.split("\"score\":")[1].split(",")[0];
        System.out.println(result);
        return result;
    }
}
