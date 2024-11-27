        // Choose Design Theme
        System.out.println("\n\u001B[1m*************** Choose a theme for the presentation: ***************\u001B[0m");
        System.out.println("\u001B[34m1.\u001B[0m Professional Theme");
        System.out.println("\u001B[32m2.\u001B[0m Minimalistic Theme");
        System.out.println("\u001B[35m3.\u001B[0m Creative Theme");
        System.out.print("\u001B[36mEnter your choice (1/2/3): \u001B[0m");
        int choice = scanner.nextInt();

        DesignSuggestion theme = null;
        switch (choice) {
            case 1:
                theme = new ProfessionalTheme();
                break;
            case 2:
                theme = new MinimalisticTheme();
                break;
            case 3:
                theme = new CreativeTheme();
                break;
            default:
                System.out.println("\u001B[31mInvalid choice. Defaulting to Professional Theme.\u001B[0m");
                theme = new ProfessionalTheme();
        }
