package com.example.gaglent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.gaglent.pojo.TheNews;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import dagger.android.AndroidInjection;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import com.squareup.picasso.Picasso;

import javax.inject.Inject;

import static com.example.gaglent.Service.BASE_URL;

public class NewsActivity extends AppCompatActivity {
    @Inject
    Retrofit retrofit;
    TextView innerTxtInfoTitle;
    TextView innerTxtInfoRightcol;
    TextView innerTxtAnnounce;
    ImageView innerImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        AndroidInjection.inject(this);

        innerTxtInfoTitle = findViewById(R.id.innerTxtInfoTitle);
        innerTxtInfoRightcol = findViewById(R.id.innerTxtInfoRightcol);
        innerTxtAnnounce = findViewById(R.id.innerTxtAnnounce);
        innerImage = findViewById(R.id.innerImage);

//        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
//        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
//        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();

//        Gson gson = new GsonBuilder()
//                .setLenient()
//                .excludeFieldsWithoutExposeAnnotation()
//                .create();


//        retrofit = new Retrofit.Builder()
//                .baseUrl(BASE_URL)
//                .client(client)
//                .addConverterFactory(GsonConverterFactory.create(gson))
//                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
//                .build();

        Bundle bundle = getIntent().getExtras();

        Service service = retrofit.create(Service.class);

        if (bundle != null) {
            String url = bundle.getString("url").substring(1);
            System.out.println(url);

            service.getTheNews(url)
                    .subscribeOn(Schedulers.computation())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(this::handleResults, this::handleError);
        }
    }

    private void handleResults(TheNews.Example response) {

        Picasso.with(this).load(response.getTopic().getHeadline().getTitleImage().getUrl()).into(innerImage);
        innerTxtInfoTitle.setText(response.getTopic().getHeadline().getInfo().getTitle());
        innerTxtInfoRightcol.setText(response.getTopic().getHeadline().getInfo().getRightcol());
        innerTxtAnnounce.setText(response.getTopic().getHeadline().getInfo().getAnnounce());
    }

    private void handleError(Throwable t) {

        Intent intent = new Intent(this, MainActivity.class);
        this.startActivity(intent);

        Toast.makeText(this, "ERROR IN FETCHING API RESPONSE.",
                Toast.LENGTH_LONG).show();

    }
}
