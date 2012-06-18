package demo.service;

import demo.domain.json.JSONResponse;
import demo.domain.xml.XMLResponse;


public interface ResponseService {

    public JSONResponse getJsonResponse();

    public XMLResponse getXmlResponse();

}
