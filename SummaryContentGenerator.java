package services;

public class SummaryContentGenerator implements ContentGenerator {
    @Override
    public void generateContent(String topic) {
        System.out.println("Generating summarized content for: " + topic);
    }
}
