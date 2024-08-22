package org.sparta.basicspringsession.dto;

import lombok.Getter;

@Getter
public class MemberSimpleResponsDto {

    private final String name;

    public MemberSimpleResponsDto(String name) {
        this.name = name;
    }
}
