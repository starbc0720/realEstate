package com.realEstate.listing.service;

import com.realEstate.listing.dto.ListSearchRequest;
import com.realEstate.listing.dto.ListSearchResponse;

import java.util.List;

public interface ListingService {
    List<ListSearchResponse> searchList(ListSearchRequest req);
}
