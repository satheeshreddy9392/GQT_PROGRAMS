package com.sr.srquiz.page1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class QuizAppSwing extends JFrame implements ActionListener {

    private CardLayout cardLayout;
    private JPanel mainPanel;

    // Login Components
    private JTextField nameField, mobileField;

    // Quiz Components
    private JLabel questionLabel, rewardLabel;
    private JRadioButton opt1, opt2, opt3, opt4;
    private JButton nextButton, lifelineButton;
    private ButtonGroup bg;

    private int questionIndex = 0;
    private int reward = 0;
    private boolean lifelineUsed = false;

    // Questions
    private String questions[] = {
            "1) What is the Addition symbol?",
            "2) What is the Modulus symbol?",
            "3) What is the Multiplication symbol?",
            "4) What is the Subtraction symbol?",
            "5) What is the Division symbol?",
            "6) Logical operators in Java?",
            "7) Arithmetic operators in Java?",
            "8) Relational operators in Java?",
            "9) Assignment operators in Java?",
            "10) How many loops in Java?"
    };

    private String options[][] = {
            {"+", "-", "*", "/"},
            {"+", "-", "*", "%"},
            {"+", "-", "*", "/"},
            {"+", "-", "*", "/"},
            {"+", "-", "*", "/"},
            {"&&, ||, !", "+,-,*,/,%", "==,+=", "<,>"},
            {"&&,||,!", "+,-,*,/,%", "==,+=", "<,>"},
            {"&&,||,!", "+,-,*,/,%", "<,>,<=,>=,==,!=", "T,F"},
            {"&&,||,!", "+,-,*,/,%", "<,>,<=,>=,==,!=", "=,+=,-=,*=,/=,%="},
            {"1", "2", "3", "4"}
    };

    private int answers[] = {0, 3, 2, 1, 3, 0, 1, 2, 3, 2};

    public QuizAppSwing() {

        setTitle("Professional Quiz Application");
        setSize(650, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        mainPanel.add(createLoginPanel(), "Login");
        mainPanel.add(createQuizPanel(), "Quiz");

        add(mainPanel);
        setVisible(true);
    }

    // ---------------- LOGIN PANEL ----------------
    private JPanel createLoginPanel() {

        JPanel panel = new JPanel(null);

        JLabel title = new JLabel("QUIZ APPLICATION", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setBounds(150, 60, 350, 40);

        JLabel nameLabel = new JLabel("Enter Name:");
        nameLabel.setBounds(200, 150, 120, 25);

        nameField = new JTextField();
        nameField.setBounds(320, 150, 150, 25);

        JLabel mobileLabel = new JLabel("Mobile:");
        mobileLabel.setBounds(200, 190, 120, 25);

        mobileField = new JTextField();
        mobileField.setBounds(320, 190, 150, 25);

        JButton loginButton = new JButton("Start Quiz");
        loginButton.setBounds(270, 250, 120, 35);

        loginButton.addActionListener(e -> {
            if (nameField.getText().isEmpty() || mobileField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill all fields!");
            } else {
                cardLayout.show(mainPanel, "Quiz");
                loadQuestion();
            }
        });

        panel.add(title);
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(mobileLabel);
        panel.add(mobileField);
        panel.add(loginButton);

        return panel;
    }

    // ---------------- QUIZ PANEL ----------------
    private JPanel createQuizPanel() {

        JPanel panel = new JPanel(null);

        rewardLabel = new JLabel("Reward: 0");
        rewardLabel.setFont(new Font("Arial", Font.BOLD, 16));
        rewardLabel.setBounds(500, 20, 120, 30);

        questionLabel = new JLabel();
        questionLabel.setFont(new Font("Arial", Font.BOLD, 16));
        questionLabel.setBounds(50, 60, 550, 30);

        opt1 = new JRadioButton();
        opt1.setBounds(70, 120, 500, 25);

        opt2 = new JRadioButton();
        opt2.setBounds(70, 150, 500, 25);

        opt3 = new JRadioButton();
        opt3.setBounds(70, 180, 500, 25);

        opt4 = new JRadioButton();
        opt4.setBounds(70, 210, 500, 25);

        bg = new ButtonGroup();
        bg.add(opt1);
        bg.add(opt2);
        bg.add(opt3);
        bg.add(opt4);

        lifelineButton = new JButton("Use Lifeline");
        lifelineButton.setBounds(120, 300, 150, 35);
        lifelineButton.addActionListener(e -> useLifeline());

        nextButton = new JButton("Next");
        nextButton.setBounds(380, 300, 120, 35);
        nextButton.addActionListener(this);

        panel.add(rewardLabel);
        panel.add(questionLabel);
        panel.add(opt1);
        panel.add(opt2);
        panel.add(opt3);
        panel.add(opt4);
        panel.add(lifelineButton);
        panel.add(nextButton);

        return panel;
    }

    // ---------------- LOAD QUESTION ----------------
    private void loadQuestion() {

        questionLabel.setText(questions[questionIndex]);

        opt1.setText(options[questionIndex][0]);
        opt2.setText(options[questionIndex][1]);
        opt3.setText(options[questionIndex][2]);
        opt4.setText(options[questionIndex][3]);

        opt1.setVisible(true);
        opt2.setVisible(true);
        opt3.setVisible(true);
        opt4.setVisible(true);

        bg.clearSelection();
    }

    // ---------------- LIFELINE ----------------
    private void useLifeline() {

        if (lifelineUsed) {
            JOptionPane.showMessageDialog(this, "Lifeline already used!");
            return;
        }

        String[] choices = {"50-50", "Audience Poll"};
        int choice = JOptionPane.showOptionDialog(
                this,
                "Choose Lifeline",
                "Lifeline",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                choices,
                choices[0]
        );

        if (choice == 0) {
            useFiftyFifty();
        } else if (choice == 1) {
            useAudiencePoll();
        }

        lifelineUsed = true;
    }

    private void useFiftyFifty() {

        int correct = answers[questionIndex];

        for (int i = 0; i < 4; i++) {
            if (i != correct && i != (correct + 2) % 4) {
                if (i == 0) opt1.setVisible(false);
                if (i == 1) opt2.setVisible(false);
                if (i == 2) opt3.setVisible(false);
                if (i == 3) opt4.setVisible(false);
            }
        }

        JOptionPane.showMessageDialog(this, "50-50 Lifeline Used!");
    }

    private void useAudiencePoll() {

        int correct = answers[questionIndex];
        int[] poll = new int[4];

        for (int i = 0; i < 4; i++) {
            if (i == correct)
                poll[i] = 50 + (int) (Math.random() * 30);
            else
                poll[i] = (int) (Math.random() * 30);
        }

        String message =
                opt1.getText() + " ➜ " + poll[0] + "%\n" +
                opt2.getText() + " ➜ " + poll[1] + "%\n" +
                opt3.getText() + " ➜ " + poll[2] + "%\n" +
                opt4.getText() + " ➜ " + poll[3] + "%";

        JOptionPane.showMessageDialog(this,
                message,
                "Audience Poll",
                JOptionPane.INFORMATION_MESSAGE);
    }

    // ---------------- NEXT BUTTON ----------------
    public void actionPerformed(ActionEvent e) {

        int selected = -1;

        if (opt1.isSelected()) selected = 0;
        if (opt2.isSelected()) selected = 1;
        if (opt3.isSelected()) selected = 2;
        if (opt4.isSelected()) selected = 3;

        if (selected == -1) {
            JOptionPane.showMessageDialog(this, "Please select an option!");
            return;
        }

        if (selected == answers[questionIndex]) {
            reward += 100;
            rewardLabel.setText("Reward: " + reward);
        } else {
            JOptionPane.showMessageDialog(this,
                    "Wrong Answer!\nGame Over\nTotal Reward: " + reward);
            System.exit(0);
        }

        questionIndex++;

        if (questionIndex < questions.length) {
            loadQuestion();
        } else {
            JOptionPane.showMessageDialog(this,
                    "Congratulations " + nameField.getText() +
                            "!\nYou Won the Quiz!\nTotal Reward: " + reward);
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new QuizAppSwing();
    }
}
