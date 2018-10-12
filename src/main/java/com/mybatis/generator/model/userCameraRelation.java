package com.mybatis.generator.model;

public class userCameraRelation {
    private String camSn;

    private String camChannel;

    private Integer userId;

    private Integer bindTime;

    private Integer carouselStatus;

    public String getCamSn() {
        return camSn;
    }

    public void setCamSn(String camSn) {
        this.camSn = camSn;
    }

    public String getCamChannel() {
        return camChannel;
    }

    public void setCamChannel(String camChannel) {
        this.camChannel = camChannel;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getBindTime() {
        return bindTime;
    }

    public void setBindTime(Integer bindTime) {
        this.bindTime = bindTime;
    }

    public Integer getCarouselStatus() {
        return carouselStatus;
    }

    public void setCarouselStatus(Integer carouselStatus) {
        this.carouselStatus = carouselStatus;
    }
}