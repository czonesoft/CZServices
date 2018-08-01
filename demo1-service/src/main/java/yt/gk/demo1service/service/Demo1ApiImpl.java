package yt.gk.demo1service.service;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import yt.gk.demo1serviceapi.api.Demo1Api;

@RestController
public class Demo1ApiImpl implements Demo1Api {
    @Override
    public String hello(@RequestParam("name") String name) {
        return "hello " + name;
    }
}
