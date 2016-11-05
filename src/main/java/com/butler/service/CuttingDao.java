package com.butler.service;

import com.butler.data.CuttingType;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by agulshan on 29/10/16.
 */
public class CuttingDao extends JdbcTemplate {

    public Map<String,List<CuttingType>> getAllCutting(){
        String query = "select description,cutting.group from cutting";
        List<CuttingType> cuttingTypes = this.query(query,new CuttingTypeMapper());

        Map<String,List<CuttingType>> map = new HashMap<>();
        cuttingTypes.stream().forEach(cuttingType -> {
            List<CuttingType> group = map.get(cuttingType.getGroup());
            if(group==null){
                group = new ArrayList<>();
            }
            group.add(cuttingType);
            map.put(cuttingType.getGroup(),group);
        });
        return map;
    }
}
class CuttingTypeMapper implements RowMapper<CuttingType>{

    @Override
    public CuttingType mapRow(ResultSet rs, int rowNum) throws SQLException {
        CuttingType cuttingType = new CuttingType();
        cuttingType.setGroup(rs.getString("group"));
        cuttingType.setDescription(rs.getString("description"));
        return  cuttingType;
    }
}
