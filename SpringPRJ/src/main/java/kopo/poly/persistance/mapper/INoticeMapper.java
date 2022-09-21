package kopo.poly.persistance.mapper;

import kopo.poly.dto.NoticeDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface INoticeMapper {

    int insertNotice(NoticeDTO mDTO) throws Exception;

    NoticeDTO login(NoticeDTO mDTO)throws Exception;

    int update (NoticeDTO mDTO) throws Exception;

    void delete () throws Exception;

    List<NoticeDTO> getNoticeList();
}
