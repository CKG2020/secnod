package com.example.javaanli.demo.controller1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CasherIndexController {



    @RequestMapping(value = "bindexcash.html", method = RequestMethod.GET)
    public String first(){
        return "bindexcash";
    }

    @RequestMapping(value = "bseenews.html", method = RequestMethod.GET)
    public String secnod(){
        return "bseenews";
    }

    @RequestMapping(value = "bmember.html", method = RequestMethod.GET)
    public String third(){
        return "bmember";
    }

    @RequestMapping(value = "bsalemanagement.html", method = RequestMethod.GET)
    public String fourth(){
        return "bsalemanagement";
    }

    @RequestMapping(value = "bcash.html", method = RequestMethod.GET)
    public String fifth(){
        return "bcash";
    }

}
