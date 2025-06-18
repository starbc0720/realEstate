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
                        ListingQueryConditions.titleStartsWidth(req.getTitle()),
                        ListingQueryConditions.priceBetween(req.getLowPrice(), req.getHighPrice()),
                        ListingQueryConditions.locStartsWith(req.getLoc()),
                        ListingQueryConditions.areaBetween(req.getLowArea(), req.getHighArea()),
                        ListingQueryConditions.typeEq(req.getType()),
                        ListingQueryConditions.constructionYearBetween(req.getFromConstructionYear(), req.getToConstructionYear())
                )
                .fetch();
    }
}
