package com.nelly.restservice;

import com.nelly.restservice.models.Photos;
import com.nelly.restservice.service.PhotosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@CrossOrigin
@RestController
@RequestMapping(value = "/photos")
public class PhotosController {

    @Autowired
    PhotosService service;


    @GetMapping("/{albumId}")
    public List<Photos> get(@PathVariable("albumId") String albumId) {
        return service.getAllPhotos(albumId);
    }
}
