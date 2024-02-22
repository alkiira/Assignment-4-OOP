public class Main {
    public static void main(String[] args) {
        MovieStreamingService streamingService = new MovieStreamingService();
        PremiumViewer premiumViewer1 = new PremiumViewer("Alina");
        RegularViewer regularViewer1 = new RegularViewer("Alua");
        RegularViewer regularViewer2 = new RegularViewer("Zarina");

        streamingService.registerViewer(premiumViewer1, "Drama");
        streamingService.registerViewer(regularViewer1, "Romance");
        streamingService.registerViewer(regularViewer2, "Comedy");

        streamingService.addMovie("Black Swan", "Drama");
        streamingService.addMovie("Love, Rosie", "Romance");
        streamingService.addMovie("50 First Dates", "Comedy");
    }
}