package com.meli.linktracker.services;

import com.meli.linktracker.dto.LinkDTO;
import com.meli.linktracker.dto.ResponseDTO;
import org.springframework.http.HttpHeaders;

import java.net.URISyntaxException;
import java.util.HashMap;

public interface LinkTrackerService {

    ResponseDTO createLink (String url);
    HttpHeaders redirectLink (Integer linkId) throws URISyntaxException;
    LinkDTO getMetrics(Integer linkId);
    HashMap<Integer, LinkDTO> getRepo();

    void invalidateUrl(int key);
}
