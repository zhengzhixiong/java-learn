package com.jmax4you.learn.jpa.service.impl;

import com.jmax4you.learn.jpa.dao.JmaxUserDao;
import com.jmax4you.learn.jpa.model.JmaxUser;
import com.jmax4you.learn.jpa.service.JmaxUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author max.zheng
 * @date 2020-04-23 09:12
 */
@Service
public class JmaxUserServiceImpl implements JmaxUserService {
    @Autowired
    private JmaxUserDao jmaxUserDao;
    @Override
    public JmaxUser save(JmaxUser model) {
        return jmaxUserDao.save(model);
    }
}
