package org.example;

import org.example.service.PrintData;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {

        PrintData.printDataObjects("1900-01-01", "1418203", "1459810", "1457388", "96129242");
    }
}