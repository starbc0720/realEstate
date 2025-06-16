package com.realEstate.listing.repository;

import com.realEstate.listing.Listing;
import com.realEstate.listing.dto.ListSearchRequest;

import java.util.List;

public interface ListingRepositoryCustom {
    List<Listing> searchListings(ListSearchRequest req);
}
