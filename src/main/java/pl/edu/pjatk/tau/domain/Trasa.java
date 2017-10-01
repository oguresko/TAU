/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.pjatk.tau.domain;

import java.util.Date;

/**
 *
 * @author s12116
 */
public class Trasa {
    int id;
    Date startDate;
    Date endDate;
    double kilometry;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date start_date) {
        this.startDate = start_date;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date end_date) {
        this.endDate = end_date;
    }

    public double getKilometry() {
        return kilometry;
    }

    public void setKilometry(double kilometry) {
        this.kilometry = kilometry;
    }
    
    
}


