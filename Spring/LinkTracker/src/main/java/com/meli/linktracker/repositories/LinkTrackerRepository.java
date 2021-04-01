package com.meli.linktracker.repositories;


import com.meli.linktracker.dto.LinkDTO;

import java.util.HashMap;

public interface LinkTrackerRepository {

    Integer addLink(String url);
    String searchLink(Integer linkId);
    LinkDTO getMetrics(Integer linkId);
    HashMap<Integer, LinkDTO> getMap();
}
