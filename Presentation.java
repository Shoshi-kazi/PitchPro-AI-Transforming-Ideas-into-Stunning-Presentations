package models;

import java.util.ArrayList;
import java.util.List;

public class Presentation {
    private String title;
    private Template template;
    private List<String> slides;

    public Presentation(String title, Template template) {
        this.title = title;
        this.template = template;
        this.slides = new ArrayList<>();
    }

    public void addSlide(String slide) {
        slides.add(slide);
    }

    public String getTitle() {
        return title;
    }

    public Template getTemplate() {
        return template;
    }

    public List<String> getSlides() {
        return new ArrayList<>(slides); 
    }

    public void displaySlides() {
        System.out.println("Slides for: " + title);
        for (String slide : slides) {
            System.out.println("- " + slide);
        }
    }

    @Override
    public String toString() {
        return "Presentation{" +
                "title='" + title + '\'' +
                ", template=" + template +
                ", slides=" + slides +
                '}';
    }
}

