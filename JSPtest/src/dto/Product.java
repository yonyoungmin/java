package dto;

import java.io.Serializable;

public class Product implements Serializable{

	private static final long serialVersionUID = -4274700572038677000L;

    private String productId;
    private String pname;
    private Integer unitPrice;
    private String description;
    private String manufacturer;
    private String category;
    private long unitsInStock;
    private String condition;
    
    public Product(){
    	super();
    }
    
    public Product(String productId, String pname, Integer unitPrice){
        this.productId = productId;
        this.pname = pname;
        this.unitPrice = unitPrice;
    }
    
    public String getProductId(){
    	return productId;
    }
    
    public String getpname(){
    	return pname;
    }
    
    public void setpname(String pname){
    	this.pname = pname;
    }
    
    public void setProductId(String productId){
    	this.productId = productId;
    }
    
    public Integer getUnitProice(){
    	return unitPrice;
    }
    
    public void setUnitPrice(Integer unitPrice){
    	this.unitPrice = unitPrice;
    }
    
    public String getDescription(){
    	return description;
    }
    
    public void setDescription(String description){
    	this.description = description;
    }
    
    public String getMAnufacturer(){
    	return manufacturer;
    }
    
    public void setManufacturer(String manufacturer){
    	this.manufacturer = manufacturer;
    }
    
    public String getCategory(){
    	return category;
    }
    
    public void setCategory(String category){
        this.category = category;
    }
    
    public long getUnitsInStock(){
    	return unitsInStock;
    }
    
    public void setUnitsInock(long unitsInStock){
    	this.unitsInStock = unitsInStock;
    }
    
    public String getConditIon(){
    	return condition;
    }
    
    public void setCondition(String condition){
    	this.condition = condition;
    }
}    