package com.yohit.DemoApplication.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
public @Data class Station {

    @Id
    private String stationId;

    @Column(name = "name")
    private String name;

    @Column(name = "hdEnabled")
    private boolean hdEnabled;

    @Column(name = "callSign")
    private String callSign;

}
