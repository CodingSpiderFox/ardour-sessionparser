package org.codingspiderfox.ardoursessionparser.parser;

import org.codingspiderfox.ardoursessionparser.model.ControllableType;
import org.codingspiderfox.ardoursessionparser.model.ProcessorType;
import org.codingspiderfox.ardoursessionparser.model.SessionType;
import org.codingspiderfox.ardoursessionparser.model.WindowsVstType;
import sun.nio.cs.UnicodeEncoder;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.*;
import java.util.Base64;


public class SessionParser {

    private JAXBContext jaxbContext;

    public SessionParser() throws JAXBException {
        jaxbContext = JAXBContext.newInstance("org.codingspiderfox.ardoursessionparser.model");
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        JAXBElement<SessionType> sessionElement = (JAXBElement<SessionType>)unmarshaller.unmarshal(new File("src/test/resources/testdata/testdata1.xml"));

        SessionType session = sessionElement.getValue();
        System.out.println(session.getProgramVersion().getCreatedWith());
        System.out.println(session.getClick().getProcessor().getCount());
        System.out.println(((ProcessorType)session.getRoutes().getRoute().get(3).getPresentationInfoOrControllableOrIO().get(13)).getName());

        String base64Chunk = ((WindowsVstType)((JAXBElement<Object>)((ProcessorType)session.getRoutes().getRoute().get(3).getPresentationInfoOrControllableOrIO().get(13)).getContent().get(17)).getValue()).getChunk();
        System.out.println(base64Chunk);

        byte[] bytes = Base64.getDecoder().decode(base64Chunk);


        try {

            System.out.print(new String(bytes, "UTF-8"));
        }
        catch (UnsupportedEncodingException ex) {

        }
    }

}
