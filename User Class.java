package models;

public class BusinessTemplate extends Template {
    public BusinessTemplate() {
        this.layout = "Business Style";
    }

    @Override
    public void applyTemplate() {
        System.out.println("Applying Business Template...");
    }
}
