package com.butler.data;

import java.util.List;

/**
 * Created by agulshan on 29/10/16.
 */
public class Cutting {
    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public List<String> getCuttingTypes() {
        return cuttingTypes;
    }

    public void setCuttingTypes(List<String> cuttingTypes) {
        this.cuttingTypes = cuttingTypes;
    }

    private String group;
    List<String> cuttingTypes;

}
