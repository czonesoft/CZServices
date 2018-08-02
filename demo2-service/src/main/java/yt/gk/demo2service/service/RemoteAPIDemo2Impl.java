package yt.gk.demo2service.service;

import org.springframework.cloud.openfeign.FeignClient;
import yt.gk.demo1serviceapi.api.Demo1Api;

@FeignClient(name = "DEMO1-SERVICE"/*,url = "http://localhost:8885"*/)
public interface RemoteAPIDemo2Impl extends Demo1Api {
}