package main;

import models.*;
import services.*;

public class SmartPresentationAssistant {
    public static void main(String[] args) {
        
        User user = new User("cookie123", "cookie@example.com");
        System.out.println("Welcome, " + user.getUsername() + " (" + user.getEmail() + ")");

      
        Template template = new EducationTemplate();
        template.applyTemplate();
        Presentation presentation = new Presentation("My Science Project", template);

        
        presentation.addSlide("Introduction");
        presentation.addSlide("Main Content");
        presentation.addSlide("Conclusion");

       
        ContentGenerator generator = new SummaryContentGenerator();
        generator.generateContent("Object-Oriented Programming Principles");

       
        presentation.displaySlides();
    }
}
