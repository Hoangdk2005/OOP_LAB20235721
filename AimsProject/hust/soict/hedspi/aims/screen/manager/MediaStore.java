package hust.soict.hedspi.aims.screen.manager;
import hust.soict.hedspi.aims.media.Media;  
import hust.soict.hedspi.aims.media.Playable;

import javax.swing.*;
import java.awt.*;

public class MediaStore extends JPanel {
    private Media media;

    public MediaStore(Media media) {
        this.media = media;
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        JLabel title = new JLabel(media.getTitle());
        JLabel cost = new JLabel(media.getCost() + " $");
        this.add(title);
        this.add(cost);

        if (media instanceof Playable) {
            
            JButton playButton = new JButton("Play");
            playButton.addActionListener(e -> {
                ((Playable) media).play();
                JOptionPane.showMessageDialog(this,
                    "Media is now playing.", "Playing", JOptionPane.INFORMATION_MESSAGE);
            });
            this.add(playButton);
        }
    }
}
