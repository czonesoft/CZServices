package yt.gk.demo2service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import yt.gk.demo2service.service.RemoteAPIDemo2Impl;

@RestController
public class Demo2HelloController {
    @Autowired
    private RemoteAPIDemo2Impl remoteServiceDemo1;

    /**
     * 访问样例 http://localhost:8887/hello?name=czj
     * 通过网关访问样例：http://10.2.161.197:8001/demo2/hello?name=czj
     * 实际调用了demo1提供的服务
     * @param name
     * @return
     */
    @RequestMapping("/hello")
    public String demo2hello(@RequestParam("name") String name){
        return remoteServiceDemo1.hello(name);
    }
}
