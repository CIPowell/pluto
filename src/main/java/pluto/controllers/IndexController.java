package pluto.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
class IndexController {

    @Value("${application.name}")
    private String applicationName;

    @Value("${build.version}")
    private String version;

    @RequestMapping(path = "/", method = { RequestMethod.GET })
    public String welcomeMessage() {
        return String.format("{ \"name\": \"%s\", \"version\":\"%s\" }", this.applicationName, this.version);
    }
}