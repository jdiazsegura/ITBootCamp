package com.meli.linktracker.repositories;


import com.meli.linktracker.dto.LinkDTO;

import java.util.HashMap;
import java.util.Optional;

public interface LinkTrackerRepository {

    LinkDTO save(LinkDTO link);

    Optional<LinkDTO> findLinkByLinkId(Integer linkId);

    void delete(LinkDTO linkDTO);
}
