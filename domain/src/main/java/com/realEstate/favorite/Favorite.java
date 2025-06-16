package com.realEstate.favorite;

import com.realEstate.BaseEntity;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Favorite extends BaseEntity {

    private String userId;

    private String listingId;
}
