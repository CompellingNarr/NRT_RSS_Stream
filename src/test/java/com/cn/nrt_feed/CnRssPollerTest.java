package com.cn.nrt_feed;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple CnRssPoller.
 */
public class CnRssPollerTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public CnRssPollerTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( CnRssPollerTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testCnRssPoller()
    {
        assertTrue( true );
    }
}
