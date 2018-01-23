package com.ron.paradise;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ron.paradise.demo.entity.TUser;
import com.ron.paradise.demo.mapper.DemoMapper;

/**
 * Unit test for simple App.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTest 
    extends TestCase
{
	
	@Autowired
	private DemoMapper demoMapper;
	
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }
    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    public void testMybatis()
    {
//    	Example ex = new Example(TUser.class);
//    	examp
    	TUser user = new TUser();
    	user.setPwd("111");
    	user.setName("2222");
    	demoMapper.insertSelective(user);
    }
}
