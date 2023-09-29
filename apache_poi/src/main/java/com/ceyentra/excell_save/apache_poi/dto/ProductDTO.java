package com.ceyentra.excell_save.apache_poi.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {
    String action;
    String location;
    String name;
    int category;
    int subCategory;
}
