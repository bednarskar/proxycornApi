package com.bednarskar.proxycorn.api;

import com.bednarskar.proxycorn.api.model.Filter;
import com.bednarskar.proxycorn.api.model.ProxyInstanceBasicInfo;

import java.util.Set;

public interface ProxyCornPlugin {
    String getName ();
    Set<ProxyInstanceBasicInfo> getProxyInstanceBasicInfo(Filter filter) throws Exception;
}
