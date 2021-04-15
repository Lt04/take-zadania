/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.backing;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author Kuba
 */
@Named(value = "newBean")
@RequestScoped
public class newBean {

    private int sum1;
    private int sum2;
    private int sum3;
    private Date dat = new Date();
    private ArrayList studenci = new ArrayList<Studenci>(Arrays.asList());
    
    public newBean() {
        for(int i = 0; i<100; i++){
            
            double start = 2;
            double end = 5;
            double random = new Random().nextDouble();
            StringBuilder im = new StringBuilder();
            StringBuilder naz = new StringBuilder();
            String str = "abcdefghijklmnopqrstuvwxyz";
            char[] chars = str.toCharArray();
            Random ran = new SecureRandom();
            for (int j = 0; j < 10; j++) {
                char c = chars[ran.nextInt(chars.length)];
                im.append(c);
                char ch = chars[ran.nextInt(chars.length)];
                naz.append(ch);
            }
            Studenci student = new Studenci(im.toString(), naz.toString(), start + (random *(end-start)));
            studenci.add(student);
        }
    }

    /**
     * @return the sum1
     */
    public String calc(){
        this.sum3 = this.sum1 + this.sum2;
        return String.valueOf(this.sum1);
    }

    public void addMessage(FacesMessage.Severity severity, String summary, String detail) {
        FacesContext.getCurrentInstance().
                addMessage(null, new FacesMessage(severity, summary, detail));
    }
    
    public void showInfo() {
        addMessage(FacesMessage.SEVERITY_INFO, "Info Message", sum1 + " + " + sum2 + " = " + sum3);
    }
    
    public int getSum1() {
        return sum1;
    }

    /**
     * @param sum1 the sum1 to set
     */
    public void setSum1(int sum1) {
        this.sum1 = sum1;
    }

    /**
     * @return the sum2
     */
    public int getSum2() {
        return sum2;
    }

    /**
     * @param sum2 the sum2 to set
     */
    public void setSum2(int sum2) {
        this.sum2 = sum2;
    }

    /**
     * @return the sum3
     */
    public int getSum3() {
        return sum3;
    }

    /**
     * @param sum3 the sum3 to set
     */
    public void setSum3(int sum3) {
        this.sum3 = sum3;
    }

    /**
     * @return the dat
     */
    public Date getDat() {
        return dat;
    }

    /**
     * @param dat the dat to set
     */
    public void setDat(Date dat) {
        this.dat = dat;
    }

    /**
     * @return the studenci
     */
    public ArrayList getStudenci() {
        return studenci;
    }

    /**
     * @param studenci the studenci to set
     */
    public void setStudenci(ArrayList studenci) {
        this.studenci = studenci;
    }

    
}
