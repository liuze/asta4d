package com.astamuse.asta4d.interceptor;

import com.astamuse.asta4d.render.Renderer;

public interface PageInterceptor {

    public Renderer beforePageRendering();

    public Renderer afterPageRendering();
}
