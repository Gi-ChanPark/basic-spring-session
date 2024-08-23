package org.sparta.basicspringsession.dto;

public class MemberDetailResponseDto {

    private final Long id;
    private final String name;

    public MemberDetailResponseDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
