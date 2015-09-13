package com.cn.nrt_feed;

/**
 * @author: rbw
 * 
 * Get data from an RSS feed.  Designed to be run as a thread.
 *
 */
public class CnRssPoller
{
    /**
     * get data from RSS feed
     * 
     * @param url - RSS feed URL
     * @param outPathName - where to store RSS data
     */
    CnRssPoller(String urlArg, String outPathNameArg) {
        
    }
    
    public static void main( String[] args )
    {
        final String url =         "";
        final String outPathName = "/tmp/cn_rss_test_data.xml";
        CnRssPoller crp = new CnRssPoller(url, outPathName);
        
        System.out.println( "Hello World!" );
    }
}
