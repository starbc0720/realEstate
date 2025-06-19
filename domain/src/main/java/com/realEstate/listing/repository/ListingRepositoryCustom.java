package com.realEstate.listing.repository;

import com.realEstate.listing.Listing;
import com.realEstate.listing.dto.ListSearhRequest;

import java.util.List;

public interface ListingRepositoryCustom {
    List<Listing> searchListings(ListSearhRequest req);
}
