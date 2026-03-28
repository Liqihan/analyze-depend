package com.grove.dingtalk.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dingtalk")
public class DingTalkController {

    @PostMapping("/callback")
    public String receive(@RequestBody String body) {
        System.out.println("Received from DingTalk: " + body);
        return "ok";
    }
}