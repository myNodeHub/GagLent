package com.example.gaglent.di.component;

import android.app.Application;

import com.example.gaglent.App;
import com.example.gaglent.RecyclerViewAdapter;
import com.example.gaglent.di.module.ActivityModule;
import com.example.gaglent.di.module.RecyclerViewAdapterModule;
import com.example.gaglent.di.module.RetrofitModule;
import com.google.gson.Gson;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;
import retrofit2.Retrofit;

@Singleton
@Component(modules = {AndroidSupportInjectionModule.class, ActivityModule.class, RecyclerViewAdapterModule.class, RetrofitModule.class})
public interface MainComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);
        MainComponent build();
    }
    //зависимости предназначенны для объекта App
    void inject(App app);

}
