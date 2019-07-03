package com.example.gaglent.di.module;

import android.app.Application;
import android.content.Context;

import com.example.gaglent.RecyclerViewAdapter;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class RecyclerViewAdapterModule {
    @Singleton
    @Provides
    public Context provideContext(Application application) {
        return application;
    }

    @Singleton
    @Provides
    public RecyclerViewAdapter provideRecyclerViewAdapter(Context context) {
        return new RecyclerViewAdapter(context);
    }
}
