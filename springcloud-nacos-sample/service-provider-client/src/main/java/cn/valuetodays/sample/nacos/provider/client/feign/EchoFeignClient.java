package cn.valuetodays.sample.nacos.provider.client.feign;

import cn.valuetodays.sample.nacos.provider.client.Constants;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * .
 *
 * @author lei.liu
 * @since 2022-09-30
 */
@FeignClient(name = Constants.SERVICE_NAME,
    contextId = "EchoFeignClient",
    path = Constants.BASE_PATH_ECHO
)
public interface EchoFeignClient {
    @PostMapping("/text.do")
    String text(@RequestBody String text);
}
