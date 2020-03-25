package com.bednarskar.proxycorn.api.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ProxyInstanceBasicInfo {
    private Enum<Protocol> protocol;
    private String ip;
    private Integer port;

    public ProxyInstanceBasicInfo(Enum<Protocol> protocol, String ip, Integer port) throws Exception {
        validate(port);
        this.protocol = protocol;
        this.ip = ip;
        this.port = port;
    }
    private void validate(Integer port) throws Exception {
        if (port < 0 || port >= 65535) throw new InvalidPortException("Invalid port: " + port);
    }
}
