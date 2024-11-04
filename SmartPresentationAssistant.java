package main;

import models.*;
import services.*;

public class SmartPresentationAssistant {
    public static void main(String[] args) {
        // Creating a user
        User user = new User("cookie123", "cookie@example.com");
        System.out.println("Welcome, " + user.getUsername() + " (" + user.getEmail() + ")");

        // Creating a presentation
        Template template = new EducationTemplate();
        template.applyTemplate();
        Presentation presentation = new Presentation("My Science Project", template);

        // Adding slides
        presentation.addSlide("Introduction");
        presentation.addSlide("Main Content");
        presentation.addSlide("Conclusion");

        // Generating content
        ContentGenerator generator = new SummaryContentGenerator();
        generator.generateContent("Object-Oriented Programming Principles");

        // Displaying slides
        presentation.displaySlides();
    }
}
