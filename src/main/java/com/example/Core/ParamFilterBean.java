package com.example.Core;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.QueryParam;

/**
 * Created by DMedinskiy on 02.06.2016.
 */
public class ParamFilterBean {

    private @QueryParam("qparam") @DefaultValue("default") String qp;

    public String getQp() {
        return qp;
    }

    public void setQp(String qp) {
        this.qp = qp;
    }
}
