package org.sparta.basicspringsession.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.sparta.basicspringsession.entity.Member;
import org.sparta.basicspringsession.repository.MemberRepository;
import org.springframework.stereotype.Service;
import org.sparta.basicspringsession.dto.*;


import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    @Transactional
    public MemberSaveResponseDto saveMember(MemberSaveRequestDto requestDto) {
        Member newMember = new Member(requestDto.getName());
        Member savedMember = memberRepository.save(newMember);

        return new MemberSaveResponseDto(savedMember.getId(), savedMember.getName());
    }

    public List<MemberSimpleResponsDto> getMembers() {
        List<Member> memberList = memberRepository.findAll();

        List<MemberSimpleResponsDto> dtoList = new ArrayList<>();
        for (Member member : memberList) {
            MemberSimpleResponsDto dto = new MemberSimpleResponsDto(member.getName());
            dtoList.add(dto);
        }
        return dtoList;
    }


}
