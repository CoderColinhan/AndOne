package com.mydog.website.service;

import com.github.pagehelper.PageInfo;
import com.mydog.entity.TComments;
import com.mydog.entity.TCommentsExample;
import com.mydog.model.TCommentBo;
import io.swagger.models.auth.In;

public interface ICommentService {

    void insertComment(TComments comments);
    PageInfo<TCommentBo> getComments(Integer cid, int page, int limit);
    PageInfo<TComments> getCommentsWithPage(TCommentsExample tCommentsExample, int page, int limit);
    TComments getCommentById(Integer coid);
    void delete(Integer coid, Integer cid);
    void update(TComments comments);

}
