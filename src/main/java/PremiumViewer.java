class PremiumViewer implements MovieViewer {
    private String name;

    public PremiumViewer(String name) {
        this.name = name;
    }

    @Override
    public void update(String genre, String message) {
        System.out.println(name + " received update in " + genre + " category: " + message);
    }
}