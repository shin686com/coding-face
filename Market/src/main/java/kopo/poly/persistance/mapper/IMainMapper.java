package kopo.poly.persistance.mapper;


import kopo.poly.dto.FoodDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IMainMapper {


    void InsertFood(FoodDTO fDTO)throws Exception;
}
