package com.mongodb.home51.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Data
@Document
public class Artist {
    @Id
    private String id;

    @Indexed
    private String name;

    @DBRef
    private List<Composition> compositions = new ArrayList<>();
    @DBRef
    private List<Album> albums = new ArrayList<>();
}
