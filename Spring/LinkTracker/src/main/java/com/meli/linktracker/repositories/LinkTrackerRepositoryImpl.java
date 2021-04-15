package com.meli.linktracker.repositories;

import com.meli.linktracker.dto.LinkDTO;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class LinkTrackerRepositoryImpl implements LinkTrackerRepository {

    private final Map<Integer, LinkDTO> database = new HashMap<>();

    @Override
    public LinkDTO save(LinkDTO link) {
        if(link.getLink() == null){
            link.setLinkId(database.values().size());
        }
        database.put(link.getLinkId(), link);
        return link;
    }

    @Override
    public Optional<LinkDTO> findLinkByLinkId(Integer linkId) {
        LinkDTO linkDTO = database.get(linkId);
        return Optional.ofNullable(linkDTO);
    }

    @Override
    public void delete(LinkDTO linkDTO) {
        database.remove(linkDTO.getLinkId());
    }
}
