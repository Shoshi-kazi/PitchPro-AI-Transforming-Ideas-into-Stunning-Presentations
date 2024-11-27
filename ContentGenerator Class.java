abstract class ContentGenerator {
    public abstract List<Slide> generateSlides(String topic);
}

class AIContentGenerator extends ContentGenerator {
    @Override
    public List<Slide> generateSlides(String topic) {
        List<Slide> slides = new ArrayList<>();
        slides.add(new Slide(1, "Introduction to " + topic));
        slides.add(new Slide(2, "Applications of " + topic));
        slides.add(new Slide(3, "Key Features of " + topic));
        slides.add(new Slide(4, "Challenges and Future Directions in " + topic));
        slides.add(new Slide(5, "Historical Context of " + topic));
        slides.add(new Slide(6, "Case Studies Related to " + topic));
        slides.add(new Slide(7, "Comparisons with Similar Topics"));
        slides.add(new Slide(8, "Implementation Strategies for " + topic));
        slides.add(new Slide(9, "Summary and Key Takeaways"));
        return slides;
    }
}
