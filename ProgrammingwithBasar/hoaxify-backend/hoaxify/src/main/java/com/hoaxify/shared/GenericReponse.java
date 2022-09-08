package com.hoaxify.shared;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GenericReponse {
    private String message;

    public GenericReponse(String message){
        this.message = message;
    }
}
