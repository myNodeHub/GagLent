package com.example.gaglent.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ModelNewsLatest {

        @SerializedName("type")
        @Expose
        private String type;
        @SerializedName("info")
        @Expose
        private Info info;
        @SerializedName("links")
        @Expose
        private Links links;
        @SerializedName("rubric")
        @Expose
        private Rubric rubric;
        @SerializedName("tags")
        @Expose
        private List<Tag> tags = null;
        @SerializedName("title_image")
        @Expose
        private TitleImage titleImage;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Info getInfo() {
            return info;
        }

        public void setInfo(Info info) {
            this.info = info;
        }

        public Links getLinks() {
            return links;
        }

        public void setLinks(Links links) {
            this.links = links;
        }

        public Rubric getRubric() {
            return rubric;
        }

        public void setRubric(Rubric rubric) {
            this.rubric = rubric;
        }

        public List<Tag> getTags() {
            return tags;
        }

        public void setTags(List<Tag> tags) {
            this.tags = tags;
        }

        public TitleImage getTitleImage() {
            return titleImage;
        }

        public void setTitleImage(TitleImage titleImage) {
            this.titleImage = titleImage;
        }



    public class Info {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("title")
        @Expose
        private String title;
        @SerializedName("rightcol")
        @Expose
        private String rightcol;
        @SerializedName("modified")
        @Expose
        private Integer modified;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getRightcol() {
            return rightcol;
        }

        public void setRightcol(String rightcol) {
            this.rightcol = rightcol;
        }

        public Integer getModified() {
            return modified;
        }

        public void setModified(Integer modified) {
            this.modified = modified;
        }

    }

    public class Links {

        @SerializedName("self")
        @Expose
        private String self;
        @SerializedName("public")
        @Expose
        private String _public;

        public String getSelf() {
            return self;
        }

        public void setSelf(String self) {
            this.self = self;
        }

        public String getPublic() {
            return _public;
        }

        public void setPublic(String _public) {
            this._public = _public;
        }

    }

    public class Rubric {

        @SerializedName("slug")
        @Expose
        private String slug;
        @SerializedName("title")
        @Expose
        private String title;

        public String getSlug() {
            return slug;
        }

        public void setSlug(String slug) {
            this.slug = slug;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

    }

    public class Tag {

        @SerializedName("title")
        @Expose
        private String title;
        @SerializedName("slug")
        @Expose
        private String slug;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getSlug() {
            return slug;
        }

        public void setSlug(String slug) {
            this.slug = slug;
        }

    }

    public class TitleImage {

        @SerializedName("credits")
        @Expose
        private String credits;
        @SerializedName("url")
        @Expose
        private String url;

        public String getCredits() {
            return credits;
        }

        public void setCredits(String credits) {
            this.credits = credits;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

    }

    @Override
    public String toString() {
        return "ModelNewsLatest{" +
                "type='" + type + '\'' +
                ", info=" + info +
                ", links=" + links +
                ", rubric=" + rubric +
                ", tags=" + tags +
                ", titleImage=" + titleImage +
                '}';
    }
}
