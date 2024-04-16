package dev.naspo.photosclone;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

// The @RestController annotation defines a class as a REST controller. (The class handles requests).
@RestController
public class MyController {

    // mock database of photos.
    private List<Photo> db = List.of(new Photo("1", "hello.jpg"));

    // @GetMapping("/route") defines this method as a GET method for the specified route.
    @GetMapping("/")
    public String hello() {
        return "Hello World";
    }

    // Spring Boot will automatically convert the List object of photos into JSON, and return that.
    @GetMapping("/photos")
    public List<Photo> getPhotos() {
        return db;
    }

    // @PathVariable sets the parameter variable in the URL to the method parameter.
    @GetMapping("/photos/{id}")
    public Photo getPhoto(@PathVariable String id) {
        for (Photo p : db) {
            if (p.getId().equals(id)) {
                return p;
            }
        }

        return null;
    }
}
