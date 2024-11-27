        // Ask for Topic
        System.out.println("\n\u001B[36mEnter the topic for the presentation: \u001B[0m");
        String topic = scanner.nextLine();

        // Create Content Generator
        ContentGenerator contentGenerator = new AIContentGenerator();
        List<Slide> slides = contentGenerator.generateSlides(topic);

        // Display Slide Content
        System.out.println("\n\u001B[1m-------------------------------------\u001B[0m");
        System.out.println("\u001B[1mGenerated Slides for \u001B[32m" + topic + ":\u001B[0m");
        System.out.println("\u001B[1m-------------------------------------\u001B[0m");
        for (Slide slide : slides) {
            System.out.println(slide);
        }
    }
