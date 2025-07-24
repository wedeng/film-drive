package view;

import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.*;

public class MovieComponent extends JPanel {

    private final Movie movie;
    private final JLabel poster = new JLabel();
    private final JLabel title = new JLabel();
    private final JLabel year = new JLabel();

    public MovieComponent(Movie movie) {
        super(new GridBagLayout());

        this.movie = movie;

        this.setPreferredSize(new Dimension(112, 192));
        this.setBorder(BorderFactory.createLineBorder(Color.black));

        // get poster image from URL (placeholder code)
        URL url;
        try {
            url = new URL("https://image.tmdb.org/t/p/w92/4CkZl1LK6a5rXBqJB2ZP77h3N5i.jpg");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        final ImageIcon posterImage = new ImageIcon(url);
        poster.setIcon(posterImage);

        poster.setPreferredSize(new Dimension(92, 138));
        title.setText("Sinners");
        year.setText("2025");
        year.setForeground(Color.GRAY);

        this.add(poster, initializePosterConstraints());
        this.add(title, initializeTitleConstraints());
        this.add(year, initializeYearConstraints());

    }

    private GridBagConstraints initializePosterConstraints() {
        final GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.fill = GridBagConstraints.NONE;

        return c;
    }

    private GridBagConstraints initializeTitleConstraints() {
        final GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 1;
        c.fill = GridBagConstraints.NONE;

        return c;
    }

    private GridBagConstraints initializeYearConstraints() {
        final GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 2;
        c.fill = GridBagConstraints.NONE;

        return c;
    }

}
