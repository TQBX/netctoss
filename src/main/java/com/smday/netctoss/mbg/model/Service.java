package com.smday.netctoss.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.Date;

public class Service implements Serializable {
    @Id
    @ApiModelProperty(value = "服务id")
    private Integer serviceId;

    @ApiModelProperty(value = "账户id")
    private Integer accountId;

    @ApiModelProperty(value = "unix_host")
    private String unixHost;

    @ApiModelProperty(value = "os账号")
    private String osUsername;

    @ApiModelProperty(value = "登录密码")
    private String loginPasswd;

    @ApiModelProperty(value = "状态")
    private String status;

    @ApiModelProperty(value = "创建时间")
    private Date createDate;

    @ApiModelProperty(value = "暂停时间")
    private Date pauseDate;

    @ApiModelProperty(value = "关闭时间")
    private Date closeDate;

    @ApiModelProperty(value = "资费id")
    private Integer costId;

    @ApiModelProperty(value = "账户信息")
    private Account account;

    public Account getAccount() {
        return account;
    }

    @ApiModelProperty("资费信息")
    public Cost cost;

    public Cost getCost() {
        return cost;
    }

    public void setCost(Cost cost) {
        this.cost = cost;
    }

    public void setAccount(Account account) {
        this.account = account;
    }



    private static final long serialVersionUID = 1L;

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getUnixHost() {
        return unixHost;
    }

    public void setUnixHost(String unixHost) {
        this.unixHost = unixHost;
    }

    public String getOsUsername() {
        return osUsername;
    }

    public void setOsUsername(String osUsername) {
        this.osUsername = osUsername;
    }

    public String getLoginPasswd() {
        return loginPasswd;
    }

    public void setLoginPasswd(String loginPasswd) {
        this.loginPasswd = loginPasswd;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getPauseDate() {
        return pauseDate;
    }

    public void setPauseDate(Date pauseDate) {
        this.pauseDate = pauseDate;
    }

    public Date getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(Date closeDate) {
        this.closeDate = closeDate;
    }

    public Integer getCostId() {
        return costId;
    }

    public void setCostId(Integer costId) {
        this.costId = costId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serviceId=").append(serviceId);
        sb.append(", accountId=").append(accountId);
        sb.append(", unixHost=").append(unixHost);
        sb.append(", osUsername=").append(osUsername);
        sb.append(", loginPasswd=").append(loginPasswd);
        sb.append(", status=").append(status);
        sb.append(", createDate=").append(createDate);
        sb.append(", pauseDate=").append(pauseDate);
        sb.append(", closeDate=").append(closeDate);
        sb.append(", costId=").append(costId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}