package demo.service;


import demo.domain.json.JSONResponse;
import demo.domain.xml.XMLResponse;
import org.springframework.stereotype.Service;


@Service
public class ResponseServiceImpl implements ResponseService{



    @Override
    public JSONResponse getJsonResponse() {
        JSONResponse response = new JSONResponse();
        response.setSurname("XXX");
        response.setName("YYY");
        return response;
    }

    @Override
    public XMLResponse getXmlResponse() {
        XMLResponse events = new XMLResponse();
        events.setSurname("XXX");
        events.setName("YYY");
        return events;
    }
}
