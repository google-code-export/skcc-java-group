package com.skcc.javagroup;

import java.sql.Connection;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.skcc.javagroup.myweb.User;
import com.skcc.javagroup.myweb.UserDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:myweb-context.xml")
public class DaoTest {
	
	@Resource
	DataSource dataSource;
	
	@Resource
	UserDao userDao;
	
	@Test
	public void testDataSource() throws SQLException{
		User user = new User(3, "Lee", "2222");
		userDao.createUser(user);
		System.out.println(userDao.getAllUsers());
	}
	
	public static void main(String args[]){
		checkDataSource();
		
	}

	private static void checkDataSource() {
		ApplicationContext context = new ClassPathXmlApplicationContext("daotest-context.xml");
		DataSource dataSource = context.getBean(DataSource.class);
		Connection con = null;
		try {
			con = dataSource.getConnection();
			System.out.println(con.isReadOnly());
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(con != null)
				try {
					con.close();
				} catch (SQLException e) {
				}
		}
	}
}
