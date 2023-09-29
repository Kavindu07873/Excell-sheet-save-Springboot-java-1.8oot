package com.ceyentra.excell_save.apache_poi.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class oauthValueDTO {
    String username;
    String password;
    String grant_type;
}
