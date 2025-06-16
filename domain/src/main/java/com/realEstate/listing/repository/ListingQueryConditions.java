package com.realEstate.listing.repository;

import com.querydsl.core.types.dsl.BooleanExpression;
import com.realEstate.enums.BuildType;
import com.realEstate.listing.QListing;
import org.springframework.util.StringUtils;

public class ListingQueryConditions {

    private static final QListing listing = QListing.listing;

    public static BooleanExpression priceLte(Long price) {
        return price != null ? listing.price.loe(price) : null;
    }

    public static BooleanExpression locContains(String loc) {
        return StringUtils.hasText(loc) ? listing.loc.startsWith(loc) : null;
    }

    public static BooleanExpression areaGte(Float area) {
        return area != null ? listing.area.goe(area) : null;
    }

    public static BooleanExpression typeEq(String typeLabel) {
        if(!StringUtils.hasText(typeLabel)) return null;
        BuildType type = BuildType.fromLabel(typeLabel);
        return type !=  null ? listing.type.eq(type) : null;
    }

    public static BooleanExpression floorLte(Integer floor){
        return floor != null ? listing.floor.loe(floor) : null;
    }
}
