package com.mydog.website.service;

import com.mydog.entity.TRelationshipsKey;

import java.util.List;

public interface IRelationshipService {

    void deleteById(Integer cid, Integer mid);

    /**
     * 按主键统计条数
     * @param cid
     * @param mid
     * @return 条数
     */
    Long countById(Integer cid, Integer mid);


    /**
     * 保存對象
     * @param relationshipVoKey
     */
    void insertVo(TRelationshipsKey relationshipVoKey);

    /**
     * 根据id搜索
     * @param cid
     * @param mid
     * @return
     */
    List<TRelationshipsKey> getRelationshipById(Integer cid, Integer mid);

}
