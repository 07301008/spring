package com.itlxl;

import com.itlxl.dao.UserDao;
import com.itlxl.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class App {
    public static void main(String[] args) throws IOException {
        // 1、加载MyBatis的核心配置文件，获取 SqlSessionFactory对象
        String resource = "SqlMapConfig.xml.bak";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 2、获取SqlSession对象，用它来执行SQL
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 3、执行SQL
        UserDao userDao = sqlSession.getMapper(UserDao.class);

        // 4、执行方法
        User user = userDao.selectById(2);

        // 5、打印
        System.out.println(user);

        // 6、释放资源
        sqlSession.close();
    }
}
