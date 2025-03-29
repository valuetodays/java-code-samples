package cn.valuetodays.sample.nacos;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * .
 *
 * @author lei.liu
 * @since 2025-03-29
 */
@Slf4j
@Component
public class CommandLinerRunner0 implements CommandLineRunner {
    @Value("${meta.title}")
    private String metaTitle;

    @Override
    public void run(String... args) throws Exception {
        log.info("server {} started", metaTitle);
    }
}
