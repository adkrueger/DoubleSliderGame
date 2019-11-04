package slider.boundary;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.plaf.ButtonUI;
import javax.swing.plaf.basic.BasicButtonUI;

import slider.controller.BoardController;
import slider.controller.MoveController;
import slider.model.Model;
import slider.model.SliderApp;
import slider.model.Tile;

public class Puzzle extends JFrame {

	private static final long serialVersionUID = 1L;	// to satisfy warning check
	
	private JPanel contentPane;
	public BoardController BC;
	private JLabel moveCtr, msgLabel;
	
	/**
	 * Create the frame.
	 */
	public Puzzle() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 675, 750);
		
		moveCtr = new JLabel("Moves: 0");
		moveCtr.setFont(new Font("Calibri", Font.BOLD, 30));
		
		msgLabel = new JLabel(" ");
		msgLabel.setFont(new Font("Calibri", Font.BOLD, 30));
		
		BC = new BoardController(this);
		SliderApp SA = BC.getSliderApp();		
		BC.initVars(new Tile[]{SA.tile_00, SA.tile_10, SA.tile_20, SA.tile_01, SA.tile_11, 
						SA.tile_21, SA.tile_02, SA.tile_12, SA.tile_22}, 
				new Model[]{SA.panel_0, SA.panel_1, SA.panel_2, SA.panel_3, SA.panel_4, 
						SA.panel_5, SA.panel_6, SA.panel_7, SA.panel_8},
				"20", moveCtr, msgLabel);
		
		contentPane = new JPanel();
		contentPane.setPreferredSize(new Dimension(850, 850));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(Color.BLACK);
		setContentPane(contentPane);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBorder(new LineBorder(Color.BLACK, 3));
		btnReset.setFont(new Font("Calibri", Font.BOLD, 30));
		btnReset.setUI((ButtonUI) BasicButtonUI.createUI(btnReset));
		btnReset.setBackground(Color.WHITE);
		btnReset.setPreferredSize(new Dimension(200, 40));
		btnReset.setMinimumSize(new Dimension(200, 40));
		btnReset.addMouseListener(new MouseAdapter() {
	        public void mousePressed(MouseEvent evt) {
	        	moveCtr.setText("Moves: " + BC.resetMoves());
	        	BC.resetBoard();
	        }
	    });


		SA.panel_0.setPreferredSize(new Dimension(200, 200));
		SA.panel_0.setBackground(SA.tile_00.getBgColor());
		SA.panel_0.setBorder(new LineBorder(Color.GRAY, 5));
		MoveController MC_0 = new MoveController(SA.panel_0, SA.tile_00, this);
		SA.panel_0.addMouseListener(MC_0);
		
		SA.panel_1.setPreferredSize(new Dimension(200, 200));
		SA.panel_1.setBackground(SA.tile_10.getBgColor());
		SA.panel_1.setBorder(new LineBorder(Color.GRAY, 5));
		MoveController MC_1 = new MoveController(SA.panel_1, SA.tile_10, this);
		SA.panel_1.addMouseListener(MC_1);
		
		SA.panel_2.setPreferredSize(new Dimension(200, 200));
		SA.panel_2.setBackground(SA.tile_20.getBgColor());
		SA.panel_2.setBorder(new LineBorder(Color.GRAY, 5));
		MoveController MC_2 = new MoveController(SA.panel_2, SA.tile_20, this);
		SA.panel_2.addMouseListener(MC_2);
		
		SA.panel_3.setPreferredSize(new Dimension(200, 200));
		SA.panel_3.setBackground(SA.tile_01.getBgColor());
		SA.panel_3.setBorder(new LineBorder(Color.GRAY, 5));
		MoveController MC_3 = new MoveController(SA.panel_3, SA.tile_01, this);
		SA.panel_3.addMouseListener(MC_3);
		
		SA.panel_4.setPreferredSize(new Dimension(200, 200));
		SA.panel_4.setBackground(SA.tile_11.getBgColor());
		SA.panel_4.setBorder(new LineBorder(Color.GRAY, 5));
		MoveController MC_4 = new MoveController(SA.panel_4, SA.tile_11, this);
		SA.panel_4.addMouseListener(MC_4);
		
		SA.panel_5.setPreferredSize(new Dimension(200, 200));
		SA.panel_5.setBackground(SA.tile_21.getBgColor());
		SA.panel_5.setBorder(new LineBorder(Color.GRAY, 5));
		MoveController MC_5 = new MoveController(SA.panel_5, SA.tile_21, this);
		SA.panel_5.addMouseListener(MC_5);
		
		SA.panel_6.setPreferredSize(new Dimension(200, 200));
		SA.panel_6.setBackground(SA.tile_02.getBgColor());
		SA.panel_6.setBorder(new LineBorder(Color.GRAY, 5));
		MoveController MC_6 = new MoveController(SA.panel_6, SA.tile_02, this);
		SA.panel_6.addMouseListener(MC_6);
		
		SA.panel_7.setPreferredSize(new Dimension(200, 200));
		SA.panel_7.setBackground(SA.tile_12.getBgColor());
		SA.panel_7.setBorder(new LineBorder(Color.GRAY, 5));
		MoveController MC_7 = new MoveController(SA.panel_7, SA.tile_12, this);
		SA.panel_7.addMouseListener(MC_7);
		
		SA.panel_8.setPreferredSize(new Dimension(200, 200));
		SA.panel_8.setBackground(SA.tile_22.getBgColor());
		SA.panel_8.setBorder(new LineBorder(Color.GRAY, 5));
		MoveController MC_8 = new MoveController(SA.panel_8, SA.tile_22, this);
		SA.panel_8.addMouseListener(MC_8);
				
		SA.label_0.setFont(new Font("Calibri", Font.BOLD, 90));
		SA.label_0.setForeground(SA.tile_00.getFgColor());
		SA.label_0.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panel_0 = new GroupLayout(SA.panel_0);
		gl_panel_0.setHorizontalGroup(
			gl_panel_0.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_0.createSequentialGroup()
					.addContainerGap()
					.addComponent(SA.label_0, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_0.setVerticalGroup(
			gl_panel_0.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_0.createSequentialGroup()
					.addContainerGap()
					.addComponent(SA.label_0, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
					.addContainerGap())
		);
		SA.panel_0.setLayout(gl_panel_0);
		
		SA.label_1.setFont(new Font("Calibri", Font.BOLD, 90));
		SA.label_1.setForeground(SA.tile_10.getFgColor());
		SA.label_1.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panel_1 = new GroupLayout(SA.panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(SA.label_1, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(SA.label_1, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
					.addContainerGap())
		);
		SA.panel_1.setLayout(gl_panel_1);
		
		SA.label_2.setFont(new Font("Calibri", Font.BOLD, 90));
		SA.label_2.setForeground(SA.tile_20.getFgColor());
		SA.label_2.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panel_2 = new GroupLayout(SA.panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(SA.label_2, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(SA.label_2, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
					.addContainerGap())
		);
		SA.panel_2.setLayout(gl_panel_2);
		
		SA.label_3.setFont(new Font("Calibri", Font.BOLD, 90));
		SA.label_3.setForeground(SA.tile_01.getFgColor());
		SA.label_3.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panel_3 = new GroupLayout(SA.panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addComponent(SA.label_3, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addComponent(SA.label_3, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
					.addContainerGap())
		);
		SA.panel_3.setLayout(gl_panel_3);
				
		SA.label_4.setFont(new Font("Calibri", Font.BOLD, 90));
		SA.label_4.setForeground(SA.tile_11.getFgColor());
		SA.label_4.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panel_4 = new GroupLayout(SA.panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addComponent(SA.label_4, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addComponent(SA.label_4, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
					.addContainerGap())
		);
		SA.panel_4.setLayout(gl_panel_4);
		
		SA.label_5.setFont(new Font("Calibri", Font.BOLD, 90));
		SA.label_5.setForeground(SA.tile_21.getFgColor());
		SA.label_5.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panel_5 = new GroupLayout(SA.panel_5);
		gl_panel_5.setHorizontalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addContainerGap()
					.addComponent(SA.label_5, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_5.setVerticalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addContainerGap()
					.addComponent(SA.label_5, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
					.addContainerGap())
		);
		SA.panel_5.setLayout(gl_panel_5);

		SA.label_6.setFont(new Font("Calibri", Font.BOLD, 90));
		SA.label_6.setForeground(SA.tile_02.getFgColor());
		SA.label_6.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panel_6 = new GroupLayout(SA.panel_6);
		gl_panel_6.setHorizontalGroup(
			gl_panel_6.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_6.createSequentialGroup()
					.addContainerGap()
					.addComponent(SA.label_6, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_6.setVerticalGroup(
			gl_panel_6.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_6.createSequentialGroup()
					.addContainerGap()
					.addComponent(SA.label_6, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
					.addContainerGap())
		);
		SA.panel_6.setLayout(gl_panel_6);
		
		SA.label_7.setFont(new Font("Calibri", Font.BOLD, 90));
		SA.label_7.setForeground(SA.tile_12.getFgColor());
		SA.label_7.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panel_7 = new GroupLayout(SA.panel_7);
		gl_panel_7.setHorizontalGroup(
			gl_panel_7.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_7.createSequentialGroup()
					.addContainerGap()
					.addComponent(SA.label_7, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_7.setVerticalGroup(
			gl_panel_7.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_7.createSequentialGroup()
					.addContainerGap()
					.addComponent(SA.label_7, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
					.addContainerGap())
		);
		SA.panel_7.setLayout(gl_panel_7);
		
		SA.label_8.setFont(new Font("Calibri", Font.BOLD, 90));
		SA.label_8.setForeground(SA.tile_22.getFgColor());
		SA.label_8.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panel_8 = new GroupLayout(SA.panel_8);
		gl_panel_8.setHorizontalGroup(
			gl_panel_8.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_8.createSequentialGroup()
					.addContainerGap()
					.addComponent(SA.label_8, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_8.setVerticalGroup(
			gl_panel_8.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_8.createSequentialGroup()
					.addContainerGap()
					.addComponent(SA.label_8, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
					.addContainerGap())
		);
		SA.panel_8.setLayout(gl_panel_8);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(moveCtr, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(SA.panel_6, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(SA.panel_3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(SA.panel_0, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(msgLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(SA.panel_7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(SA.panel_4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(SA.panel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btnReset, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(SA.panel_8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(SA.panel_5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(SA.panel_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(msgLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnReset, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
						.addComponent(moveCtr, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(SA.panel_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(SA.panel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(SA.panel_0, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(SA.panel_5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(SA.panel_4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(SA.panel_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(SA.panel_8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(SA.panel_7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(SA.panel_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(51))
		);
		
		contentPane.setLayout(gl_contentPane);
		
	}

}
