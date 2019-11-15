package com.example.demo.entity;

import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;
import com.querydsl.core.annotations.QueryEntity;
import org.springframework.data.couchbase.core.mapping.Document;


import java.util.Date;
@QueryEntity
@Document(expiry = 0)
public class BeerSimple {

    @Id
    private String brewery_id;
    @Field
    private String category;
    @Field
    private String description;
    @Field
    private Integer ibu;
    @Field
    private String name;
    @Field
    private Integer srm;
    @Field
    private String style;
    @Field
    private String type;
    @Field
    private Integer upc;
    @Field
    private Date updated;
    @Field
    private double abv;

    public BeerSimple() {
    }

    public BeerSimple(String brewery_id, String category, String description, Integer ibu, String name, Integer srm, String style, String type, Integer upc, Date updated, double abv) {
        this.brewery_id = brewery_id;
        this.category = category;
        this.description = description;
        this.ibu = ibu;
        this.name = name;
        this.srm = srm;
        this.style = style;
        this.type = type;
        this.upc = upc;
        this.updated = updated;
        this.abv = abv;
    }

    public String getBrewery_id() {
        return brewery_id;
    }

    public void setBrewery_id(String brewery_id) {
        this.brewery_id = brewery_id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getIbu() {
        return ibu;
    }

    public void setIbu(Integer ibu) {
        this.ibu = ibu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSrm() {
        return srm;
    }

    public void setSrm(Integer srm) {
        this.srm = srm;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getUpc() {
        return upc;
    }

    public void setUpc(Integer upc) {
        this.upc = upc;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public double getAbv() {
        return abv;
    }

    public void setAbv(double abv) {
        this.abv = abv;
    }

    @Override
    public String toString() {
        return "Beer{" +
                "brewery_id='" + brewery_id + '\'' +
                ", category='" + category + '\'' +
                ", description='" + description + '\'' +
                ", ibu=" + ibu +
                ", name='" + name + '\'' +
                ", srm=" + srm +
                ", style='" + style + '\'' +
                ", type='" + type + '\'' +
                ", upc=" + upc +
                ", updated=" + updated +
                ", abv=" + abv +
                '}';
    }
}
