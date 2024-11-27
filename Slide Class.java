class Slide {
    private int slideNumber;
    private String content;

    public Slide(int slideNumber, String content) {
        this.slideNumber = slideNumber;
        this.content = content;
    }

    public int getSlideNumber() {
        return slideNumber;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "\u001B[33mSlide " + slideNumber + ": \u001B[0m" + content;  // Yellow slide number
    }
}




