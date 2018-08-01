package yt.gk.demo1serviceapi.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/demo1api")
public interface Demo1Api {
    @RequestMapping(value = "/hello1", method = RequestMethod.GET)
    String hello(@RequestParam("name") String name);

//    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
//    User hello(@RequestHeader("name") String name,@RequestHeader("age") Integer age);
//
//    @RequestMapping(value = "/hello3", method = RequestMethod.POST)
//    String hello(@RequestBody User user);
}
