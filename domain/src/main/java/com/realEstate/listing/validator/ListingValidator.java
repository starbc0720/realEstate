package com.realEstate.listing.validator;

import org.springframework.stereotype.Component;

import java.time.Year;

@Component
public class ListingValidator {

    public static <T extends Comparable<T>> void validateRange(T from, T to, String label) {
        if (from != null && to != null && from.compareTo(to) > 0) {
            throw new IllegalArgumentException(label + "의 최소값은 최대값보다 작거나 같아야 합니다.");
        }
    }

    public static void validateYearNotFuture(Integer from, Integer to, String label) {
        int cur = Year.now().getValue();
        if (from != null && from > cur) {
            throw new IllegalArgumentException(label + "의 시작연도는 현재 연도보다 클 수 없습니다.");
        }
        if (to != null && to > cur) {
            throw new IllegalArgumentException(label + "의 종료연도는 현재 연도보다 클 수 없습니다.");
        }
    }
}
