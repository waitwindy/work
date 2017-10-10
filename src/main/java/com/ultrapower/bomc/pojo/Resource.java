package com.ultrapower.bomc.pojo;

public class Resource {
    private Integer resId;

    private String resName;

    private String moName;

    private String classnamw;

    private Integer resIsinuse;

    private Integer resIsdeleted;

    private String resDescr;

    private String note;

    private Float parentNodeResId;

    private Float parentResId;

    private Float phase;

    private String searchcode;

    private Float priority;

    private Float mainstatus;

    private Float substatus;

    private Float selfstatus;

    private String monitortask;

    private String distractionfreetime;

    private Float arealocationId;

    private Float tenant;

    private Float ismanaged;

    private Float createtime;

    private Float retownId;

    private String parentnodeclass;

    public Resource() {
    }

    public Resource(Integer resId, String resName, String moName, String classnamw, Integer resIsinuse, Integer resIsdeleted, String resDescr, String note, Float parentNodeResId, Float parentResId, Float phase, String searchcode, Float priority, Float mainstatus, Float substatus, Float selfstatus, String monitortask, String distractionfreetime, Float arealocationId, Float tenant, Float ismanaged, Float createtime, Float retownId, String parentnodeclass) {
        this.resId = resId;
        this.resName = resName;
        this.moName = moName;
        this.classnamw = classnamw;
        this.resIsinuse = resIsinuse;
        this.resIsdeleted = resIsdeleted;
        this.resDescr = resDescr;
        this.note = note;
        this.parentNodeResId = parentNodeResId;
        this.parentResId = parentResId;
        this.phase = phase;
        this.searchcode = searchcode;
        this.priority = priority;
        this.mainstatus = mainstatus;
        this.substatus = substatus;
        this.selfstatus = selfstatus;
        this.monitortask = monitortask;
        this.distractionfreetime = distractionfreetime;
        this.arealocationId = arealocationId;
        this.tenant = tenant;
        this.ismanaged = ismanaged;
        this.createtime = createtime;
        this.retownId = retownId;
        this.parentnodeclass = parentnodeclass;
    }

    public Integer getResId() {
        return resId;
    }

    public void setResId(Integer resId) {
        this.resId = resId;
    }

    public String getResName() {
        return resName;
    }

    public void setResName(String resName) {
        this.resName = resName == null ? null : resName.trim();
    }

    public String getMoName() {
        return moName;
    }

    public void setMoName(String moName) {
        this.moName = moName == null ? null : moName.trim();
    }

    public String getClassnamw() {
        return classnamw;
    }

    public void setClassnamw(String classnamw) {
        this.classnamw = classnamw == null ? null : classnamw.trim();
    }

    public Integer getResIsinuse() {
        return resIsinuse;
    }

    public void setResIsinuse(Integer resIsinuse) {
        this.resIsinuse = resIsinuse;
    }

    public Integer getResIsdeleted() {
        return resIsdeleted;
    }

    public void setResIsdeleted(Integer resIsdeleted) {
        this.resIsdeleted = resIsdeleted;
    }

    public String getResDescr() {
        return resDescr;
    }

    public void setResDescr(String resDescr) {
        this.resDescr = resDescr == null ? null : resDescr.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public Float getParentNodeResId() {
        return parentNodeResId;
    }

    public void setParentNodeResId(Float parentNodeResId) {
        this.parentNodeResId = parentNodeResId;
    }

    public Float getParentResId() {
        return parentResId;
    }

    public void setParentResId(Float parentResId) {
        this.parentResId = parentResId;
    }

    public Float getPhase() {
        return phase;
    }

    public void setPhase(Float phase) {
        this.phase = phase;
    }

    public String getSearchcode() {
        return searchcode;
    }

    public void setSearchcode(String searchcode) {
        this.searchcode = searchcode == null ? null : searchcode.trim();
    }

    public Float getPriority() {
        return priority;
    }

    public void setPriority(Float priority) {
        this.priority = priority;
    }

    public Float getMainstatus() {
        return mainstatus;
    }

    public void setMainstatus(Float mainstatus) {
        this.mainstatus = mainstatus;
    }

    public Float getSubstatus() {
        return substatus;
    }

    public void setSubstatus(Float substatus) {
        this.substatus = substatus;
    }

    public Float getSelfstatus() {
        return selfstatus;
    }

    public void setSelfstatus(Float selfstatus) {
        this.selfstatus = selfstatus;
    }

    public String getMonitortask() {
        return monitortask;
    }

    public void setMonitortask(String monitortask) {
        this.monitortask = monitortask == null ? null : monitortask.trim();
    }

    public String getDistractionfreetime() {
        return distractionfreetime;
    }

    public void setDistractionfreetime(String distractionfreetime) {
        this.distractionfreetime = distractionfreetime == null ? null : distractionfreetime.trim();
    }

    public Float getArealocationId() {
        return arealocationId;
    }

    public void setArealocationId(Float arealocationId) {
        this.arealocationId = arealocationId;
    }

    public Float getTenant() {
        return tenant;
    }

    public void setTenant(Float tenant) {
        this.tenant = tenant;
    }

    public Float getIsmanaged() {
        return ismanaged;
    }

    public void setIsmanaged(Float ismanaged) {
        this.ismanaged = ismanaged;
    }

    public Float getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Float createtime) {
        this.createtime = createtime;
    }

    public Float getRetownId() {
        return retownId;
    }

    public void setRetownId(Float retownId) {
        this.retownId = retownId;
    }

    public String getParentnodeclass() {
        return parentnodeclass;
    }

    public void setParentnodeclass(String parentnodeclass) {
        this.parentnodeclass = parentnodeclass == null ? null : parentnodeclass.trim();
    }
}