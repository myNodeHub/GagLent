package com.example.gaglent.di.module;

import com.example.gaglent.MainActivity;
import com.example.gaglent.NewsActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public interface ActivityModule {

    @ContributesAndroidInjector
    abstract MainActivity contributesMainActivity();

    @ContributesAndroidInjector
    abstract NewsActivity contributesNewsActivity();
}
