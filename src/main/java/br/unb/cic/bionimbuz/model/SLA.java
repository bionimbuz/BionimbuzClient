/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unb.cic.bionimbuz.model;

import br.unb.cic.bionimbuz.web.beans.SlaComposerBean;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Breno Rodrigues
 */
public class SLA {
    private User user;
    private User provider;
    private int objective;
    private Long period;
    private List <PluginService> services;
    private List<Instance> instances;
    private Double value;
    private Date time;
    
            
    public SLA(){
        this.user=null;
        this.provider=null;
        this.objective= 0;
        this.period = 0l;
        this.instances=null;
        this.services=null;
        this.time=null;
        this.time=new Date();
        
    }
    
    public SLA(SlaComposerBean slacomp,User user, User provider, List<PluginService> services){
        this.user=user;
        this.provider=provider;
        this.objective= slacomp.getObjective();
        this.period = Long.parseLong(slacomp.getLimitationValue());
        this.instances=slacomp.getSelectedInstancies();
        this.services= services;
    }
    
    public SLA(SlaComposerBean slacomp,User user, User provider, List<PluginService> service,Date time, Double value){
        this.user=user;
        this.provider=provider;
        this.objective= slacomp.getObjective();
        this.period = Long.parseLong(slacomp.getLimitationValue());
        this.instances=slacomp.getSelectedInstancies();
        this.services=service;
        this.time= time;
        this.value=value;
    }
    
    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * @return the provider
     */
    public User getProvider() {
        return provider;
    }

    /**
     * @param provider the provider to set
     */
    public void setProvider(User provider) {
        this.provider = provider;
    }

    /**
     * @return the objective
     */
    public int getObjective() {
        return objective;
    }

    /**
     * @param objective the objective to set
     */
    public void setObjective(int objective) {
        this.objective = objective;
    }

    /**
     * @return the period
     */
    public Long getPeriod() {
        return period;
    }

    /**
     * @param period the period to set
     */
    public void setPeriod(Long period) {
        this.period = period;
    }

    /**
     * @return the services
     */
    public List <PluginService> getServices() {
        return services;
    }

    /**
     * @param services the services to set
     */
    public void setServices(List <PluginService> services) {
        this.services = services;
    }

    /**
     * @return the instances
     */
    public List<Instance> getInstances() {
        return instances;
    }

    /**
     * @param instances the instances to set
     */
    public void setInstances(List<Instance> instances) {
        this.instances = instances;
    }

    /**
     * @return the value
     */
    public Double getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * @return the time
     */
    public Date getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(Date time) {
        this.time = time;
    }
    
}