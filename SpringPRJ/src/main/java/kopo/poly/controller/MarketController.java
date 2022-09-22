package kopo.poly.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class MarketController {
    @GetMapping("/mypage")
    public String mypage() throws Exception
    {
        log.info("{}.indexPage Start !!",this.getClass().getName());
        log.info("{}.indexPage End !!",this.getClass().getName());
        return "/mypage";
    }
    @GetMapping(path = "/main")
    public String main()throws Exception {
        return "/index";
    }
}
