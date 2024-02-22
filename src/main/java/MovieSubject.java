interface MovieSubject {
    void registerViewer(MovieViewer viewer, String genre);
    void removeViewer(MovieViewer viewer, String genre);
    void notifyViewers(String genre, String message);
    void addMovie(String movieTitle, String genre);
}