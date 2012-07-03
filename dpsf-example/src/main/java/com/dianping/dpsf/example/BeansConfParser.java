package com.dianping.dpsf.example;

import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.xml.DOMConfigurator;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;


/**    
  * <p>    
  * Title: BeansConfParser.java   
  * </p>    
  * <p>    
  * Description: 描述  
  * </p>   
  * @author saber miao   
  * @version 1.0    
  * @created 2010-10-11 下午04:48:32   
  */ 
public class BeansConfParser {

    public static String[] classPathParse(final String xmlNameOfClassPath) throws DocumentException{
        final SAXReader reader = new SAXReader();
        final URL beansURL = BeansConfParser.class.getClassLoader().getResource(xmlNameOfClassPath);
        final Document document = reader.read(beansURL);
        final Element root = document.getRootElement();
        final List<String> beanList = new ArrayList<String>();
        for(final Iterator el=root.elementIterator();el.hasNext();){
            beanList.add(((Element)el.next()).getTextTrim());
        }
        final String[] beanConfs = new String[beanList.size()];
        return beanList.toArray(beanConfs); 
    }
    


    public static void main(final String[] args) throws DocumentException{
        final String[] beans = classPathParse("project-biz-services.xml");
        for(final String xml : beans){
            System.out.println(xml);
        }
    }

}
