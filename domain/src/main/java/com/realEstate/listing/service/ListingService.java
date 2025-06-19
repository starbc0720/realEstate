package com.realEstate.listing.service;

import com.realEstate.listing.dto.ListSearchResponseTemp;
import com.realEstate.listing.dto.ListSearhRequest;

import java.util.List;

public interface ListingService {
    List<ListSearchResponseTemp> searchList(ListSearhRequest req);
}
