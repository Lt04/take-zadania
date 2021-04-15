/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.backing;

import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.LineChartSeries;

/**
 *
 * @author Kuba
 */
@Named(value = "chartView")
@RequestScoped
public class chartView {

    
    private LineChartModel lineModel;
    
    @PostConstruct
    public void init(){
        lineModel = new LineChartModel();
        LineChartSeries series1 = new LineChartSeries();
        LineChartSeries series2 = new LineChartSeries();
        series1.setLabel("Sinus");
        series2.setLabel("Cosinus");
        lineModel.setZoom(true);
        for(int i=0; i<361; i=i+10){
            series1.set(i, Math.sin(Math.toRadians(i)));
            series2.set(i, Math.cos(Math.toRadians(i)));
        }
        lineModel.addSeries(series1);
        lineModel.addSeries(series2);
    }
    
    /**
     * Creates a new instance of chartView
     */
    public chartView() {
    }

    /**
     * @return the lineModel
     */
    public LineChartModel getLineModel() {
        return lineModel;
    }

    /**
     * @param lineModel the lineModel to set
     */
    public void setLineModel(LineChartModel lineModel) {
        this.lineModel = lineModel;
    }
    
}
