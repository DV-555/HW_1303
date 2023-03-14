package Cars;
public class Car {
    private String model;
    private String colour;
    private int productionDate;



    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model=model;
    }
    protected String getColour(){
        return colour;
    }
    public void setColour(String colour){
        this.colour=colour;
    }
    public int getProductionDate(){
        return productionDate;
    }
    public void setProductionDate(int productionDate){
        this.productionDate=productionDate;

    }
    void drive(){
        System.out.println("Car accelerates now");
    }
    void stop(){
        System.out.println("Car stops now");
    }

}

