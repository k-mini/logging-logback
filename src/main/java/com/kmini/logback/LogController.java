package com.kmini.logback;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class LogController {

    @GetMapping("/log")
    public void log() {
        log.trace("TRACE 로그 메시지 입니다.");
        log.debug("DEBUG 로그 메시지 입니다.");
        log.info("INFO 로그 메시지 입니다.");
        log.warn("WARN 로그 메시지 입니다.");
        log.error("ERROR 로그 메시지 입니다.");
    }
}
