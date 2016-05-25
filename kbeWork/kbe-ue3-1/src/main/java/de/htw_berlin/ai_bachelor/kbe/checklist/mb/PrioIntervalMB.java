package de.htw_berlin.ai_bachelor.kbe.checklist.mb;

import java.io.Serializable;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@ManagedBean(name="PrioIntervalMB", eager = true)
@ApplicationScoped
public class PrioIntervalMB implements Serializable {

	private static final long serialVersionUID = 1L;
	@NotNull @Min(value=1)
	private int minValue;
	@NotNull @Min(value=1)
	private int maxValue;
	
	public PrioIntervalMB() {
		super();
		minValue = 1;
		maxValue = 1;
		//System.out.println("konstruktor");
	}
	
	public int getMaxValue() {
		return maxValue;
	}
	public void setMaxValue(int maxValue) {
		this.maxValue = maxValue;
	}
	public int getMinValue() {
		return minValue;
	}
	public void setMinValue(int minValue) {
		this.minValue = minValue;
	}
	
    public String save() {
    	return "save";
    }
}
