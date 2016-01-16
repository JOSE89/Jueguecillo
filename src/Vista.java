import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Vista extends javax.swing.JFrame implements MouseListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	int arraynumImagenes[] = new int[12];
	JLabel arrayEtiquetaImagenes[] = new JLabel[12];
	int arrayControlRepeticiones[] = new int[6];
	int arrayControlParejas[] = new int[12];
	int arrayNumClicks[] = new int[12];

	int click = 0;
	int vista1;
	int vista2;
	int puntuacion = 0;

	private JLabel etiquetaTitulo;
	private JLabel etiquetaFooter;
	private JButton botonJugar;

	private JLabel etiquetaPuntuacion;
	private JLabel etiquetaPuntos;
	private javax.swing.JLabel EtiquetaImag1;
	private javax.swing.JLabel EtiquetaImag2;
	private javax.swing.JLabel EtiquetaImag3;
	private javax.swing.JLabel EtiquetaImag4;
	private javax.swing.JLabel EtiquetaImag5;
	private javax.swing.JLabel EtiquetaImag6;
	private javax.swing.JLabel EtiquetaImag7;
	private javax.swing.JLabel EtiquetaImag8;
	private javax.swing.JLabel EtiquetaImag12;
	private javax.swing.JLabel EtiquetaImag10;
	private javax.swing.JLabel EtiquetaImag11;
	private javax.swing.JLabel EtiquetaImag9;
	private javax.swing.JPanel panelImagenes;
	private javax.swing.JPanel panelSuperior;
	private javax.swing.JPanel panelInfo;
	private javax.swing.JPanel panelCentral;
	private javax.swing.JPanel panelFooter;

	public Vista() {

		incializartVista();
		inicializarEstructura();
		setSize(574, 517);
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

	}

	private void incializartVista() {
		// TODO Auto-generated method stub
		etiquetaTitulo = new JLabel();
		etiquetaTitulo.setFont(new java.awt.Font("Chiller", 0, 20));
		etiquetaTitulo.setText("Juego");
		etiquetaTitulo.addMouseListener(this);
		etiquetaTitulo.setVisible(true);

		etiquetaFooter = new JLabel();
		etiquetaFooter.setFont(new java.awt.Font("Chiller", 0, 20));
		etiquetaFooter.setText("By Jose Gomez");

		botonJugar = new JButton();
		botonJugar.setFont(new java.awt.Font("chiller", 0, 20));
		botonJugar.setText("REINICIAR");
		botonJugar.setBounds(10, 310, 230, 80);
		botonJugar.addMouseListener(this);

		etiquetaPuntuacion = new JLabel();
		etiquetaPuntuacion.setFont(new java.awt.Font("Chiller", 0, 48));
		etiquetaPuntuacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		etiquetaPuntuacion.setText("Puntuacion");
		etiquetaPuntuacion.setBounds(50, 0, 170, 120);

		etiquetaPuntos = new JLabel();
		etiquetaPuntos.setFont(new java.awt.Font("Chiller", 0, 48));
		etiquetaPuntuacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		etiquetaPuntos.setText("0");
		etiquetaPuntos.setBounds(40, 120, 170, 130);

		EtiquetaImag1 = new JLabel();
		EtiquetaImag1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/interrogante.jpg"))); // NOI18N
		EtiquetaImag1.setBounds(5, 0, 100, 100);

		EtiquetaImag2 = new JLabel();
		EtiquetaImag2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/interrogante.jpg"))); // NOI18N
		EtiquetaImag2.setBounds(113, 0, 100, 100);

		EtiquetaImag3 = new JLabel();
		EtiquetaImag3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/interrogante.jpg"))); // NOI18N
		EtiquetaImag3.setBounds(220, 0, 100, 100);

		EtiquetaImag4 = new JLabel();
		EtiquetaImag4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/interrogante.jpg"))); // NOI18N
		EtiquetaImag4.setBounds(5, 100, 100, 100);

		EtiquetaImag5 = new JLabel();
		EtiquetaImag5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/interrogante.jpg"))); // NOI18N
		EtiquetaImag5.setBounds(113, 100, 100, 100);

		EtiquetaImag6 = new JLabel();
		EtiquetaImag6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/interrogante.jpg"))); // NOI18N
		EtiquetaImag6.setBounds(220, 100, 100, 100);

		EtiquetaImag7 = new JLabel();
		EtiquetaImag7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/interrogante.jpg"))); // NOI18N
		EtiquetaImag7.setBounds(5, 200, 100, 100);

		EtiquetaImag8 = new JLabel();
		EtiquetaImag8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/interrogante.jpg"))); // NOI18N
		EtiquetaImag8.setBounds(113, 200, 100, 100);

		EtiquetaImag9 = new JLabel();
		EtiquetaImag9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/interrogante.jpg"))); // NOI18N
		EtiquetaImag9.setBounds(220, 200, 100, 100);

		EtiquetaImag10 = new JLabel();
		EtiquetaImag10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/interrogante.jpg"))); // NOI18N
		EtiquetaImag10.setBounds(5, 300, 100, 100);

		EtiquetaImag11 = new JLabel();
		EtiquetaImag11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/interrogante.jpg"))); // NOI18N
		EtiquetaImag11.setBounds(113, 300, 100, 100);

		EtiquetaImag12 = new JLabel();
		EtiquetaImag12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/interrogante.jpg"))); // NOI18N
		EtiquetaImag12.setBounds(220, 300, 100, 100);

		panelImagenes = new JPanel();
		panelImagenes.setBackground(new java.awt.Color(255, 200, 5));
		panelImagenes.setLayout(null);
		panelImagenes.setBounds(0, 0, 320, 455);
		panelImagenes.add(EtiquetaImag1);
		panelImagenes.add(EtiquetaImag2);
		panelImagenes.add(EtiquetaImag3);
		panelImagenes.add(EtiquetaImag4);
		panelImagenes.add(EtiquetaImag5);
		panelImagenes.add(EtiquetaImag6);
		panelImagenes.add(EtiquetaImag7);
		panelImagenes.add(EtiquetaImag8);
		panelImagenes.add(EtiquetaImag9);
		panelImagenes.add(EtiquetaImag10);
		panelImagenes.add(EtiquetaImag11);
		panelImagenes.add(EtiquetaImag12);

		panelSuperior = new JPanel();
		panelSuperior.setBackground(new java.awt.Color(204, 204, 0));
		panelSuperior.add(etiquetaTitulo);

		panelInfo = new JPanel();
		panelInfo.setBackground(new java.awt.Color(102, 153, 0));
		panelInfo.setLayout(null);
		panelInfo.setBounds(320, 0, 260, 420);
		panelInfo.add(botonJugar);
		panelInfo.add(etiquetaPuntuacion);
		panelInfo.add(etiquetaPuntos);

		panelCentral = new JPanel();
		panelCentral.setBackground(new java.awt.Color(102, 102, 0));
		panelCentral.setLayout(null);
		panelCentral.add(panelImagenes);
		panelCentral.add(panelInfo);

		panelFooter = new JPanel();
		panelFooter.setBackground(new java.awt.Color(204, 204, 0));
		FlowLayout miLayout = new FlowLayout(FlowLayout.RIGHT);
		panelFooter.setLayout(miLayout);
		panelFooter.add(etiquetaFooter);

		add(panelCentral, java.awt.BorderLayout.CENTER);
		add(panelFooter, java.awt.BorderLayout.PAGE_END);
		add(panelSuperior, java.awt.BorderLayout.PAGE_START);

		pack();

	}

	private void inicializarEstructura() {

		inicializarEstructuraImagenes();

		llenaEstructuraConCeros(arrayControlRepeticiones);
		llenaEstructuraConCeros(arraynumImagenes);
		llenaEstructuraConCeros(arrayControlParejas);
		llenaEstructuraConCeros(arrayNumClicks);

		Random r = new Random();

		int posimagen;

		for (int i = 0; i < 12; i++) {
			posimagen = r.nextInt(6);

			if (arrayControlRepeticiones[posimagen]<2) {
				arraynumImagenes[i] = posimagen + 1;
				System.out.print(arraynumImagenes[i]+ ",");
				arrayControlRepeticiones[posimagen]++;
			} else {
				i--;
			}
		}

	}

	private void llenaEstructuraConCeros(int[] estructura) {
		// TODO Auto-generated method stub
		for (int i = 0; i < estructura.length; i++) {
			estructura[i] = 0;
		}

	}

	private void validaParejas(int vista1, int vista2, int i) {

		if (arraynumImagenes[vista1]== arraynumImagenes[vista2]) {
			puntuacion += 10;
			etiquetaPuntos.setText(puntuacion + "");
			arrayControlParejas[vista1] = 1;
			arrayControlParejas[vista2] = 1;

		} else {
			arrayEtiquetaImagenes[vista1].setIcon(new ImageIcon(getClass().getResource("/Imagenes/interrogante.jpg")));
			arrayEtiquetaImagenes[vista2].setIcon(new ImageIcon(getClass().getResource("/Imagenes/interrogante.jpg")));
			arrayNumClicks[vista1] = 0;
			arrayNumClicks[vista2] = 0;
		}

	}

	private void inicializarEstructuraImagenes() {
		System.out.println("llegamos");
		arrayEtiquetaImagenes[0] = EtiquetaImag1;
		arrayEtiquetaImagenes[1] = EtiquetaImag2;
		arrayEtiquetaImagenes[2] = EtiquetaImag3;
		arrayEtiquetaImagenes[3] = EtiquetaImag4;
		arrayEtiquetaImagenes[4] = EtiquetaImag5;
		arrayEtiquetaImagenes[5] = EtiquetaImag6;
		arrayEtiquetaImagenes[6] = EtiquetaImag7;
		arrayEtiquetaImagenes[7] = EtiquetaImag8;
		arrayEtiquetaImagenes[8] = EtiquetaImag9;
		arrayEtiquetaImagenes[9] = EtiquetaImag10;
		arrayEtiquetaImagenes[10] = EtiquetaImag11;
		arrayEtiquetaImagenes[11] = EtiquetaImag12;

		for (int i = 0; i <= 11; i++) {
			arrayEtiquetaImagenes[i].setIcon(new ImageIcon(getClass().getResource("/Imagenes/interrogante.jpg")));
			arrayEtiquetaImagenes[i].addMouseListener(this);
		}

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource() == botonJugar) {
			inicializarEstructura();
			click = 0;
			puntuacion = 0;
			etiquetaPuntos.setText("0");
		}

		for (int i = 0; i < 12; i++) {

			if (e.getSource() == arrayEtiquetaImagenes[i] && verificaParejasEncontradas(i)) {
				arrayNumClicks[i]++;
				if (arrayNumClicks[i] < 2) {
					click++;
					arrayEtiquetaImagenes[i].setIcon(new ImageIcon(getClass().getResource("/Imagenes/" + arraynumImagenes[i] +".jpg")));
					if (click == 1) {
						vista1 = i;
					} else {
						vista2 = i;
					}
				}
			}

		}
	}

	private boolean verificaParejasEncontradas(int i) {
		// TODO Auto-generated method stub
		if (arrayControlParejas[i]!= 1) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 12; i++) {
			if (e.getSource()==arrayEtiquetaImagenes[i]) {
				if (click==2) {
					validaParejas(vista1,vista2,i);
					click=0;
				}				
			}
		}

	}

}
