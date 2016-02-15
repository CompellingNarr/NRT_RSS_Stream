
package com.cn.xml;

import java.io.PrintStream;
import java.io.StringReader;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 * @file    CnSimpleXmlParser.java
 * @author  rbw
 * @date    1/2/2016
 * @purpose Convert an XML file to a simple list of XML nodes
 *          (Todo: enumerate members of each node, starting with
 *          FQN)
 * 
 *          Note: Entire XML file is stored and processed in memory.
 * 
 */
public class CnSimpleDomXmlParser {
    
    private static PrintStream SO = System.out;
    
    public CnSimpleDomXmlParser (String xmlPathNameArg) throws Exception 
    {
        String xmlStr = this.getStrFromFile(xmlPathNameArg);
        
        SO.println("TEXT:");
        SO.println(">>>");
        SO.println(xmlStr);
        SO.println("<<<");
        
        int a = 7;
        
    }
    
    private String getStrFromFile (String pathArg) throws java.io.IOException {
        final int BUF_SZ = 4096;
        StringBuffer fbSb = new StringBuffer(BUF_SZ);
        BufferedReader reader = new BufferedReader(
        new FileReader(pathArg));
        
        char[] buf = new char[BUF_SZ];
        int numRead;
        while ((numRead = reader.read(buf)) != -1) {
            String readData = String.valueOf(buf, 0, numRead);
            fbSb.append(buf);
        }
        
        reader.close();
        
        return fbSb.toString();
    }
    
    
    
    public static void main(String[] args) throws Exception {
        final String DEF_FILE =
                "E:\\data2\\cn\\rss_raw\\2015\\12\\31\\23" +
                "\\cn_rss_raw-news.washpost.world-20151231.2357.13.xml";
        String xmlFile = null;
        
        int argc = args.length;
        if (argc > 0) {
            xmlFile = args[0];
        }
        else {
            xmlFile = DEF_FILE;
        }
        
        SO.println("xmlFile: " + xmlFile);
        
        CnSimpleDomXmlParser dp = new CnSimpleDomXmlParser(xmlFile);
    }
    
}
