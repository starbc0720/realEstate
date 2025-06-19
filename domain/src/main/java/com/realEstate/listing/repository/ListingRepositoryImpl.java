package com.realEstate.listing.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.realEstate.listing.Listing;
import com.realEstate.listing.QListing;
import com.realEstate.listing.dto.ListSearhRequest;
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
    public List<Listing> searchListings(ListSearhRequest req) {
        QListing listing = QListing.listing;

        return query
                .selectFrom(listing)
                .where(
                        ListingQueryConditions.titleStartsWidth(req.title()),
                        ListingQueryConditions.priceBetween(req.lowPrice(), req.highPrice()),
                        ListingQueryConditions.locStartsWith(req.loc()),
                        ListingQueryConditions.areaBetween(req.lowArea(), req.highArea()),
                        ListingQueryConditions.typeEq(req.type()),
                        ListingQueryConditions.constructionYearBetween(req.fromConstructionYear(), req.toConstructionYear())
                )
                .fetch();
    }
}
