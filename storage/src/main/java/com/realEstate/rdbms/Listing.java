package com.realEstate.rdbms;

import com.realEstate.rdbms.common.BaseEntity;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Listing extends BaseEntity {

    private String title;
    private String desc;
    private String price;
    private String loc;
    private Long area;


}
