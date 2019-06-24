package com.example.gaglent.pojo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ModelNewsLatestList {
    @SerializedName("headlines")
    @Expose
    private List<ModelNewsLatest> headlines;

    public List<ModelNewsLatest> getModelNewsLatestList() {
        return headlines;
    }

    public void setModelNewsLatestList(List<ModelNewsLatest> headlines) {
        this.headlines = headlines;
    }
}
