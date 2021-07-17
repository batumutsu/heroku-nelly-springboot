package com.nelly.restservice.service;

import com.nelly.restservice.models.Photos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PhotosService {

    @Autowired
    private RestTemplate restTemplate;

    private static final String baseURL = "https://jsonplaceholder.typicode.com/photos?albumId=";
    List<Photos> listOfPhotos = new ArrayList<Photos>();
    public List<Photos> getAllPhotos(String albumId) {
        try {
            Photos[] photos = restTemplate.getForObject(baseURL + albumId, Photos[].class);
            listOfPhotos = Arrays.asList(photos);
            return listOfPhotos;
        }catch (HttpClientErrorException e) {
            //System.out.println(e.getStatusCode());
            return listOfPhotos;
        }catch (Exception e){
            e.printStackTrace();
            return listOfPhotos;
        }
    }
}
