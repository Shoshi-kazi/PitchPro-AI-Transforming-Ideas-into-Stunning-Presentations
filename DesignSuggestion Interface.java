interface DesignSuggestion {
    String suggestTheme(int choice);
}

class ProfessionalTheme implements DesignSuggestion {
    @Override
    public String suggestTheme(int choice) {
        return "\u001B[34mProfessional Theme:\u001B[0m\n"
                + "1. Use a formal color scheme like blue and white.\n"
                + "2. Incorporate charts, graphs, and data visuals.\n"
                + "3. Maintain consistent font sizes and use Sans Serif fonts.\n"
                + "4. Add a footer with your name, date, and slide numbers.\n"
                + "5. Use clear section breaks for seamless transitions.";
    }
}

class MinimalisticTheme implements DesignSuggestion {
    @Override
    public String suggestTheme(int choice) {
        return "\u001B[32mMinimalistic Theme:\u001B[0m\n"
                + "1. Stick to neutral tones like black, white, and gray.\n"
                + "2. Use bullet points and infographics.\n"
                + "3. Avoid clutter: Limit text to 6 lines per slide.\n"
                + "4. Include a subtle background image.\n"
                + "5. Rely on whitespace for a clean, modern aesthetic.";
    }
}

class CreativeTheme implements DesignSuggestion {
    @Override
    public String suggestTheme(int choice) {
        return "\u001B[35mCreative Theme:\u001B[0m\n"
                + "1. Use bold, vibrant colors like teal or orange.\n"
                + "2. Add animations or motion graphics.\n"
                + "3. Experiment with diagonal layouts.\n"
                + "4. Include dynamic visuals like 3D models.\n"
                + "5. Use artistic typography for titles.";
    }
}


