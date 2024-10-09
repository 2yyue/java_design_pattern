package com.fatey.liu;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * @ClassName: XMLUtil
 * @Description: XML配置文件操作类
 * @Author Liu_King
 * @Date 2024/5/14 2:33
 * @Version: v1.0
 */
public class XMLUtil {
    public static String getStringParm() {
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document doc = documentBuilder.parse(new File("src/main/java/com/fatey/liu/config.xml"));
            NodeList stringParm = doc.getElementsByTagName("StringParm");
            Node firstChild = stringParm.item(0).getFirstChild();
            return firstChild.getNodeValue().trim();
        } catch (ParserConfigurationException | IOException | SAXException eParm) {
            throw new RuntimeException(eParm);
        }
    }
}
