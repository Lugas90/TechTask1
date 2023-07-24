package org.example.service;

import org.example.model.AddressObjects;
import org.example.model.Objects;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintData {

    public static void printDataObjects(String startDate, String... objectId) throws IOException, ParserConfigurationException, SAXException {

        String objId;
        String typeName;
        String name;

        Parser parser = new Parser();
        AddressObjects addressObjects = parser.parse();
        List<Objects> objectsArrayList = new ArrayList<>(addressObjects.getObjects());
        List<String> objectsId = new ArrayList<>(Arrays.asList(objectId));

        for (Objects obj : objectsArrayList) {
            for (String i : objectsId) {
                if (startDate.equals(obj.getStartDate()) && i.contains(obj.getObjectId())) {
                    objId = i;
                    typeName = obj.getTypeName();
                    name = obj.getName();
                    Objects newObj = new Objects(objId, typeName, name);
                    System.out.println(newObj.getObjectId() + ": " + newObj.getTypeName() + " " + newObj.getName());
                }
            }
        }
    }
}
