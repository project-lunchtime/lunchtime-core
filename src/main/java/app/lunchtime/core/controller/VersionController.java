package app.lunchtime.core.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController {

    @Value("${application.version}")
    private String appVersion;

    @RequestMapping
    public String appVersion() {
        return appVersion;
    }
}
