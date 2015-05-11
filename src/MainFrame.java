import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by jc258876 on 11/05/15.
 */
public class MainFrame extends JFrame {
    private JButton[][] buttons;
    private JLabel result;
    private JButton clear;

    public MainFrame() {
        result = new JLabel("Tally: ?");
        clear = new JButton("Clear");
        add(result, BorderLayout.NORTH);
        add(clear, BorderLayout.SOUTH);
        buttons = new JButton[3][3];

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3));
        int count = 1;
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                String text = "" + count++;
                JButton button = new JButton(text);
                button.setActionCommand(text);
                panel.add(button);
                buttons[i][j] = button;
            }
        }
        add(panel);
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    public void addButtonHandler(ActionListener listener) {
        for (JButton[] row : buttons) {
            for (JButton button :row) {
                button.addActionListener(listener);
            }
        }
    }

    public void addClearHandler(ActionListener listener) {
        clear.addActionListener(listener);
    }

    public void setResult(String s) {
        result.setText(s);
    }

}
