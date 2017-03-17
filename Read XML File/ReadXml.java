/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readxml;

/**
 *
 * @author Ethan
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
     */
    
    public static void main(String[] args) {
            try {

	File fXmlFile = new File("/Users/Ethan/NetBeansProjects/ReadXML/src/readxml/employee.xml");
	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	Document doc = dBuilder.parse(fXmlFile);
	doc.getDocumentElement().normalize();
	NodeList nodeList = doc.getElementsByTagName("employee");
        
        String winTitle = "Employees";
        String message = "<html><head><style>body{padding:10px;}th{background-color: blue;color:yellow;}</style></head><body><h1>Acme Portable Hole Company</h1><table border='1' style='border-collapse:collapse;'><tr><th>Employee id</th><th>First Name</th><th>Last Name</th><th>Position</th><th>Salary</th></tr>";
        
	//System.out.println("Acme Portable Hole Company");

	for (int temp = 0; temp < nodeList.getLength(); temp++) {

		Node nNode = nodeList.item(temp);

		//System.out.println();
                
		if (nNode.getNodeType() == Node.ELEMENT_NODE) {

			Element eElement = (Element) nNode;
                        /*
			System.out.println("Employee id : " + eElement.getAttribute("id"));
			System.out.println("First Name : " + eElement.getElementsByTagName("firstname").item(0).getTextContent());
			System.out.println("Last Name : " + eElement.getElementsByTagName("lastname").item(0).getTextContent());
			System.out.println("Position : " + eElement.getElementsByTagName("position").item(0).getTextContent());
			System.out.println("Salary : " + eElement.getElementsByTagName("salary").item(0).getTextContent());
                        */
                        message += "<tr><td>" + eElement.getAttribute("id") + "</td><td>" + eElement.getElementsByTagName("firstname").item(0).getTextContent() + "</td><td>" + eElement.getElementsByTagName("lastname").item(0).getTextContent() + "</td><td>" + eElement.getElementsByTagName("position").item(0).getTextContent() + "</td><td>" + eElement.getElementsByTagName("salary").item(0).getTextContent()+"</td></tr>";
                        
		}     
	}
                        message += "</table></body><html>";
                        createWindow(winTitle, message);
    } catch (Exception e) {
	e.printStackTrace();
}
            //System.exit(0);
    }
    

public static void createWindow(String name, String msg)
    {
        JFrame frame = new JFrame(name);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel textLabel = new JLabel(msg,SwingConstants.CENTER); textLabel.setPreferredSize(new Dimension(450, 300)); 
        frame.getContentPane().add(textLabel, BorderLayout.CENTER); 
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
}

}
