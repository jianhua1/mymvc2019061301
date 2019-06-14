package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pojo.TUser;
import service.TUserService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TUserController {
    @Autowired
    TUserService userService;

    @Autowired
    RedisTemplate<String,String> redisTemplate;
    @Autowired
    Send send;
    @Autowired
    Receive receive;

   /* @ResponseBody
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public List<TUser> getUser() {
        List<TUser> list=new ArrayList<>();
        String aa = redisTemplate.opsForValue().get("aa");
        if(StringUtils.isEmpty(aa)){
            list = userService.getUser();
            redisTemplate.opsForList().leftPushAll("aa",list);
        }else{
        }
        return list;
    }*/

    @ResponseBody
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public void getUser() {
        String aa = redisTemplate.opsForValue().get("aa");
        if(StringUtils.isEmpty(aa)){
            redisTemplate.opsForValue().set("aa","123");
        }
        System.out.println(redisTemplate.opsForValue().get("aa"));
        send.doSend();
    }

    @ResponseBody
    @RequestMapping(value = "/user2", method = RequestMethod.GET)
    public String getUser2() {
        System.out.println("aaaa");
        return "ab";
    }
}
