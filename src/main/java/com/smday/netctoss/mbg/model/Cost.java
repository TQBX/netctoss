package com.smday.netctoss.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@NoArgsConstructor
public class Cost implements Serializable {
    @ApiModelProperty(value = "资费id")
    private Integer costId;

    @ApiModelProperty(value = "资费名称")
    private String name;

    @ApiModelProperty(value = "基本时长")
    private Integer baseDuration;

    @ApiModelProperty(value = "基本费用")
    private Double baseCost;

    @ApiModelProperty(value = "单位费用")
    private Double unitCost;

    @ApiModelProperty(value = "状态0开通，1暂停")
    private String status;

    @ApiModelProperty(value = "收费描述")
    private String descr;

    @ApiModelProperty(value = "创建时间")
    private Date creatime;

    @ApiModelProperty(value = "开通时间")
    private Date startime;

    @ApiModelProperty(value = "资费类型1包月，2套餐3计时")
    private String costType;

    private static final long serialVersionUID = 1L;

    public Integer getCostId() {
        return costId;
    }

    public void setCostId(Integer costId) {
        this.costId = costId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBaseDuration() {
        return baseDuration;
    }

    public void setBaseDuration(Integer baseDuration) {
        this.baseDuration = baseDuration;
    }

    public Double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(Double baseCost) {
        this.baseCost = baseCost;
    }

    public Double getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(Double unitCost) {
        this.unitCost = unitCost;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public Date getCreatime() {
        return creatime;
    }

    public void setCreatime(Date creatime) {
        this.creatime = creatime;
    }

    public Date getStartime() {
        return startime;
    }

    public void setStartime(Date startime) {
        this.startime = startime;
    }

    public String getCostType() {
        return costType;
    }

    public void setCostType(String costType) {
        this.costType = costType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", costId=").append(costId);
        sb.append(", name=").append(name);
        sb.append(", baseDuration=").append(baseDuration);
        sb.append(", baseCost=").append(baseCost);
        sb.append(", unitCost=").append(unitCost);
        sb.append(", status=").append(status);
        sb.append(", descr=").append(descr);
        sb.append(", creatime=").append(creatime);
        sb.append(", startime=").append(startime);
        sb.append(", costType=").append(costType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}