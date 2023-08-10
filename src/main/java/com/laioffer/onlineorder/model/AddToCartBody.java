package com.laioffer.onlineorder.model;


import com.fasterxml.jackson.annotation.JsonProperty;


public record AddToCartBody(
        @JsonProperty("menu_id") Long menuId
) {
}
