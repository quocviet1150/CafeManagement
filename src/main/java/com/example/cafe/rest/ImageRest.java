package com.example.cafe.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

@RequestMapping(path = "image")
public interface ImageRest {

    @PostMapping("/upload")
    ResponseEntity<String> uploadImage(@RequestParam String name,@RequestParam String description, @RequestParam MultipartFile file);

    @DeleteMapping("/delete/{id}")
    ResponseEntity<String> deleteImage( @PathVariable Integer id);

    @GetMapping("/get_image")
    ResponseEntity<Object> getImage();

    @PostMapping(path = "/update_status")
    ResponseEntity<String> update(@RequestBody(required = true) Map<String,String> requestMap);
}
