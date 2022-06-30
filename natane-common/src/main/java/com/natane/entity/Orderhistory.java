/*
 * Copyright 2016-2019 the original author.All rights reserved.
 * Kingstar(aiteasoft@163.com)
 * The license,see the LICENSE file.
 */

package com.natane.entity;

import io.mybatis.provider.Entity;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * orderhistory
 *
 * @author CZ
 * @date 2022/06/30
 */
@Entity.Table("orderhistory")
public class Orderhistory implements Serializable {

    @Serial
    private static final long serialVersionUID = 15960497491733462L;

    @Entity.Column(id = true, remark = "主键")
    private Integer id;
    @Entity.Column(value = "name", remark = "名称")
    private String name;
    @Entity.Column(value = "order_no", remark = "订单号")
    private String orderNo;
    @Entity.Column(value = "seq_no", remark = "流水号")
    private String seqNo;
    @Entity.Column(value = "num", remark = "数量")
    private BigDecimal num;
    @Entity.Column(value = "num_flag")
    private String numFlag;
    @Entity.Column(remark = "类型")
    private String type;
    @Entity.Column(remark = "详细")
    private String detail;
    @Entity.Column(remark = "时间")
    private Timestamp datetime;
    @Entity.Column(remark = "备注")
    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(String seqNo) {
        this.seqNo = seqNo;
    }

    public BigDecimal getNum() {
        return num;
    }

    public void setNum(BigDecimal num) {
        this.num = num;
    }

    public String getNumFlag() {
        return numFlag;
    }

    public void setNumFlag(String numFlag) {
        this.numFlag = numFlag;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Timestamp getDatetime() {
        return datetime;
    }

    public void setDatetime(Timestamp datetime) {
        this.datetime = datetime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }


    @Override
    public String toString() {
        return "Orderhistory{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", orderNo='" + orderNo + '\'' +
                ", seqNo='" + seqNo + '\'' +
                ", num=" + num +
                ", numFlag='" + numFlag + '\'' +
                ", type='" + type + '\'' +
                ", detail='" + detail + '\'' +
                ", datetime=" + datetime +
                ", remark='" + remark + '\'' +
                '}';
    }
}