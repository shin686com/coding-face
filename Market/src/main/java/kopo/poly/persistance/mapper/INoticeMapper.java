package kopo.poly.persistance.mapper;


import kopo.poly.dto.NoticeDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface INoticeMapper {

   void InsertNoticeInfo(NoticeDTO pDTO) throws Exception;


}
