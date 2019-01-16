package com.mm.itempvuv.service;

import com.mm.itempvuv.jpa.model.PvUvModel;
import com.mm.itempvuv.jpa.repository.PvUvRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    PvUvRepository pvUvRepository;

    public String test() {
        Pageable pageable = getPageableDesc("itemPvTd", 0, 10);
        List<PvUvModel> result = pvUvRepository.searchByDs("2019-01-08", pageable);
        for (PvUvModel r : result) {
            System.out.println(r.toString());
        }
        return "test";
    }

    private Pageable getPageableAsc(String col, int page, int pageSize) {
        return PageRequest.of(page, pageSize, new Sort(Sort.Direction.ASC, col));
    }

    private Pageable getPageableDesc(String col, int page, int pageSize) {
        return PageRequest.of(page, pageSize, new Sort(Sort.Direction.DESC, col));
    }
}
