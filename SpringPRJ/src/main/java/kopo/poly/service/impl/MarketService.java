package kopo.poly.service.impl;


import kopo.poly.dto.MarketDTO;
import kopo.poly.persistance.mapper.IMarketMapper;
import kopo.poly.service.IMarketService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("NoticeService")
@Slf4j
@RequiredArgsConstructor
public class MarketService implements IMarketService {

        private final IMarketMapper marketMapper;





}

