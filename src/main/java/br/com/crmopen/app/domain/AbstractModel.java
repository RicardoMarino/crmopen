package br.com.crmopen.app.domain;

import java.util.Date;

public class AbstractModel {
    private Long id;
    private Date updatededAt;
    private Date creatededAt;

    public AbstractModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getUpdatededAt() {
        return updatededAt;
    }

    public void setUpdatededAt(Date updatededAt) {
        this.updatededAt = updatededAt;
    }

    public Date getCreatededAt() {
        return creatededAt;
    }

    public void setCreatededAt(Date creatededAt) {
        this.creatededAt = creatededAt;
    }
}
