package com.example.gaglent.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class TheNews {

    public class Bodyy {

        @SerializedName("content")
        @Expose
        private transient Content content;
        @SerializedName  ("type")
        @Expose
        private transient String type;
        @SerializedName("position")
        @Expose
        private transient Integer position;
        @SerializedName("preview_image_url")
        @Expose
        private transient String previewImageUrl;
        @SerializedName("provider")
        @Expose
        private transient String provider;

        public Content getContent() {
            return content;
        }

        public void setContent(Content content) {
            this.content = content;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Integer getPosition() {
            return position;
        }

        public void setPosition(Integer position) {
            this.position = position;
        }

        public String getPreviewImageUrl() {
            return previewImageUrl;
        }

        public void setPreviewImageUrl(String previewImageUrl) {
            this.previewImageUrl = previewImageUrl;
        }

        public String getProvider() {
            return provider;
        }

        public void setProvider(String provider) {
            this.provider = provider;
        }

    }

    public class BoxLink {

        @SerializedName("info")
        @Expose
        private Info_ info;
        @SerializedName("links")
        @Expose
        private Links_ links;
        @SerializedName("position")
        @Expose
        private Integer position;
        @SerializedName("type")
        @Expose
        private String type;
        @SerializedName("rubric")
        @Expose
        private Rubric_ rubric;
        @SerializedName("tags")
        @Expose
        private List<Tag_> tags = null;
        @SerializedName("title_image")
        @Expose
        private TitleImage_ titleImage;

        public Info_ getInfo() {
            return info;
        }

        public void setInfo(Info_ info) {
            this.info = info;
        }

        public Links_ getLinks() {
            return links;
        }

        public void setLinks(Links_ links) {
            this.links = links;
        }

        public Integer getPosition() {
            return position;
        }

        public void setPosition(Integer position) {
            this.position = position;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Rubric_ getRubric() {
            return rubric;
        }

        public void setRubric(Rubric_ rubric) {
            this.rubric = rubric;
        }

        public List<Tag_> getTags() {
            return tags;
        }

        public void setTags(List<Tag_> tags) {
            this.tags = tags;
        }

        public TitleImage_ getTitleImage() {
            return titleImage;
        }

        public void setTitleImage(TitleImage_ titleImage) {
            this.titleImage = titleImage;
        }

    }

    public class Content {

        @SerializedName("player_template")
        @Expose
        private Integer playerTemplate;
        @SerializedName("width")
        @Expose
        private Integer width;
        @SerializedName("height")
        @Expose
        private Integer height;
        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("caption")
        @Expose
        private String caption;
        @SerializedName("vid")
        @Expose
        private String vid;
        @SerializedName("watch_url")
        @Expose
        private String watchUrl;
        @SerializedName("embed_html")
        @Expose
        private String embedHtml;

        public Integer getPlayerTemplate() {
            return playerTemplate;
        }

        public void setPlayerTemplate(Integer playerTemplate) {
            this.playerTemplate = playerTemplate;
        }

        public Integer getWidth() {
            return width;
        }

        public void setWidth(Integer width) {
            this.width = width;
        }

        public Integer getHeight() {
            return height;
        }

        public void setHeight(Integer height) {
            this.height = height;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getCaption() {
            return caption;
        }

        public void setCaption(String caption) {
            this.caption = caption;
        }

        public String getVid() {
            return vid;
        }

        public void setVid(String vid) {
            this.vid = vid;
        }

        public String getWatchUrl() {
            return watchUrl;
        }

        public void setWatchUrl(String watchUrl) {
            this.watchUrl = watchUrl;
        }

        public String getEmbedHtml() {
            return embedHtml;
        }

        public void setEmbedHtml(String embedHtml) {
            this.embedHtml = embedHtml;
        }

    }

    public class Example {

        @SerializedName("topic")
        @Expose
        private Topic topic;

        public Topic getTopic() {
            return topic;
        }

        public void setTopic(Topic topic) {
            this.topic = topic;
        }

    }

    public class Headline {

        @SerializedName("type")
        @Expose
        private transient String type;
        @SerializedName("info")
        @Expose
        private Info info;
        @SerializedName("links")
        @Expose
        private Links links;
        @SerializedName("rubric")
        @Expose
        private transient Rubric rubric;
        @SerializedName("tags")
        @Expose
        private transient List<Tag> tags = null;
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

    }

    public class Info {
        @Override
        public String toString() {
            return "Info{" +
                    "id='" + id + '\'' +
                    ", title='" + title + '\'' +
                    ", rightcol='" + rightcol + '\'' +
                    ", announce='" + announce + '\'' +
                    ", modified=" + modified +
                    '}';
        }

        @SerializedName("id")
        @Expose
        private  String id;
        @SerializedName("title")
        @Expose
        private String title;
        @SerializedName("rightcol")
        @Expose
        private String rightcol;
        @SerializedName("announce")
        @Expose
        private  String announce;
        @SerializedName("modified")
        @Expose
        private transient Integer modified;

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

        public String getAnnounce() {
            return announce;
        }

        public void setAnnounce(String announce) {
            this.announce = announce;
        }

        public Integer getModified() {
            return modified;
        }

        public void setModified(Integer modified) {
            this.modified = modified;
        }

    }

    public class Info_ {

        @SerializedName("modified")
        @Expose
        private Integer modified;
        @SerializedName("title")
        @Expose
        private String title;
        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("rightcol")
        @Expose
        private String rightcol;
        @SerializedName("announce")
        @Expose
        private String announce;

        public Integer getModified() {
            return modified;
        }

        public void setModified(Integer modified) {
            this.modified = modified;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getRightcol() {
            return rightcol;
        }

        public void setRightcol(String rightcol) {
            this.rightcol = rightcol;
        }

        public String getAnnounce() {
            return announce;
        }

        public void setAnnounce(String announce) {
            this.announce = announce;
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

    public class Links_ {

        @SerializedName("external")
        @Expose
        private String external;
        @SerializedName("self")
        @Expose
        private String self;
        @SerializedName("public")
        @Expose
        private String _public;

        public String getExternal() {
            return external;
        }

        public void setExternal(String external) {
            this.external = external;
        }

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
        @SerializedName("path")
        @Expose
        private String path;

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

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

    }

    public class Rubric_ {

        @SerializedName("slug")
        @Expose
        private String slug;
        @SerializedName("title")
        @Expose
        private String title;
        @SerializedName("path")
        @Expose
        private String path;

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

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
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

    public class Tag_ {

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
        @Override
        public String toString() {
            return "TitleImage{" +
                    "credits='" + credits + '\'' +
                    ", url='" + url + '\'' +
                    '}';
        }

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

    public class TitleImage_ {

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

    public class Topic {

        @SerializedName("headline")
        @Expose
        private Headline headline;
        @SerializedName("bodyy")
        @Expose
        private transient List<Bodyy> bodyy = null;
        @SerializedName("type")
        @Expose
        private transient String type;
        @SerializedName("part_slug")
        @Expose
        private transient Object partSlug;
        @SerializedName("box_link")
        @Expose
        private transient List<BoxLink> boxLink = null;

        public Headline getHeadline() {
            return headline;
        }

        public void setHeadline(Headline headline) {
            this.headline = headline;
        }

        public List<Bodyy> getBodyy() {
            return bodyy;
        }

        public void setBodyy(List<Bodyy> bodyy) {
            this.bodyy = bodyy;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Object getPartSlug() {
            return partSlug;
        }

        public void setPartSlug(Object partSlug) {
            this.partSlug = partSlug;
        }

        public List<BoxLink> getBoxLink() {
            return boxLink;
        }

        public void setBoxLink(List<BoxLink> boxLink) {
            this.boxLink = boxLink;
        }

    }
}