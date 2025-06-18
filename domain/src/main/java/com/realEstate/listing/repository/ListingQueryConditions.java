package com.realEstate.listing.repository;

import com.querydsl.core.types.dsl.BooleanExpression;
import com.realEstate.enums.BuildType;
import com.realEstate.listing.QListing;
import org.springframework.util.StringUtils;

public class ListingQueryConditions {

    private static final QListing listing = QListing.listing;

    public static BooleanExpression titleStartsWidth(String title) {
        return StringUtils.hasText(title) ? listing.title.startsWith(title) : null;
    }

    public static BooleanExpression priceBetween(Long low, Long high) {
        if (low != null && high != null) {
            return listing.price.between(low, high);
        } else if (low != null) {
            return listing.price.goe(low);
        } else if (high != null) {
            return listing.price.loe(high);
        } else {
            return null;
        }
    }

    public static BooleanExpression locStartsWith(String loc) {
        return StringUtils.hasText(loc) ? listing.loc.startsWith(loc) : null;
    }

    public static BooleanExpression areaBetween(Float low, Float high) {
        if(low != null && high != null){
            return listing.area.between(low, high);
        } else if(low != null){
            return listing.area.goe(low);
        } else if(high != null){
            return listing.area.loe(high);
        } else {
            return null;
        }
    }

    public static BooleanExpression typeEq(String typeLabel) {
        if (!StringUtils.hasText(typeLabel)) return null;
        BuildType type = BuildType.fromLabel(typeLabel);
        return type != null ? listing.type.eq(type) : null;
    }

    public static BooleanExpression constructionYearBetween(Integer from, Integer to){
        if (from != null && to != null) {
            return listing.constructionYear.between(from, to);
        } else if (from != null) {
            return listing.constructionYear.goe(from);
        } else if (to != null) {
            return listing.constructionYear.loe(to);
        } else {
            return null;
        }
    }
}
