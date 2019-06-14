package service;

import dao.TUserDao;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import pojo.TUser;

import java.util.List;

@Service
public class TUserService  {

    @Autowired
    public TUserDao tUserDao;
    @Autowired
    public RedisTemplate<String,String> redisTemplate;

    public List<TUser> getUser(){

        List list=tUserDao.getUser();
        return list;
    }
}
