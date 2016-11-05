package com.butler.service;

import com.butler.data.Option;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by agulshan on 05/11/16.
 */
public class OptionsDao extends JdbcTemplate {
    public Map<Integer,List<Option>> getOptionsMap(){
        String query = "select product,description,price from options";
        List<Option> allOptions = this.query(query,new BeanPropertyRowMapper(Option.class));
        Map<Integer,List<Option>> map = new HashMap<>();
        allOptions.stream().forEach(option -> {
            List<Option> group = map.get(option.getProduct());
            if(group==null){
                group = new ArrayList<>();
            }
            group.add(option);

            map.put(option.getProduct(),group);
        });
        return map;
    }
}
