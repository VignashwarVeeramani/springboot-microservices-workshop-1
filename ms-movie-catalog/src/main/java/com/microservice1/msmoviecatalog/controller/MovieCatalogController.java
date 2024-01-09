package com.microservice1.msmoviecatalog.controller;

import com.microservice1.msmoviecatalog.models.CatalogItem;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {

    @GetMapping("/{userId}")
    public List<CatalogItem> getCatalogItem(@PathVariable("userId") String userId) {
        return Collections.singletonList(
                new CatalogItem("Avatar", "Awesome Movie", 8)
        );
    }
}
