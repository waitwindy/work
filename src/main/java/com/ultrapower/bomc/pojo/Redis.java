package com.ultrapower.bomc.pojo;

public class Redis {
    private Integer redisid;

    private Float sysCpuRate;

    private Float usrCpuRate;

    private String redisName;

    public Integer getRedisid() {
        return redisid;
    }

    public void setRedisid(Integer redisid) {
        this.redisid = redisid;
    }

    public Float getSysCpuRate() {
        return sysCpuRate;
    }

    public void setSysCpuRate(Float sysCpuRate) {
        this.sysCpuRate = sysCpuRate;
    }

    public Float getUsrCpuRate() {
        return usrCpuRate;
    }

    public void setUsrCpuRate(Float usrCpuRate) {
        this.usrCpuRate = usrCpuRate;
    }

    public String getRedisName() {
        return redisName;
    }

    public void setRedisName(String redisName) {
        this.redisName = redisName == null ? null : redisName.trim();
    }

    @Override
    public String toString() {
        return "Redis{" +
                "redisid=" + redisid +
                ", sysCpuRate=" + sysCpuRate +
                ", usrCpuRate=" + usrCpuRate +
                ", redisName='" + redisName + '\'' +
                '}';
    }
}