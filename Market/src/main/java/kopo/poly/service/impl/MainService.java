package kopo.poly.service.impl;


import kopo.poly.persistance.mapper.IMainMapper;
import kopo.poly.persistance.mapper.IMarketMapper;
import kopo.poly.service.IMainService;
import kopo.poly.service.IMarketService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service("MainService")
@Slf4j
@RequiredArgsConstructor
public class MainService implements IMainService {

        private IMainMapper mainMapper;





}

