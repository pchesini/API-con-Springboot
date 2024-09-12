package com.cursoSpring.dominio;

import javax.sql.rowset.spi.SyncResolver;

public class Category {
    private Integer categoryId;
    private String category;
    private Boolean active;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
