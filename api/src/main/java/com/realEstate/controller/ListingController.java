package com.realEstate.controller;

import com.realEstate.listing.dto.ListSearchResponseTemp;
import com.realEstate.listing.dto.ListSearhRequest;
import com.realEstate.listing.service.ListingService;
import com.realEstate.response.SuccessApiResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/listing")
public class ListingController {

    private  final ListingService listingService;

    // 부동산 목록 조회
    @PostMapping("/search")
    public SuccessApiResponse<List<ListSearchResponseTemp>> searchList(@RequestBody @Valid ListSearhRequest req){
        List<ListSearchResponseTemp> res = listingService.searchList(req);
        return SuccessApiResponse.of(HttpStatus.OK.value(), res);
    }

    // 부동산 목록 등록
//    @PostMapping("/regist")
//    public SuccessApiResponse<>
}
