package com.realEstate.listing.repository;

import com.realEstate.listing.Listing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListingRepository extends JpaRepository<Listing, String>, ListingRepositoryCustom {

}
