package cn.valuetodays.sample.nacos.provider.controller;

import cn.valuetodays.sample.nacos.provider.client.Constants;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * .
 *
 * @author lei.liu
 * @since 2023-06-22 11:26
 */
@RestController
@RequestMapping(Constants.BASE_PATH_ECHO)
public class EchoController {
    @Value("${meta.title}")
    private String metaTitle;

    @PostMapping(value = "/text.do")
    public String text(@RequestBody String text) {
        return "Hello, " + text + " from Nacos Discovery " + metaTitle;
    }
}
