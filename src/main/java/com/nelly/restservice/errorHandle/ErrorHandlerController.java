package com.nelly.restservice.errorHandle;

import com.nelly.restservice.models.Photos;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ErrorHandlerController implements ErrorController {

    @RequestMapping("/error")
    @ResponseBody
    public List<Photos> getErrorPath() {
        List<Photos> listOfPhotos = new ArrayList<Photos>();
        return  listOfPhotos;
    }
}
