package com.company;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class Football extends JFrame
{
    Integer Madrid_score = 0;
    Integer Milan_score = 0;
    String lscorer = "";
    String win = "Draw";
    JButton but1 = new JButton("Milan");
    JButton but2 = new JButton("Madrid");
    JLabel score = new JLabel("Milan " + Milan_score + " X " + Madrid_score + " Madrid");
    JLabel lastScorer = new JLabel("Last scorer: " + lscorer);
    JLabel winner = new JLabel("Winner:" + win);
    public Football()
    {
        setLayout(null);
        but1.setBounds(100,300,100,50);
        but2.setBounds(300,300,100,50);
        score.setBounds(150, 200, 300,40);
        lastScorer.setBounds(250, 350, 150, 40);
        winner.setBounds(250, 400, 150, 40);
        add(but1);
        add(score);
        add(but2);
        add(lastScorer);
        add(winner);
        setSize(500,500);

        but1.addMouseListener(new MouseListener()
        {
            public void mouseExited(MouseEvent a){}
            public void mouseClicked(MouseEvent a)
            {
                Milan_score++;
                lscorer = "Milan";
                lastScorer.setText("Last scorer: " + lscorer);
                score.setText("Milan " + Milan_score + " X " + Madrid_score + " Madrid");
                if(Milan_score > Madrid_score){
                    win = "Milan";
                    winner.setText("Winner: " + win);
                }else if(Milan_score==Madrid_score){
                    win = "Draw";
                    winner.setText("Winner: " + win);}
            }
            public void mouseEntered(MouseEvent a) {}
            public void mouseReleased(MouseEvent a) {}
            public void mousePressed(MouseEvent a) {}
        });

        but2.addMouseListener(new MouseListener()
        {
            public void mouseExited(MouseEvent a){}
            public void mouseClicked(MouseEvent a)
            {
                Madrid_score++;
                lscorer = "Madrid";
                lastScorer.setText("Last scorer: " + lscorer);
                score.setText("Milan " + Milan_score + " X " + Madrid_score + " Madrid");
                if(Madrid_score > Milan_score){
                    win = "Madrid";
                    winner.setText("Winner: " + win);
                } else if(Milan_score==Madrid_score){
                    win = "Draw";
                    winner.setText("Winner: " + win);}
            }
            public void mouseEntered(MouseEvent a) {}
            public void mouseReleased(MouseEvent a) {}
            public void mousePressed(MouseEvent a) {}
        });
    }

    public static void main(String[]args)
    {
        new Football().setVisible(true);
    }
}