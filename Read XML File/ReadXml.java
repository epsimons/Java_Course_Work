/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readxml;

/**
 * 
 * @author Ethan
 * @version 2.1
 * @since March 17, 2017
 * @see IOException
 * 
 */

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.*;
import java.awt.*;
import javax.swing.*;

public class ReadXML {

    /**
     * @param args the command line arguments
     * 
     * 
     * <p>About this section:<br> This section reads the XML file and loads the values into a string. The string is then displayed in a generated window.</p>
     */
    
    public static void main(String[] args) {
	    /* use try to prevent crashes */
            try {
	/* assign the file to an object */
	File fXmlFile = new File("/Users/Ethan/NetBeansProjects/ReadXML/src/readxml/employee.xml");
	/* the file gets parsed and the values inside the xml tags are read */
	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	Document doc = dBuilder.parse(fXmlFile);
	doc.getDocumentElement().normalize();
	NodeList nodeList = doc.getElementsByTagName("employee");
        
	/* prepare to iterate through and display file contents */
        String winTitle = "Employees";
        String message = "<html><head><style>body{padding:10px;}th{background-color: blue;color:yellow;}</style></head><body><h1>Acme Portable Hole Company</h1><table border='1' style='border-collapse:collapse;'><tr><th>Employee id</th><th>First Name</th><th>Last Name</th><th>Position</th><th>Salary</th></tr>";
        
	for (int temp = 0; temp < nodeList.getLength(); temp++) {

		Node nNode = nodeList.item(temp);

		
		if (nNode.getNodeType() == Node.ELEMENT_NODE) {

			Element eElement = (Element) nNode;
                        
                        message += "<tr><td>" + eElement.getAttribute("id") + "</td><td>" + eElement.getElementsByTagName("firstname").item(0).getTextContent() + "</td><td>" + eElement.getElementsByTagName("lastname").item(0).getTextContent() + "</td><td>" + eElement.getElementsByTagName("position").item(0).getTextContent() + "</td><td>" + eElement.getElementsByTagName("salary").item(0).getTextContent()+"</td></tr>";
                        
		}     
	}
		    	/* add more content to the message */
                        message += "</table></body><html>";
                        /**
                         * @see message
                         */
		    
		    /* create the window to display the data */
                        createWindow(winTitle, message);
    } catch (Exception e) {
	e.printStackTrace();
}
     
    }
    
    /**
     *
     * @param name Takes the name string and adds it to the title
     * @param msg Takes the msg string and adds content to the body
     * 
     * <br>This section was originally in WindowTest.java
     * I combined the two and added formatting for the table via HTML and CSS
     */
    
    public static void createWindow(String name, String msg)
    {
        JFrame frame = new JFrame(name);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel textLabel = new JLabel(msg,SwingConstants.CENTER); 
        // Add JScrollPane to add scrolling functionality
        JScrollPane scroll = new JScrollPane(textLabel);
        textLabel.setPreferredSize(new Dimension(450, 300)); 
        frame.getContentPane().add(scroll, BorderLayout.CENTER); 
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
}

}
