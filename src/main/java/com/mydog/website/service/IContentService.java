package com.mydog.website.service;

import com.github.pagehelper.PageInfo;
import com.mydog.entity.TContents;
import com.mydog.entity.TContentsExample;

public interface IContentService {

    void publish(TContents content);
    PageInfo<TContents> getContents(Integer p, Integer limit);
    TContents getContents(String id);
    void updateContentByCid(TContents tContents);
    PageInfo<TContents> getArticles(Integer mid, int page, int limit);
    PageInfo<TContents> getArticles(String keyword,  Integer page, Integer limit);
    PageInfo<TContents> getArticlesWithPage(TContentsExample tContentsExample, Integer page, Integer limit);
    void deleteByCid(Integer cid);
    /**
     * 编辑文章
     * @param contents
     */
    void updateArticle(TContents contents);
    void updateCategory(String ordinal, String newCategory);
}
