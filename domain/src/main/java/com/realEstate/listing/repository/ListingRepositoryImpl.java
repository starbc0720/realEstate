package com.realEstate.listing.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.realEstate.listing.Listing;
import com.realEstate.listing.QListing;
import com.realEstate.listing.dto.ListSearchRequest;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ListingRepositoryImpl implements ListingRepositoryCustom {

    private final JPAQueryFactory query;
    private final EntityManager em;

    @Override
    public List<Listing> searchListings(ListSearchRequest req) {
        QListing listing = QListing.listing;

        return query
                .selectFrom(listing)
                .where(
                        ListingQueryConditions.priceLte(req.price()),
                        ListingQueryConditions.locContains(req.loc()),
                        ListingQueryConditions.areaGte(req.area()),
                        ListingQueryConditions.floorLte(req.floor()),
                        ListingQueryConditions.typeEq(req.type())
                )
                .fetch();
    }
}
