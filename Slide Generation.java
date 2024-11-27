package services;

public class DetailedContentGenerator implements ContentGenerator {
    @Override
    public void generateContent(String topic) {
        System.out.println("Generating detailed content for: " + topic);
    }
}
