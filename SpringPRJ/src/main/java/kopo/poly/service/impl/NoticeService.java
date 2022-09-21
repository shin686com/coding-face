package kopo.poly.service.impl;


import kopo.poly.dto.NoticeDTO;
import kopo.poly.persistance.mapper.INoticeMapper;
import kopo.poly.service.INoticeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service("NoticeService")
@Slf4j
@RequiredArgsConstructor
public class NoticeService implements INoticeService {

        private final INoticeMapper noticeMapper;


    @Override
    public int insert(NoticeDTO mDTO) throws Exception {
        log.info(this.getClass().getName() + ".insert Start!");

        int res =noticeMapper.insertNotice(mDTO);

        return res;
    }

    @Override
    public NoticeDTO login(NoticeDTO requestDto) throws Exception {

        NoticeDTO result = noticeMapper.login(requestDto);

        return result;
    }

    @Override
    public int update(NoticeDTO mDTO) throws Exception {


        log.info(this.getClass().getName() + ".insert Start!");

        int res =noticeMapper.update(mDTO);

        return res;
    }

    @Override
    public void delete() throws Exception {
        noticeMapper.delete();
    }

    @Override
    public List<NoticeDTO> getNoticeList() {

        List<NoticeDTO> rList = noticeMapper.getNoticeList();

        return rList;
    }


}

