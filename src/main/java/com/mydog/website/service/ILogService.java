package com.mydog.website.service;

import com.mydog.entity.TLogs;

import java.util.List;

public interface ILogService {

    void insertLog(TLogs tLogs);
    void insertLog(String action, String data, String ip, Integer authorId);
    List<TLogs> getLogs(int page, int limit);
}
