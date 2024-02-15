package de.lubowiecki.designpatterns.adapter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tweet {

    private String autor;
    private List<String> tags;
    private String body;
    private LocalDateTime createdAt;

    public Tweet(String autor, String body, String... tags) {
        this.autor = autor;
        this.body = body;
        this.tags = new ArrayList<>(Arrays.asList(tags));
        this.createdAt = LocalDateTime.now();
    }

    public void print() {
        System.out.println("!!Tweet vom " + createdAt + "!!");
        System.out.println("Autor: " + autor);
        System.out.println("Tags: #" + String.join(", #", tags));
        System.out.println(body);
        System.out.println();
    }

    public String getAutor() {
        return autor;
    }

    public List<String> getTags() {
        return tags;
    }

    public String getBody() {
        return body;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void addTag(String tag, String... tags) {
        this.tags.add(tag);
        if(tags.length > 0)
            this.tags.addAll(Arrays.asList(tag));
    }
}
