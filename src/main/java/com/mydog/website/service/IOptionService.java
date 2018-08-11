package com.mydog.website.service;

import com.mydog.entity.TOptions;

import java.util.List;
import java.util.Map;

public interface IOptionService {

    void insertOption(TOptions optionVo);

    void insertOption(String name, String value);

    List<TOptions> getOptions();


    /**
     * 保存一组配置
     *
     * @param options
     */
    void saveOptions(Map<String, String> options);

}
