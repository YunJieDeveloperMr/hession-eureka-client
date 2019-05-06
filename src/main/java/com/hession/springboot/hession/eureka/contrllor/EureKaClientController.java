package com.hession.springboot.hession.eureka.contrllor;


import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class EureKaClientController {

    /**
     * 假如这个客户端要提供一个getUser的方法
     * @return
     */
    @RequestMapping(value = "/getUser" , method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> getUser(@RequestParam("id") Integer id){
        Map<String,Object> data = new HashMap<>();
        data.put("id",id);
        data.put("userName","admin");
        data.put("from","provider-A");
        return data;
    }

}
