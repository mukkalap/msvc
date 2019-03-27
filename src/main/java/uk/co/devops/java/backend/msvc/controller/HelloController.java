package uk.co.devops.java.backend.msvc.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    private static Logger log = LogManager.getLogger(HelloController.class);
    /**
     * Sample GET request
     * @param id
     * @return
     */
    @RequestMapping(value="/example/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String get(@PathVariable("id")Integer id) {
        log.info("DEMO A Received GET request with id : "+id);
        return "Hello world";
    }
}
