package com.realEstate.listing.service;

import com.realEstate.listing.Listing;
import com.realEstate.listing.dto.ListSearchRequest;
import com.realEstate.listing.dto.ListSearchResponse;
import com.realEstate.listing.repository.ListingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ListingServiceImpl implements ListingService{

    private final ListingRepository listingRepository;

    @Transactional(readOnly = true)
    @Override
    public List<ListSearchResponse> searchList(ListSearchRequest req) {
        List<Listing> listings = listingRepository.searchListings(req);

        return Optional.ofNullable(listings)
                .orElse(Collections.emptyList())
                .stream()
                .map(ListSearchResponse::fromEntity)
                .toList();
    }
}
