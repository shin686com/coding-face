package kopo.poly.service.impl;


import kopo.poly.dto.NoticeDTO;
import kopo.poly.persistance.mapper.IMainMapper;
import kopo.poly.persistance.mapper.INoticeMapper;
import kopo.poly.service.IMainService;
import kopo.poly.service.INoticeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service("NoticeService")
@Slf4j
@RequiredArgsConstructor
public class NoticeService implements INoticeService {

        private INoticeMapper noticeMapper;


        @Override
        public void InsertNoticeInfo(NoticeDTO pDTO) throws Exception {

                log.info(this.getClass().getName() + ".InsertNoticeInfo start!");

                noticeMapper.InsertNoticeInfo(pDTO);

                log.info(this.getClass().getName() + ".InsertNoticeInfo end !");

        }
}

