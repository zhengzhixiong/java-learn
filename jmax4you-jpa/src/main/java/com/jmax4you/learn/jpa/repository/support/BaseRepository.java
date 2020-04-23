package com.jmax4you.learn.jpa.repository.support;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;
import java.util.List;

/**
 * https://blog.csdn.net/however_zx/article/details/86081505
 * 通用基础dao供继承
 *
 * @author max.zheng
 * @date 2018-05-03 20:35
 */
@NoRepositoryBean
public interface BaseRepository<T,ID extends Serializable> extends JpaRepository<T,ID>, JpaSpecificationExecutor<T> {
    /**
     * 根据sql查询
     * @param sql
     * @return
     */
    List<Object[]> listBySQL(String sql);
}
