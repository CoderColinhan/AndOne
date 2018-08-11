package com.mydog.website.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mydog.dao.TAttachMapper;
import com.mydog.entity.TAttach;
import com.mydog.entity.TAttachExample;
import com.mydog.website.service.IAttachService;
import com.mydog.website.utils.DateKit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by wangq on 2017/3/20.
 */
@Service
public class AttachServiceImpl implements IAttachService {
    private static final Logger LOGGER = LoggerFactory.getLogger(AttachServiceImpl.class);

    @Resource
    private TAttachMapper attachDao;

    @Override
    public PageInfo<TAttach> getAttachs(Integer page, Integer limit) {
        PageHelper.startPage(page, limit);
        TAttachExample attachVoExample = new TAttachExample();
        attachVoExample.setOrderByClause("id desc");
        List<TAttach> attachVos = attachDao.selectByExample(attachVoExample);
        return new PageInfo<>(attachVos);
    }

    @Override
    public TAttach selectById(Integer id) {
        if(null != id){
            return attachDao.selectByPrimaryKey(id);
        }
        return null;
    }

    @Override
    public void save(String fname, String fkey, String ftype, Integer author) {
        TAttach attach = new TAttach();
        attach.setFname(fname);
        attach.setAuthorId(author);
        attach.setFkey(fkey);
        attach.setFtype(ftype);
        attach.setCreated(DateKit.getCurrentUnixTime());
        attachDao.insertSelective(attach);
    }

    @Override
    public void deleteById(Integer id) {
        if (null != id) {
            attachDao.deleteByPrimaryKey( id);
        }
    }
}
