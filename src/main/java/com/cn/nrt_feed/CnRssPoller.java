package com.cn.nrt_feed;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/**
 * @author: rbw
 * 
 * Get data from an RSS feed.  Designed to be run as a thread.
 *
 */
public class CnRssPoller
{
     //static Logger log4j2 = LogManager.getLogger();

    /**
     * get data from RSS feed
     * 
     * @param url - RSS feed URL
     * @param outPathName - where to store RSS data
     */
    CnRssPoller(String urlArg, String outPathNameArg) {
/*
 *  todo: fix log4j2
 *
        log4j2.trace("CnRssPoller(\"" + urlArg + "\", \""+
                outPathNameArg + "\")");
*/
        
    }
    
    public static void main( String[] args )
    {
        final String url =
                "http://rss.nytimes.com/services/xml/rss/nyt/HomePage.xml";
        final String outPathName = "/tmp/cn_rss_test_data.xml";
        CnRssPoller crp = new CnRssPoller(url, outPathName);
        System.out.println( "Hello World! - 1158" );
    }
}
