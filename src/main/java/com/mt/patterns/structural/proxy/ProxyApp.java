package com.mt.patterns.structural.proxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ProxyApp {

    static void main() {
        log.info("########### Create Client");
        Subject client = new Proxy();
        client.performAction("CLIENT");

        log.info("########## Create Server");
        Subject server = new Proxy();
        server.performAction("ADMIN");
    }
}
