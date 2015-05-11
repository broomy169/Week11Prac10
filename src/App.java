import model.Tally;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by jc258876 on 11/05/15.
 */
public class App {
    private static Tally tally;
    private static MainFrame frame;

    public static void main(String[] args) {
        frame = new MainFrame();
        tally = new Tally();

        frame.addButtonHandler(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int amount = Integer.parseInt(e.getActionCommand());
                tally.increment(amount);
                frame.setResult(tally.toString());
            }
        });

        frame.addClearHandler(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tally.reset();
                frame.setResult(tally.toString());
            }
        });

        frame.setVisible(true);

    }


}
