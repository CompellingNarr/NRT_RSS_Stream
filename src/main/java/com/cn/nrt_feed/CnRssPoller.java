package com.cn.nrt_feed;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;


/**
 * @author: rbw - c62-asus - Sat Feb 13 21:21:42 EST 2016
 * 
 * Get data from an RSS feed.  Designed to be run as a thread.
 *
 */

// test - 

public class CnRssPoller
{
     static Logger log4j2 = LogManager.getLogger();

    /**
     * get data from RSS feed
     * 
     * @param url - RSS feed URL
     * @param outPathName - where to store RSS data
     */
    CnRssPoller(String urlArg, String outPathNameArg) {

        log4j2.trace("CnRssPoller(\"" + urlArg + "\", \""+
                outPathNameArg + "\")");
        
        HttpGet httpget = new HttpGet(urlArg);
        String  data =    httpget.getURI().toString();
        
        int a = 7;
        
    }
    
    public static void main( String[] args )
    {
        final String url =
                "http://rss.nytimes.com/services/xml/rss/nyt/HomePage.xml";
        final String outPathName = "/tmp/cn_rss_test_data.xml";
        CnRssPoller crp = new CnRssPoller(url, outPathName);
        System.out.println( "Hello World! - 2121" );
    }
}
