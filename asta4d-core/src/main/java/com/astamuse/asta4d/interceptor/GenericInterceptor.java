package com.astamuse.asta4d.interceptor;

public interface GenericInterceptor<H> {

    public boolean beforeProcess(H executionHolder) throws Exception;

    public void afterProcess(H executionHolder, Exception ex) throws Exception;
}
