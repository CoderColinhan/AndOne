package com.mydog.website.utils;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapCache {

    private static final int DEFAULT_CACHES = 1024;

    private static final MapCache INS = new MapCache();

    private Map<String, CacheObject> cachePool;

    public static MapCache single(){
        return INS;
    }

    public MapCache(){
        this(DEFAULT_CACHES);
    }

    public MapCache(int cacheCount){
        cachePool = new ConcurrentHashMap<>(cacheCount);
    }

    public <T> T get(String key){
        CacheObject cacheObject = cachePool.get(key);
        if(cacheObject!=null){
            long current = System.currentTimeMillis()/1000;
            if(cacheObject.getExpired()<=0 || cacheObject.getExpired()>current){
                Object result = cacheObject.getValue();
                return (T)result;
            }
        }

        return  null;
    }




    static class CacheObject{
        private String key;
        private Object value;
        private long expired;

        public  CacheObject(String key, Object value, long expired){
            this.key = key;
            this.value = value;
            this.expired = expired;
        }

        public String getKey() {
            return key;
        }

        public Object getValue() {
            return value;
        }

        public long getExpired() {
            return expired;
        }
    }



}
