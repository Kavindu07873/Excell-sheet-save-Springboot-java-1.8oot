package com.ceyentra.excell_save.apache_poi.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
public class Course {
    @Id
    private long id;
    private String address;
    private String cname;

}
