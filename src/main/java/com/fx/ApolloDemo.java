package com.fx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class ApolloDemo {

    @Autowired
    private AppConfig appConfig;
    @RequestMapping("/init.do")
    public String init(){
        System.out.println("page init...");
        return "index";
    }

    /**
     * win下在C:\opt\settings\\server.properties
     * apollo.meta=http://192.168.230.102:8080
     * @return
     */
    @RequestMapping("/apollo.do")
    @ResponseBody
    public String testapollo(){
        System.out.println("apollo...");
        return appConfig.getName();
    }
}
