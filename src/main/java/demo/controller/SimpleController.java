package demo.controller;

import demo.domain.json.JSONResponse;
import demo.domain.xml.XMLResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import demo.service.ResponseService;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class SimpleController {

    @Autowired
    private ResponseService responseService;

    @RequestMapping(value = "/get/response.json", method = RequestMethod.GET)
    public JSONResponse getJsonResponse(){
        return responseService.getJsonResponse();
    }
    @RequestMapping(value = "/get/response.xml", method = RequestMethod.GET)
    public  XMLResponse getXmlResponse(){
        return responseService.getXmlResponse();
    }

}
