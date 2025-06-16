package com.realEstate.controller;

import com.realEstate.listing.dto.ListSearchRequest;
import com.realEstate.listing.dto.ListSearchResponse;
import com.realEstate.listing.service.ListingService;
import com.realEstate.response.SuccessApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/listing")
public class ListingController {

    private  final ListingService listingService;

    @GetMapping("/search")
    public SuccessApiResponse<List<ListSearchResponse>> searchList(@RequestBody ListSearchRequest req){
        List<ListSearchResponse> res = listingService.searchList(req);
        return SuccessApiResponse.of(HttpStatus.OK.value(), res);
    }
}
