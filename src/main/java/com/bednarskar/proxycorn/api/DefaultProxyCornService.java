package com.bednarskar.proxycorn.api;

import com.bednarskar.proxycorn.api.model.Filter;
import com.bednarskar.proxycorn.api.model.Protocol;
import com.bednarskar.proxycorn.api.model.ProxyInstanceBasicInfo;

import java.util.HashSet;
import java.util.Set;

public class DefaultProxyCornService implements ProxyCornPlugin {
    @Override
    public String getName () {
        return "DefaultProxyCornService";
    }

    @Override
    public Set<ProxyInstanceBasicInfo> getProxyInstanceBasicInfo (Filter filter) throws Exception {
        Set<ProxyInstanceBasicInfo> proxyInstanceBasicInfoSet= new HashSet<>();
        proxyInstanceBasicInfoSet.add(new ProxyInstanceBasicInfo(Protocol.http, "127.0.0.1", 80));
        return proxyInstanceBasicInfoSet;
    }

}
