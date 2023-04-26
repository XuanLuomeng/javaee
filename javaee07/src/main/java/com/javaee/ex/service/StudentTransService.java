package com.javaee.ex.service;

import com.javaee.ex.dao.HistoryInfoDao;
import com.javaee.ex.dao.StudentDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentTransService {
    private HistoryInfoDao historyInfoDao;
    private StudentDao studentDao;

    public StudentTransService(HistoryInfoDao historyInfoDao, StudentDao studentDao) {
        this.historyInfoDao = historyInfoDao;
        this.studentDao = studentDao;
    }

    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, timeout = 20)
    public void trans(String sno, int newMno) {
        String str = "学号为" + sno + "的同学转到了" + newMno + "专业";
        historyInfoDao.insertHistoryInfo(str);
        int i = 1 / 0;
        studentDao.updateMnoBySno(sno, newMno);
    }
}
