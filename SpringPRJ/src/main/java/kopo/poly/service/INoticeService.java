package kopo.poly.service;

import kopo.poly.dto.NoticeDTO;

import java.util.List;

public interface INoticeService {

    int insert (NoticeDTO mDTO) throws Exception; // 회원가입

    NoticeDTO login(NoticeDTO requestDto) throws Exception;

    int update (NoticeDTO mDTO) throws Exception;

    void delete() throws Exception;

    List<NoticeDTO> getNoticeList();
}
