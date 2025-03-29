package cn.valuetodays.sample.nacos.consumer.controller;

import cn.valuetodays.sample.nacos.provider.client.feign.EchoFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * .
 *
 * @author lei.liu
 * @since 2023-06-22 11:30
 */

@RestController
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private EchoFeignClient echoFeignClient;

    @PostMapping(value = "/echo1.do")
    public String echo1(@RequestBody String str) {
        return restTemplate.postForObject("http://service-provider/echo/text.do", str, String.class);
    }

    @PostMapping(value = "/echo2.do")
    public String echo2(@RequestBody String str) {
        return echoFeignClient.text(str);
    }
}
