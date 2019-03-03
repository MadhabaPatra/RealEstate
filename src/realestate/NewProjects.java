/*
 * NewProjects.java
 *
 * Created on __DATE__, __TIME__
 */

package realestate;

import java.awt.Toolkit;

import javax.swing.JOptionPane;

/**
 *
 * @author  __USER__
 */
public class NewProjects extends javax.swing.JFrame {

	/** Creates new form NewProjects */
	String  dir = System.getProperty("user.dir") + "\\src\\mypack\\icons\\";
	public NewProjects() {
		super("...            UpComming Projects           ... ");
		initComponents();
	}

	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jSeparator1 = new javax.swing.JSeparator();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

		jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 24));
		jLabel1.setForeground(new java.awt.Color(0, 153, 0));
		jLabel1.setText("New Appartments");

		jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 1, 24));
		jLabel2.setForeground(new java.awt.Color(0, 153, 0));
		jLabel2.setText("New Lands");

		jLabel3
				.setIcon(new javax.swing.ImageIcon(
						dir+"upcoming2.jpg")); // NOI18N
		jLabel3.setToolTipText("Click to View Interior");
		jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jLabel3MouseClicked(evt);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				jLabel3MouseExited(evt);
			}
		});
		jLabel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
			public void mouseMoved(java.awt.event.MouseEvent evt) {
				jLabel3MouseMoved(evt);
			}
		});

		jLabel4
				.setIcon(new javax.swing.ImageIcon(
						dir+"upcom1.jpg")); // NOI18N
		jLabel4.setToolTipText("Click to View Interior");
		jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jLabel4MouseClicked(evt);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				jLabel4MouseExited(evt);
			}
		});
		jLabel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
			public void mouseMoved(java.awt.event.MouseEvent evt) {
				jLabel4MouseMoved(evt);
			}
		});

		jLabel5
				.setIcon(new javax.swing.ImageIcon(
						dir+"land1.gif")); // NOI18N
		jLabel5.setText(" ");

		jLabel6
				.setIcon(new javax.swing.ImageIcon(
						dir+"land2.jpg")); // NOI18N
		jLabel6.setText("jLabel6");

		jLabel7
				.setIcon(new javax.swing.ImageIcon(
						dir+"l1.jpg")); // NOI18N
		jLabel7.setText(" ");
		jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseExited(java.awt.event.MouseEvent evt) {
				jLabel7MouseExited(evt);
			}
		});
		jLabel7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
			public void mouseMoved(java.awt.event.MouseEvent evt) {
				jLabel7MouseMoved(evt);
			}
		});

		jButton1.setMnemonic('B');
		jButton1.setText("Book Now");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setMnemonic('T');
		jButton2.setText("Thanks");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout
				.setHorizontalGroup(layout
						.createParallelGroup(
								org.jdesktop.layout.GroupLayout.LEADING)
						.add(
								layout
										.createSequentialGroup()
										.add(
												layout
														.createParallelGroup(
																org.jdesktop.layout.GroupLayout.LEADING)
														.add(
																org.jdesktop.layout.GroupLayout.TRAILING,
																layout
																		.createSequentialGroup()
																		.addContainerGap()
																		.add(
																				jSeparator1,
																				org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
																				721,
																				Short.MAX_VALUE))
														.add(
																layout
																		.createSequentialGroup()
																		.addContainerGap()
																		.add(
																				layout
																						.createParallelGroup(
																								org.jdesktop.layout.GroupLayout.LEADING)
																						.add(
																								jLabel1,
																								org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																								186,
																								org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
																						.add(
																								jLabel3,
																								org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																								354,
																								org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
																		.addPreferredGap(
																				org.jdesktop.layout.LayoutStyle.RELATED)
																		.add(
																				jLabel4,
																				org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
																				360,
																				Short.MAX_VALUE))
														.add(
																layout
																		.createSequentialGroup()
																		.add(
																				layout
																						.createParallelGroup(
																								org.jdesktop.layout.GroupLayout.LEADING)
																						.add(
																								org.jdesktop.layout.GroupLayout.TRAILING,
																								layout
																										.createParallelGroup(
																												org.jdesktop.layout.GroupLayout.LEADING,
																												false)
																										.add(
																												layout
																														.createSequentialGroup()
																														.add(
																																12,
																																12,
																																12)
																														.add(
																																jLabel5,
																																0,
																																0,
																																Short.MAX_VALUE))
																										.add(
																												jLabel2,
																												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																												125,
																												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
																						.add(
																								org.jdesktop.layout.GroupLayout.TRAILING,
																								jButton1,
																								org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																								108,
																								org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
																		.add(
																				layout
																						.createParallelGroup(
																								org.jdesktop.layout.GroupLayout.LEADING)
																						.add(
																								layout
																										.createSequentialGroup()
																										.add(
																												29,
																												29,
																												29)
																										.add(
																												jLabel6,
																												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																												126,
																												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
																										.addPreferredGap(
																												org.jdesktop.layout.LayoutStyle.RELATED))
																						.add(
																								org.jdesktop.layout.GroupLayout.TRAILING,
																								layout
																										.createSequentialGroup()
																										.add(
																												47,
																												47,
																												47)
																										.add(
																												jButton2,
																												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																												85,
																												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
																										.add(
																												30,
																												30,
																												30)))
																		.add(
																				jLabel7,
																				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																				446,
																				Short.MAX_VALUE)))
										.addContainerGap()));
		layout
				.setVerticalGroup(layout
						.createParallelGroup(
								org.jdesktop.layout.GroupLayout.LEADING)
						.add(
								layout
										.createSequentialGroup()
										.addContainerGap()
										.add(
												layout
														.createParallelGroup(
																org.jdesktop.layout.GroupLayout.TRAILING)
														.add(
																layout
																		.createSequentialGroup()
																		.add(
																				jLabel1)
																		.addPreferredGap(
																				org.jdesktop.layout.LayoutStyle.RELATED)
																		.add(
																				jLabel3,
																				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																				249,
																				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				org.jdesktop.layout.LayoutStyle.RELATED))
														.add(
																jLabel4,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																276,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												org.jdesktop.layout.LayoutStyle.RELATED)
										.add(
												jSeparator1,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
												org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												org.jdesktop.layout.LayoutStyle.RELATED)
										.add(
												layout
														.createParallelGroup(
																org.jdesktop.layout.GroupLayout.LEADING)
														.add(
																layout
																		.createSequentialGroup()
																		.add(
																				jLabel2,
																				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																				38,
																				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				org.jdesktop.layout.LayoutStyle.RELATED)
																		.add(
																				layout
																						.createParallelGroup(
																								org.jdesktop.layout.GroupLayout.BASELINE)
																						.add(
																								jLabel5)
																						.add(
																								jLabel6))
																		.add(
																				32,
																				32,
																				32)
																		.add(
																				layout
																						.createParallelGroup(
																								org.jdesktop.layout.GroupLayout.LEADING,
																								false)
																						.add(
																								jButton1,
																								org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
																								org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.add(
																								jButton2,
																								org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
																								43,
																								Short.MAX_VALUE))
																		.addPreferredGap(
																				org.jdesktop.layout.LayoutStyle.RELATED,
																				54,
																				Short.MAX_VALUE))
														.add(
																jLabel7,
																org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
																268,
																Short.MAX_VALUE))
										.addContainerGap()));

		pack();
		mySetting();
	}// </editor-fold>
	                        

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		// exit code
		this.hide();
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		//booking button
		int rr2 = JOptionPane.showConfirmDialog(this, "Please Register Your Name\n and Login to Book the resources ",
				"Booking Information", 0, 1);
		this.hide();
		
	}

	private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {

		jLabel7
				.setIcon(new javax.swing.ImageIcon(
						dir+"l1.jpg"));
	}

	private void jLabel7MouseMoved(java.awt.event.MouseEvent evt) {

		jLabel7
				.setIcon(new javax.swing.ImageIcon(
						dir+"l2.jpg"));
	}

	private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {

		jLabel4
				.setIcon(new javax.swing.ImageIcon(
						dir+"upcom1.jpg"));
	}

	private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {

		jLabel4
				.setIcon(new javax.swing.ImageIcon(
						dir+"r2.jpg"));
	}

	private void jLabel4MouseMoved(java.awt.event.MouseEvent evt) {

		jLabel4
				.setIcon(new javax.swing.ImageIcon(
						dir+"r3.jpg"));
	}

	private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {

		jLabel3
				.setIcon(new javax.swing.ImageIcon(
						dir+"r2.jpg"));
	}

	private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {

		jLabel3
				.setIcon(new javax.swing.ImageIcon(
						dir+"upcoming2.jpg"));
	}

	private void jLabel3MouseMoved(java.awt.event.MouseEvent evt) {
		// change the photo code
		jLabel3
				.setIcon(new javax.swing.ImageIcon(
						dir+"r1.jpg"));
	}

	private void mySetting() {
		setLocation(
				(Toolkit.getDefaultToolkit().getScreenSize().width - getWidth()) / 2,
				(Toolkit.getDefaultToolkit().getScreenSize().height - getHeight()) / 2);
		setResizable(false);
		setVisible(true);
	}

	
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new NewProjects().setVisible(true);
			}
		});
	}
        

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JSeparator jSeparator1;
	// End of variables declaration//GEN-END:variables

}