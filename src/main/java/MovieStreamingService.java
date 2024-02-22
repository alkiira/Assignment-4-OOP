import java.util.*;
class MovieStreamingService implements MovieSubject {
    private Map<String, List<MovieViewer>> viewersByGenre = new HashMap<>();
    private Map<String, String> latestMoviesByGenre = new HashMap<>();

    public void addMovie(String movieTitle, String genre) {
        latestMoviesByGenre.put(genre, movieTitle);
        notifyViewers(genre, "New movie added: " + movieTitle);
    }

    @Override
    public void registerViewer(MovieViewer viewer, String genre) {
        viewersByGenre.computeIfAbsent(genre, k -> new ArrayList<>()).add(viewer);
    }

    @Override
    public void removeViewer(MovieViewer viewer, String genre) {
        List<MovieViewer> viewers = viewersByGenre.get(genre);
        if (viewers != null) {
            viewers.remove(viewer);
        }
    }

    @Override
    public void notifyViewers(String genre, String message) {
        List<MovieViewer> viewers = viewersByGenre.get(genre);
        if (viewers != null) {
            for (MovieViewer viewer : viewers) {
                viewer.update(genre, message);
            }
        }
    }
}