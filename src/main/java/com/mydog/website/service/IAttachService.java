package com.mydog.website.service;

import com.github.pagehelper.PageInfo;
import com.mydog.entity.TAttach;

public interface IAttachService {
    PageInfo<TAttach> getAttachs(Integer page, Integer limit);
    void save(String fname, String fkey, String ftype, Integer author);
    TAttach selectById(Integer id);
    void deleteById(Integer id);
}
