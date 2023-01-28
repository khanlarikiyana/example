package com.example.example.controller;


import com.example.example.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class InfoController {

    @Autowired
    private InfoService infoService;

    @GetMapping(value = "/info/{name}")
    public String getInfo(){
        return infoService.getInfo("name");
    }


    @GetMapping(value = "/first")
    public String firstRest(){
        return "first Rest";
    }
    @GetMapping(value = "/second")
    public String secondRest(){
        return "second Rest";
    }
    @PostMapping(value = "/post")
    public String postRest(){
        return "post Rest";
    }
    @RequestMapping(value = "/request", method = RequestMethod.GET)
    public String requestRest(){ return "request Rest";
    }
    @DeleteMapping("/delete")
    public String deleteRest(){
        return "Delete Rest";
    }
    @PutMapping("/put")
    public String putRest(){
        return "put Rest";
    }


    @GetMapping("v2/info")
    public String getInfov2(@RequestParam String family){
        return infoService.getInfo(family);
    }
     @GetMapping("V3/info")
    public String getInfov3(@RequestParam String s) {
        return infoService.getInfo(s);
    }
}
