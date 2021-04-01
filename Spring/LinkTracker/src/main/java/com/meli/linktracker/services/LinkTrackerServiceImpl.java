package com.meli.linktracker.services;

import com.meli.linktracker.dto.LinkDTO;
import com.meli.linktracker.dto.ResponseDTO;
import com.meli.linktracker.repositories.LinkTrackerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;

@Service
public class LinkTrackerServiceImpl implements LinkTrackerService{

    @Autowired
    private LinkTrackerRepository linkTrackerRepository;

    @Override
    public ResponseDTO createLink(String url) {
        return new ResponseDTO(linkTrackerRepository.addLink(url));
    }

    @Override
    public HttpHeaders redirectLink(Integer linkId) throws URISyntaxException {

        String url = linkTrackerRepository.searchLink(linkId);
        URI uri = new URI(url);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setLocation(uri);
        return httpHeaders;
    }

    @Override
    public LinkDTO getMetrics(Integer linkId) {
        return linkTrackerRepository.getMetrics(linkId);
    }

    @Override
    public HashMap<Integer, LinkDTO> getRepo() {
        return linkTrackerRepository.getMap();
    }

    @Override
    public void invalidateUrl(int key){
        var flag = linkTrackerRepository.getMap().get(key);
        flag.setValid(false);
        linkTrackerRepository.getMap().replace(key,flag);
    }
}
