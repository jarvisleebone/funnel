/**
 * Zentech-Inc
 * Copyright (C) 2018 All Rights Reserved.
 */
package com.funnel.core;

import com.funnel.enumerate.PelletType;

import java.util.List;

public class Pellet {

    private PelletType t;

    private String httpPath;

    private FMethod FMethod;

    private Snippet snippet;

    private List<FunnelRule> funnelRules;

    public Pellet(String httpPath) {
        this.t = PelletType.HTTP;
        this.httpPath = httpPath;
    }

    public Pellet(FMethod FMethod) {
        this.t = PelletType.METHOD;
        this.FMethod = FMethod;
    }

    public Pellet(Snippet snippet) {
        this.t = PelletType.CODE;
        this.snippet = snippet;
    }


    public PelletType getT() {
        return t;
    }

    public void setT(PelletType t) {
        this.t = t;
    }

    public String getHttpPath() {
        return httpPath;
    }

    public void setHttpPath(String httpPath) {
        this.httpPath = httpPath;
    }

    public FMethod getFMethod() {
        return FMethod;
    }

    public void setFMethod(FMethod FMethod) {
        this.FMethod = FMethod;
    }

    public Snippet getSnippet() {
        return snippet;
    }

    public void setSnippet(Snippet snippet) {
        this.snippet = snippet;
    }

    public List<FunnelRule> getFunnelRules() {
        return funnelRules;
    }

    public void setFunnelRules(List<FunnelRule> funnelRules) {
        this.funnelRules = funnelRules;
    }
}