package com.butler.service;

import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * Created by agulshan on 16/10/16.
 */
public class NotificationDao extends JdbcTemplate {

    public void saveNotificationID(String number,String identifer){
        String sql = "insert into notification_identity[(number,identifier) values ?,?";
        this.update(sql,number,identifer);
    }

    public List<String> getNotificationIds(String number){
        String sql = "select identifier from notification where number=?";
        return this.queryForList(sql,String.class,number);
    }
}
