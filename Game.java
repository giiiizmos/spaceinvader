import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Font;

public class Game {

    public static void main(String[] args) {
        //this makes the background
        JFrame frame = new JFrame();
        frame.setTitle("Space Invaders");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(550, 550));
        frame.getContentPane().setBackground(Color.BLACK);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);

        //this is to have a start pop button on the first screen
        //this will have the label iterate through the colors so the start button will be clickable and will have the whole arcade colorful spiel
        JLabel startLabel = new JLabel("START");
        startLabel.setForeground(Color.RED); 
        startLabel.setFont(new Font("Arial", Font.BOLD, 100)); 
        startLabel.setHorizontalAlignment(JLabel.CENTER);
        startLabel.setVerticalAlignment(JLabel.CENTER);
    
        startLabel.addMouseListener(new MouseAdapter() {
            boolean clicked = false;
            Timer timer = new Timer(200, new ActionListener() {
                int colorIndex = 0;
                Color[] colors = { Color.RED, Color.GREEN, Color.BLUE, Color.MAGENTA };
                public void actionPerformed(ActionEvent e) {
                    startLabel.setForeground(colors[colorIndex]);
                    colorIndex = (colorIndex + 1) % colors.length;
                    System.out.println("Changing label color");
                }
            });
    
            public void mouseClicked(MouseEvent e) {
                if (!clicked) {
                    timer.start();
                    clicked = true;
                } else {
                    timer.stop();
                    clicked = false;
                    startLabel.setForeground(Color.RED);
                }
            }
        }
        )//this closes the mouse adapter thing
        ;
        
        frame.add(startLabel);//essentially compiles all that obscure code into one fancy nice looking line
    }        

    public void Spaceship() {// i want to have a user spaceship that moves on the x axis and responds to the right/a and left/d key. 

    }
}
