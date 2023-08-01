package com.spring.board.service;

import com.spring.board.dto.GuestbookDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
public class GuestbookServiceTest {

    @Autowired private GuestbookService service;

    @Test
    public void testRegister() {
        GuestbookDTO guestbookDTO = GuestbookDTO.builder()
                .title("예시 제목입니다....")
                .content("예시 내용입니다...")
                .writer("예를 들면 이사람이다.")
                .build();
        System.out.println(service.register(guestbookDTO));
    }

}