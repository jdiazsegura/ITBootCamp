package com.meli.linktracker.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class LinkDTO {

    private Integer linkId;
    private String link;
    private String password;
    private Integer count;

    public LinkDTO() {
        this.count = 0;
    }
}
