package com.mydog.model;

import com.mydog.entity.TComments;

import java.util.List;

/**
 * 页面的评论，包含父子评论内容
 */
public class CommentBo extends TComments {

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }

    public List<TComments> getChildren() {
        return children;
    }

    public void setChildren(List<TComments> children) {
        this.children = children;
    }

    private int levels;
    private List<TComments> children;

    public  CommentBo(TComments comments){
        setAuthor(comments.getAuthor());
        setMail(comments.getMail());
        setCoid(comments.getCoid());
        setAuthorId(comments.getAuthorId());
        setUrl(comments.getUrl());
        setCreated(comments.getCreated());
        setAgent(comments.getAgent());
        setIp(comments.getIp());
        setContent(comments.getContent());
        setOwnerId(comments.getOwnerId());
        setCid(comments.getCid());
    }



}
