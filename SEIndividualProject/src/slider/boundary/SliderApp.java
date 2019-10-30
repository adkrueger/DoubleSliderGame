package slider.boundary;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.plaf.ButtonUI;
import javax.swing.plaf.basic.BasicButtonUI;

import slider.controller.MoveController;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;


public class SliderApp extends JFrame {

	JLabel moveCtr, msgLabel;
	JButton btnReset;
	JPanel panel_0, panel_1, panel_2, panel_3, panel_4, panel_5, panel_6, panel_7, panel_8;
	JLabel label_0, label_1, label_2, label_3, label_4, label_5, label_6, label_7, label_8;
	
	/**
	 * Create the frame.
	 */
	public SliderApp() {
		moveCtr = new JLabel("Moves: 0");
		moveCtr.setFont(new Font("Calibri", Font.BOLD, 30));
		
		msgLabel = new JLabel(" ");
		msgLabel.setFont(new Font("Calibri", Font.BOLD, 30));
		
		btnReset = new JButton("Reset");
		btnReset.setBorder(new LineBorder(Color.BLACK, 3));
		btnReset.setFont(new Font("Calibri", Font.BOLD, 30));
		btnReset.setUI((ButtonUI) BasicButtonUI.createUI(btnReset));
		btnReset.setBackground(Color.WHITE);
		btnReset.setPreferredSize(new Dimension(200, 40));
		btnReset.setMinimumSize(new Dimension(200, 40));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				moveCtr.setText("Moves: " + MoveController.resetMoves());
			}
		});
		
		panel_0 = new JPanel();
		panel_0.setPreferredSize(new Dimension(200, 200));
		panel_0.setBackground(Color.ORANGE);
		panel_0.setBorder(new LineBorder(Color.GRAY, 5));
		
		panel_1 = new JPanel();
		panel_1.setPreferredSize(new Dimension(200, 200));
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBorder(new LineBorder(Color.GRAY, 5));
		
		panel_2 = new JPanel();
		panel_2.setPreferredSize(new Dimension(200, 200));
		panel_2.setBackground(Color.DARK_GRAY);
		panel_2.setBorder(new LineBorder(Color.GRAY, 5));
		
		panel_3 = new JPanel();
		panel_3.setPreferredSize(new Dimension(200, 200));
		panel_3.setBackground(Color.DARK_GRAY);
		panel_3.setBorder(new LineBorder(Color.GRAY, 5));
		
		panel_4 = new JPanel();
		panel_4.setPreferredSize(new Dimension(200, 200));
		panel_4.setBackground(Color.LIGHT_GRAY);
		panel_4.setBorder(new LineBorder(Color.GRAY, 5));
		
		panel_5 = new JPanel();
		panel_5.setPreferredSize(new Dimension(200, 200));
		panel_5.setBackground(Color.LIGHT_GRAY);
		panel_5.setBorder(new LineBorder(Color.GRAY, 5));
		
		panel_6 = new JPanel();
		panel_6.setPreferredSize(new Dimension(200, 200));
		panel_6.setBackground(Color.DARK_GRAY);
		panel_6.setBorder(new LineBorder(Color.GRAY, 5));
		
		panel_7 = new JPanel();
		panel_7.setPreferredSize(new Dimension(200, 200));
		panel_7.setBackground(Color.DARK_GRAY);
		panel_7.setBorder(new LineBorder(Color.GRAY, 5));
		
		panel_8 = new JPanel();
		panel_8.setPreferredSize(new Dimension(200, 200));
		panel_8.setBackground(Color.LIGHT_GRAY);
		panel_8.setBorder(new LineBorder(Color.GRAY, 5));
		
				
		
		label_0 = new JLabel(" ");
		label_0.setFont(new Font("Calibri", Font.BOLD, 90));
		label_0.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panel_0 = new GroupLayout(panel_0);
		gl_panel_0.setHorizontalGroup(
			gl_panel_0.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_0.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_0, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_0.setVerticalGroup(
			gl_panel_0.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_0.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_0, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel_0.setLayout(gl_panel_0);
		
		label_1 = new JLabel("4");
		label_1.setFont(new Font("Calibri", Font.BOLD, 90));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_1, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_1, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel_1.setLayout(gl_panel_1);
		
		label_2 = new JLabel("3");
		label_2.setFont(new Font("Calibri", Font.BOLD, 90));
		label_2.setForeground(Color.WHITE);
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_2, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_2, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel_2.setLayout(gl_panel_2);
		
		label_3 = new JLabel("2");
		label_3.setFont(new Font("Calibri", Font.BOLD, 90));
		label_3.setForeground(Color.WHITE);
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_3, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_3, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel_3.setLayout(gl_panel_3);
				
		label_4 = new JLabel("3");
		label_4.setFont(new Font("Calibri", Font.BOLD, 90));
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_4, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_4, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel_4.setLayout(gl_panel_4);
		
		label_5 = new JLabel("4");
		label_5.setFont(new Font("Calibri", Font.BOLD, 90));
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_5, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_5.setVerticalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_5, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel_5.setLayout(gl_panel_5);
		
		label_6 = new JLabel("3");
		label_6.setFont(new Font("Calibri", Font.BOLD, 90));
		label_6.setForeground(Color.WHITE);
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panel_6 = new GroupLayout(panel_6);
		gl_panel_6.setHorizontalGroup(
			gl_panel_6.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_6.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_6, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_6.setVerticalGroup(
			gl_panel_6.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_6.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_6, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel_6.setLayout(gl_panel_6);
		
		label_7 = new JLabel("4");
		label_7.setFont(new Font("Calibri", Font.BOLD, 90));
		label_7.setForeground(Color.WHITE);
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panel_7 = new GroupLayout(panel_7);
		gl_panel_7.setHorizontalGroup(
			gl_panel_7.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_7.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_7, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_7.setVerticalGroup(
			gl_panel_7.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_7.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_7, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel_7.setLayout(gl_panel_7);
		
		label_8 = new JLabel("1");
		label_8.setFont(new Font("Calibri", Font.BOLD, 90));
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panel_8 = new GroupLayout(panel_8);
		gl_panel_8.setHorizontalGroup(
			gl_panel_8.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_8.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_8, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_8.setVerticalGroup(
			gl_panel_8.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_8.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_8, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel_8.setLayout(gl_panel_8);
		
	}
}
