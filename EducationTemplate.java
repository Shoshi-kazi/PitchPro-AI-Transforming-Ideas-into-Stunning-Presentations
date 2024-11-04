package models;

public class EducationTemplate extends Template {
    public EducationTemplate() {
        this.layout = "Education Style";
    }

    @Override
    public void applyTemplate() {
        System.out.println("Applying Education Template...");
    }
}
