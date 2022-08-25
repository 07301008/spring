package com.itlxl.dao;

import com.itlxl.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserDao {
    @Update("update tb_user set money = money - #{money} where name = #{name}")
    void outmoney(@Param("name") String name,@Param("money") Double money);

    @Update("update tb_user set money = money + #{money} where name = #{name}")
    void inmoney(@Param("name") String name,@Param("money") Double money);
}
