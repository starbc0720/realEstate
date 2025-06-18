package com.realEstate.listing.service;

import com.realEstate.listing.Listing;
import com.realEstate.listing.dto.ListSearchRequest;
import com.realEstate.listing.dto.ListSearchResponse;
import com.realEstate.listing.repository.ListingRepository;
import com.realEstate.listing.validator.ListingValidator;
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

        //유효성 검사
        ListingValidator.validateRange(req.getLowPrice(), req.getHighPrice(), "매물가격");
        ListingValidator.validateRange(req.getLowArea(), req.getHighArea(), "면적");
        ListingValidator.validateYearNotFuture(req.getFromConstructionYear(), req.getToConstructionYear(), "준공연도");
        ListingValidator.validateRange(req.getFromConstructionYear(), req.getToConstructionYear(), "준공연도");

        return Optional.ofNullable(listings)
                .orElse(Collections.emptyList())
                .stream()
                .map(ListSearchResponse::fromEntity)
                .toList();
    }
}
