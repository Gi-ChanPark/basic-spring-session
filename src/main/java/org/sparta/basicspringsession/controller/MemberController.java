package org.sparta.basicspringsession.controller;

import lombok.RequiredArgsConstructor;
import org.sparta.basicspringsession.dto.*;
import org.sparta.basicspringsession.service.MemberService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/members")
    public ResponseEntity<MemberSaveResponseDto> saveMember(@RequestBody MemberSaveRequestDto requestDto) {
        return ResponseEntity.ok(memberService.saveMember(requestDto));
    }

    @GetMapping("/members")
    public ResponseEntity<List<MemberSimpleResponsDto>> getMembers() {
        return ResponseEntity.ok(memberService.getMembers());
    }
}
