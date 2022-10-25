package kopo.poly.service.impl;


import kopo.poly.dto.FoodDTO;
import kopo.poly.persistance.mapper.IMainMapper;
import kopo.poly.persistance.mapper.IMarketMapper;
import kopo.poly.service.IMainService;
import kopo.poly.service.IMarketService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("MainService")
@Slf4j
@RequiredArgsConstructor
public class MainService implements IMainService {

        private final IMainMapper mainMapper;




        @Override
        //@Transactional
        public void InsertFood(FoodDTO fDTO) throws Exception {

                log.info(this.getClass().getName() + "InsertFood start!");
                log.info("name : "+fDTO.getP_name());
                mainMapper.InsertFood(fDTO);

                log.info(this.getClass().getName() + "InsertFood end");

        }


}

