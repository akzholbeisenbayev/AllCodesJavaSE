package Job;

import java.awt.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
import java.net.URL;

public class ImageBee
{

    public static void main(String[] args) {
        FrameI frame = new FrameI();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.show();
    }
}

    class ImageP extends JPanel
    {
        private Image image;

        public ImageP()
        {
            try {
                URL url = new URL("https://lh3.googleusercontent.com/proxy/pBswINHWXtVzwa0Ubm2HZGmYMDRo_ubg_tx-NXQbXgia-C24wkT1tbLptaNnkSVmeQL9CzbkDoplr7HBXmcqH15n9aWVrVPNWwH-zO8P7L4GK0V2wrkPOGS3tUV23qOgrNxbtA4adJ2czGE");
                image = ImageIO.read(url);
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }

        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            g.drawImage(image, 0, 0, null);
        }
    }


    class FrameI extends JFrame
    {
        public FrameI()
        {
            setTitle("Image bee");
            setSize(280,270);

            ImageP panel = new ImageP();
            Container contentPane = getContentPane();
            contentPane.add(panel);
        }
    }
