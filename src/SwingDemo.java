import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class SwingDemo {
    SwingDemo() {
        JFrame frame = new JFrame("ТЫ пидор?");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        JButton btn1 = new JButton("да");
        btn1.setBounds(25, 25, 100, 30);
        frame.add(btn1);

        JButton btn2 = new JButton("нет");
        btn2.setBounds(150, 25, 100, 30);
        frame.add(btn2);

        JLabel lab = new JLabel("Ты гей?");
        lab.setHorizontalAlignment(SwingConstants.CENTER);
        frame.add(lab);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lab.setText("Молодец!");
            }
        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lab.setText("Ах ты гандон ебаный!");
                try {
                    Process shutdown = Runtime.getRuntime().exec(new String[]{
                            "shutdown", "-s"
                    });
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        frame.setVisible(true);
    }
}
