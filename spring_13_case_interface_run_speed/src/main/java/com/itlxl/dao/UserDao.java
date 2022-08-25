package com.itlxl.dao;

import com.itlxl.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserDao {

    @Insert("insert into tb_user(name, money) VALUES(#{name},#{money})")
    void add(User user);

    @Delete("delete from tb_user where id = #{id}")
    void delete(int id);

    @Update("update tb_user set name = #{name} , money = #{money} where id = #{id}")
    void update(User user);

    @Select("select * from tb_user")
    List<User> selectAll();

    @Select("select * from tb_user where id = #{id}")
    User selectById(int id);
}
