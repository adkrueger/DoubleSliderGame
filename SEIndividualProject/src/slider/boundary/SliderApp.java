package slider.boundary;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.plaf.ButtonUI;
import javax.swing.plaf.basic.BasicButtonUI;

import slider.controller.MoveController;
import slider.model.Model;
import slider.model.Tile;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SwingConstants;


public class SliderApp extends JPanel {

	JLabel moveCtr, msgLabel;
	JButton btnReset;
	Model panel_0, panel_1, panel_2, panel_3, panel_4, panel_5, panel_6, panel_7, panel_8;
	JLabel label_0, label_1, label_2, label_3, label_4, label_5, label_6, label_7, label_8;
	Tile tile_00, tile_10, tile_20, tile_01, tile_11, tile_21, tile_02, tile_12, tile_22;
	Puzzle puzzle;
	
	/**
	 * Create the frame.
	 */
	public SliderApp(Puzzle puzzle) {
		
		this.puzzle = puzzle;
		
		tile_00 = new Tile("00", Color.ORANGE, Color.BLACK, true, " ");
		tile_10 = new Tile("10", Color.LIGHT_GRAY, Color.BLACK, false, "4");
		tile_20 = new Tile("20", Color.DARK_GRAY, Color.WHITE, false, "3");
		tile_01 = new Tile("01", Color.DARK_GRAY, Color.WHITE, false, "2");
		tile_11 = new Tile("11", Color.LIGHT_GRAY, Color.BLACK, false, "3");
		tile_21 = new Tile("21", Color.LIGHT_GRAY, Color.BLACK, false, "4");
		tile_02 = new Tile("02", Color.DARK_GRAY, Color.WHITE, false, "3");
		tile_12 = new Tile("12", Color.DARK_GRAY, Color.WHITE, false, "4");
		tile_22 = new Tile("22", Color.LIGHT_GRAY, Color.BLACK, false, "1");

		label_0 = new JLabel(tile_00.getValue());
		label_1 = new JLabel(tile_10.getValue());
		label_2 = new JLabel(tile_20.getValue());
		label_3 = new JLabel(tile_01.getValue());
		label_4 = new JLabel(tile_11.getValue());
		label_5 = new JLabel(tile_21.getValue());
		label_6 = new JLabel(tile_02.getValue());
		label_7 = new JLabel(tile_12.getValue());
		label_8 = new JLabel(tile_22.getValue());

		panel_0 = new Model(tile_00, label_0);
		panel_1 = new Model(tile_10, label_1);
		panel_2 = new Model(tile_20, label_2);
		panel_3 = new Model(tile_01, label_3);
		panel_4 = new Model(tile_11, label_4);
		panel_5 = new Model(tile_21, label_5);
		panel_6 = new Model(tile_02, label_6);
		panel_7 = new Model(tile_12, label_7);
		panel_8 = new Model(tile_22, label_8);

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

		panel_0.setPreferredSize(new Dimension(200, 200));
		panel_0.setBackground(tile_00.getBgColor());
		panel_0.setBorder(new LineBorder(Color.GRAY, 5));
		MoveController MC_0 = new MoveController(panel_0, tile_00, puzzle);
		panel_0.addMouseListener(MC_0);
		
		panel_1.setPreferredSize(new Dimension(200, 200));
		panel_1.setBackground(tile_10.getBgColor());
		panel_1.setBorder(new LineBorder(Color.GRAY, 5));
		MoveController MC_1 = new MoveController(panel_1, tile_10, puzzle);
		panel_1.addMouseListener(MC_1);
		
		panel_2.setPreferredSize(new Dimension(200, 200));
		panel_2.setBackground(tile_20.getBgColor());
		panel_2.setBorder(new LineBorder(Color.GRAY, 5));
		MoveController MC_2 = new MoveController(panel_2, tile_20, puzzle);
		panel_2.addMouseListener(MC_2);
		
		panel_3.setPreferredSize(new Dimension(200, 200));
		panel_3.setBackground(tile_01.getBgColor());
		panel_3.setBorder(new LineBorder(Color.GRAY, 5));
		MoveController MC_3 = new MoveController(panel_3, tile_01, puzzle);
		panel_3.addMouseListener(MC_3);
		
		panel_4.setPreferredSize(new Dimension(200, 200));
		panel_4.setBackground(tile_11.getBgColor());
		panel_4.setBorder(new LineBorder(Color.GRAY, 5));
		MoveController MC_4 = new MoveController(panel_4, tile_11, puzzle);
		panel_4.addMouseListener(MC_4);
		
		panel_5.setPreferredSize(new Dimension(200, 200));
		panel_5.setBackground(tile_21.getBgColor());
		panel_5.setBorder(new LineBorder(Color.GRAY, 5));
		MoveController MC_5 = new MoveController(panel_5, tile_21, puzzle);
		panel_5.addMouseListener(MC_5);
		
		panel_6.setPreferredSize(new Dimension(200, 200));
		panel_6.setBackground(tile_02.getBgColor());
		panel_6.setBorder(new LineBorder(Color.GRAY, 5));
		MoveController MC_6 = new MoveController(panel_6, tile_02, puzzle);
		panel_6.addMouseListener(MC_6);
		
		panel_7.setPreferredSize(new Dimension(200, 200));
		panel_7.setBackground(tile_12.getBgColor());
		panel_7.setBorder(new LineBorder(Color.GRAY, 5));
		MoveController MC_7 = new MoveController(panel_7, tile_12, puzzle);
		panel_7.addMouseListener(MC_7);
		
		panel_8.setPreferredSize(new Dimension(200, 200));
		panel_8.setBackground(tile_22.getBgColor());
		panel_8.setBorder(new LineBorder(Color.GRAY, 5));
		MoveController MC_8 = new MoveController(panel_8, tile_22, puzzle);
		panel_8.addMouseListener(MC_8);
				
		label_0.setFont(new Font("Calibri", Font.BOLD, 90));
		label_0.setForeground(tile_00.getFgColor());
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
		
		label_1.setFont(new Font("Calibri", Font.BOLD, 90));
		label_1.setForeground(tile_10.getFgColor());
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
		
		label_2.setFont(new Font("Calibri", Font.BOLD, 90));
		label_2.setForeground(tile_20.getFgColor());
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
		
		label_3.setFont(new Font("Calibri", Font.BOLD, 90));
		label_3.setForeground(tile_01.getFgColor());
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
				
		label_4.setFont(new Font("Calibri", Font.BOLD, 90));
		label_4.setForeground(tile_11.getFgColor());
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
		
		label_5.setFont(new Font("Calibri", Font.BOLD, 90));
		label_5.setForeground(tile_21.getFgColor());
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

		label_6.setFont(new Font("Calibri", Font.BOLD, 90));
		label_6.setForeground(tile_02.getFgColor());
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
		
		label_7.setFont(new Font("Calibri", Font.BOLD, 90));
		label_7.setForeground(tile_12.getFgColor());
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
		
		label_8.setFont(new Font("Calibri", Font.BOLD, 90));
		label_8.setForeground(tile_22.getFgColor());
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
