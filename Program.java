import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Program {

    public static void main(String[] args) {
        JFrame frame = new JFrame("JTextArea");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        JTextField textField = new JTextField();
        JButton button = new JButton("save");
        JTextArea textArea = new JTextArea();

        panel.setSize(300,400);
        panel.setBorder(new EmptyBorder(new Insets(30, 30, 30, 30)));
        textField.setMaximumSize(new Dimension(200, 30));

        JScrollPane scrollPane = new JScrollPane(textArea);
        textArea.setEditable(false);


        ActionListener pushButton = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!textField.getText().equals("")) {
                    textArea.append(textField.getText() + "\n");
                }
            }
        };
        textField.setMinimumSize(new Dimension(200, 40));
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        textField.setAlignmentX(Component.CENTER_ALIGNMENT);
        button.addActionListener(pushButton);

        textArea.setLineWrap(true);


        panel.add(textField);
        panel.add(button);
        panel.add(Box.createRigidArea(new Dimension(0, 30)));
        panel.add(scrollPane);



        frame.add(panel);
        frame.setSize(panel.getSize());

        frame.setVisible(true);
    }
}
