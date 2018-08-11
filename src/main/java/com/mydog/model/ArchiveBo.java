package com.mydog.model;

import com.mydog.entity.TContents;

import java.io.Serializable;
import java.util.List;

public class ArchiveBo implements Serializable {

    private String date;
    private String count;
    private List<TContents> articles;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public List<TContents> getArticles() {
        return articles;
    }

    public void setArticles(List<TContents> articles) {
        this.articles = articles;
    }

    @Override
    public String toString() {
        return "Archive [" +
                "date='" + date + '\'' +
                ", count='" + count + '\'' +
                ", articles=" + articles +
                ']';
    }
}
