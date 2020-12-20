package com.io.aio;

import java.io.IOException;

/**
* AIO服务端启动类
**/
public class BootStrap {
    public  static void main(String[] args) throws IOException {
        new Thread(new AioServer(8080)).start();
    }
}
