package com.bytelegend;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Parent {
    private String url;
    private String sha;
    @JsonProperty("html_url")
    private String htmlUrl;

    public String getUrl() {
        return url;
    }

    public String getSha() {
        return sha;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }
}
