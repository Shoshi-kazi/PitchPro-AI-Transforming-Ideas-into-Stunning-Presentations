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

public List<String> getSlides() {
return slides;
}

public void displaySlides() {
System.out.println("Slides for: " + title);
for (String slide : slides) {
System.out.println("- " + slide);
}
}
}
