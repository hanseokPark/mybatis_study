package kr.or.dgit.mybatis_study;

import org.apache.ibatis.session.SqlSessionFactory;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.mybatis_study_util.MyBatisSqlSessionFactory;

public class MybatisSqlSessionFactoryTest {
	private static SqlSessionFactory factory;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		factory = MyBatisSqlSessionFactory.getSqlSessionFactory();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		factory = null;
	}

	@Test
	public void test() {
		Assert.assertNotNull(factory);
	}
}
