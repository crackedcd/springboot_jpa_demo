package com.mm.itempvuv.common.util;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public class PageableUtil {
    public static Pageable getPageableAsc(String col, int page, int pageSize) {
        return PageRequest.of(page, pageSize, new Sort(Sort.Direction.ASC, col));
    }

    public static Pageable getPageableDesc(String col, int page, int pageSize) {
        return PageRequest.of(page, pageSize, new Sort(Sort.Direction.DESC, col));
    }
}
