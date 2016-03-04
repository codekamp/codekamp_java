package in.codekamp.todoapp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by cerebro on 03/03/16.
 */
public class ToDoList extends JFrame implements ActionListener {
    private JList list1;
    private JButton addButton;
    private JButton editButton;
    private JButton doneButton;
    private JPanel mainPanel;
    private DefaultListModel model;
    private static final String WINDOW_TITLE = "CodeKamp ToDo app";
    private static final String NO_SELECTION_ERROR = "Please select some task!";
    private static final String TASK_EXISTS_ERROR = "Task already exists!";

    public ToDoList() {
        super(WINDOW_TITLE);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setContentPane(this.mainPanel);
        this.pack();

        this.addButton.addActionListener(this);
        this.editButton.addActionListener(this);
        this.doneButton.addActionListener(this);

        this.model = new DefaultListModel();
        this.list1.setModel(this.model);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.addButton) {
            this.addButtonClicked();

        } else if (e.getSource() == this.editButton) {
            this.editButtonClicked();

        } else if (e.getSource() == this.doneButton) {
            this.doneButtonClicked();
        }

    }

    //REFACTORING

    private void addButtonClicked() {
        String task = JOptionPane.showInputDialog(this, "Please enter your task.");

        if (task != null) {
            if (this.model.contains(task)) {
                this.showError(TASK_EXISTS_ERROR);
            } else {
                this.model.addElement(task);
                //code to add to database
            }
        }
    }

    private void editButtonClicked() {
        int selectedIndex = this.list1.getSelectedIndex();

        if (selectedIndex >= 0) {

            String currentTask = (String) this.model.get(selectedIndex);
            String newTask = JOptionPane.showInputDialog(this, "Please edit your task.", currentTask);

            if (newTask != null) {
                this.model.set(selectedIndex, newTask);
            }
        } else {
            this.showError(NO_SELECTION_ERROR);
        }
    }

    private void doneButtonClicked() {
        int selectedIndex = this.list1.getSelectedIndex();

        if (selectedIndex >= 0) {
            this.model.remove(selectedIndex);
        } else {
            this.showError(NO_SELECTION_ERROR);
        }
    }

    private void showError() {
        this.showError("Some error occured! Please try again later");
    }

    private void showError(String error) {
        JOptionPane.showMessageDialog(this, error);
    }
}
