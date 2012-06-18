package demo.controller;

import demo.domain.json.JSONResponse;
import demo.domain.xml.XMLResponse;
import demo.service.ResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


//@Controller
public class SimpleControllerV2 {

    @Autowired
    private ResponseService responseService;

    /*METHOD 2*/
    @RequestMapping(value = "/get/response.json", method = RequestMethod.GET)
    public @ResponseBody JSONResponse getJsonResponse(){
        return responseService.getJsonResponse();
    }
    @RequestMapping(value = "/get/response.xml", method = RequestMethod.GET)
    public  @ResponseBody XMLResponse getXmlResponse(){
        return responseService.getXmlResponse();
    }
}
