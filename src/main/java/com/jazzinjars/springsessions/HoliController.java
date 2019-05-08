package com.jazzinjars.springsessions;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HoliController {

    private static final String template = "Holi, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/holi")
    public Holi holi(@RequestParam(value="name", defaultValue="Ke Ase?") String name) {
        return new Holi(counter.incrementAndGet(), String.format(template, name));
    }
}
