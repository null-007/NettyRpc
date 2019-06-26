package com.nettyrpc.client.proxy;

import com.nettyrpc.client.RPCFuture;

/**
 * Created by luxiaoxun on 2016/3/16.
 * hq 这个接口不是callback,只是提供了一种更加泛化的调用方式，也就是不需要引入 接口
 */
public interface IAsyncObjectProxy {
    RPCFuture call(String funcName, Object... args);
}