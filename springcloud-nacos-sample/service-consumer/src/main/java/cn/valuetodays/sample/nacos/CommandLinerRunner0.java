package cn.valuetodays.sample.nacos;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * .
 *
 * @author lei.liu
 * @since 2025-03-29
 */
@Slf4j
@Component
@EnableConfigurationProperties(RedisProperties.class)
public class CommandLinerRunner0 implements CommandLineRunner {
    @Value("${meta.title}")
    private String metaTitle;
    @Autowired
    private RedisProperties redisProperties;

    @Override
    public void run(String... args) throws Exception {
        log.info("server {} started, redis: {}", metaTitle, redisProperties.getHost());
    }
}
