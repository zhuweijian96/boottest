package com.example.boottest.contorller;

import com.example.boottest.model.Comments;
import com.example.boottest.model.Res;
import com.example.boottest.model.Result;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedHashMap;
import java.util.TreeMap;

@RestController
public class Test {

    @RequestMapping(value = "/jsontest")
    public Object jsonTest(String str) throws ParseException {
//        RestTemplate restTemplate = new RestTemplate();
//        String result = restTemplate.getForObject("http://intf-dev.geely.com/wechatapplet/threadcomments?tid=752377&pageNo=1&pageSize=1000&tdsourcetag=s_pcqq_aiomsg",String.class);

//        JsonObject jsonObject = (JsonObject) new JsonParser().parse(str);
//        Result<Res> r = new Gson().fromJson(result,new Result<Res>().getClass());
//        System.out.println(r.getData().getClass());
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2018-12-16 12:18:19");
    }
}
