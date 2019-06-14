package dao;
import org.springframework.stereotype.Repository;
import pojo.TUser;

import java.util.List;

@Repository
public interface TUserDao {
    List<TUser> getUser();
}
