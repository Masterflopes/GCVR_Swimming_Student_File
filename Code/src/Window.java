import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.table.TableColumn;
import javax.swing.JTextPane;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JToggleButton;

public class Window {

	private JFrame frame;
	AlunosFileReader alunos;
	int indice_aluno_atual;
	JLabel labelDate;
	JComboBox comboBox;
	JCheckBox checkBox0;
	JCheckBox checkBox1;
	JCheckBox checkBox2;
	JCheckBox checkBox3;
	JCheckBox checkBox4;
	JCheckBox checkBox5;
	JCheckBox checkBox6;
	JCheckBox checkBox7;
	JCheckBox checkBox8;
	JCheckBox checkBox9;
	JCheckBox checkBox10;
	JCheckBox checkBox11;
	JCheckBox checkBox12;
	JCheckBox checkBox13;
	JCheckBox checkBox14;
	JCheckBox checkBox15;
	JCheckBox checkBox16;
	JCheckBox checkBox17;
	JCheckBox checkBox18;
	JCheckBox checkBox19;
	JCheckBox checkBox20;
	JCheckBox checkBox21;
	JCheckBox checkBox22;
	JCheckBox checkBox23;
	JCheckBox checkBox24;
	JCheckBox checkBox25;
	JCheckBox checkBox26;
	JCheckBox checkBox27;
	JCheckBox checkBox28;
	JCheckBox checkBox29;
	JCheckBox checkBox30;
	JCheckBox checkBox31;
	JCheckBox checkBox32;
	JCheckBox checkBox33;
	JCheckBox checkBox34;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window window = new Window();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		alunos = new AlunosFileReader();
		
		frame = new JFrame();
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setBounds(0, 0,screen.width,screen.height);
		frame.setExtendedState(frame.MAXIMIZED_BOTH);
		//frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		String[] options = new String[alunos.getAlunos().size() + 1];
		options[0] = "";
		for(int i = 0; i < alunos.getAlunos().size(); i++) {
			options[i + 1] = alunos.getAlunos().get(i).getName();
		}
		comboBox = new JComboBox(options);
		comboBox.setBounds(73, 12, 463, 27);
		frame.getContentPane().add(comboBox);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				update();
			}
		});
		
		JLabel lblNome = new JLabel("Nome: ");
		lblNome.setBounds(18, 17, 61, 16);
		frame.getContentPane().add(lblNome);
		
		JLabel lblDataDeNascimento = new JLabel("Data de nascimento:");
		lblDataDeNascimento.setBounds(18, 44, 138, 16);
		frame.getContentPane().add(lblDataDeNascimento);
		
		JLabel lblPinguins = new JLabel("PINGUINS");
		lblPinguins.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblPinguins.setBounds(187, 100, 97, 25);
		frame.getContentPane().add(lblPinguins);
		
		JLabel lblTartarugas = new JLabel("TARTARUGAS");
		lblTartarugas.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblTartarugas.setBounds(607, 100, 142, 25);
		frame.getContentPane().add(lblTartarugas);
		
		JLabel lblGolfinhos = new JLabel("GOLFINHOS");
		lblGolfinhos.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblGolfinhos.setBounds(1060, 100, 119, 25);
		frame.getContentPane().add(lblGolfinhos);
		
		JLabel lblNewLabel = new JLabel("1. Ciclos Respiratórios (insp./exp).");
		lblNewLabel.setBounds(33, 180, 219, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.DARK_GRAY);
		separator.setBounds(33, 168, 406, 16);
		frame.getContentPane().add(separator);
		
		JLabel lblObjetivos = new JLabel("Objetivos");
		lblObjetivos.setFont(new Font("Arial Black", lblObjetivos.getFont().getStyle() | Font.BOLD, 15));
		lblObjetivos.setBounds(33, 146, 77, 22);
		frame.getContentPane().add(lblObjetivos);
		
		JLabel lblNewLabel_1 = new JLabel("2. Imersão em diferentes planos e distâncias.");
		lblNewLabel_1.setBounds(33, 206, 285, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("3. Passar da posição frontal à posição dorsal e vice-versa.");
		lblNewLabel_2.setToolTipText("");
		lblNewLabel_2.setBounds(33, 232, 366, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("4. Deslize e Flutuação dorsal");
		lblNewLabel_3.setBounds(33, 258, 181, 16);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblDeslizeE = new JLabel("5.\tDeslize e Flutuação ventral");
		lblDeslizeE.setBounds(33, 284, 185, 16);
		frame.getContentPane().add(lblDeslizeE);
		
		JLabel lblPernadaDe = new JLabel("6.\tPernada de crol sem placa");
		lblPernadaDe.setBounds(33, 310, 179, 16);
		frame.getContentPane().add(lblPernadaDe);
		
		JLabel lblPernadaDe_1 = new JLabel("7.\tPernada de costas sem placa");
		lblPernadaDe_1.setBounds(33, 336, 196, 16);
		frame.getContentPane().add(lblPernadaDe_1);
		
		JLabel lblRotaesSobre = new JLabel("8.\tRotações sobre o eixo longitudinal e transversal");
		lblRotaesSobre.setBounds(33, 362, 319, 16);
		frame.getContentPane().add(lblRotaesSobre);
		
		JLabel lblIntroduo = new JLabel("9.\tIntrodução à respiração lateral");
		lblIntroduo.setBounds(33, 388, 207, 16);
		frame.getContentPane().add(lblIntroduo);
		
		JLabel lblSobrevivnciaAqutica = new JLabel("● Sobrevivência aquática- deslocar-se 15m com t-shirt");
		lblSobrevivnciaAqutica.setBounds(33, 416, 351, 16);
		frame.getContentPane().add(lblSobrevivnciaAqutica);
		
		JLabel lblAvaliao = new JLabel("Avaliação");
		lblAvaliao.setFont(new Font("Arial Black", lblAvaliao.getFont().getStyle() | Font.BOLD, 15));
		lblAvaliao.setBounds(33, 460, 81, 22);
		frame.getContentPane().add(lblAvaliao);
		
		JLabel lblDeslocaseDurante = new JLabel("● Desloca-se durante 15m na posição ventral, sem");
		lblDeslocaseDurante.setBounds(33, 494, 325, 16);
		frame.getContentPane().add(lblDeslocaseDurante);
		
		JLabel lblNewLabel_4 = new JLabel("apoios, e realiza os ciclos respiratórios.");
		lblNewLabel_4.setBounds(48, 510, 250, 16);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("● Desloca-se durante 15m na posição dorsal sem apoio.");
		lblNewLabel_5.setBounds(33, 536, 356, 16);
		frame.getContentPane().add(lblNewLabel_5);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.DARK_GRAY);
		separator_2.setBounds(33, 482, 406, 16);
		frame.getContentPane().add(separator_2);
		
		checkBox0 = new JCheckBox("");
		checkBox0.setBounds(411, 175, 28, 23);
		frame.getContentPane().add(checkBox0);
		checkBox0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				get_ticks();
			}
		});
		
		checkBox1 = new JCheckBox("");
		checkBox1.setBounds(411, 227, 28, 23);
		frame.getContentPane().add(checkBox1);
		checkBox1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				get_ticks();
			}
		});
		
		checkBox2 = new JCheckBox("");
		checkBox2.setBounds(411, 201, 28, 23);
		frame.getContentPane().add(checkBox2);
		checkBox2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				get_ticks();
			}
		});
		
		checkBox3 = new JCheckBox("");
		checkBox3.setBounds(411, 253, 28, 23);
		frame.getContentPane().add(checkBox3);
		checkBox3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				get_ticks();
			}
		});
		
		checkBox4 = new JCheckBox("");
		checkBox4.setBounds(411, 279, 28, 23);
		frame.getContentPane().add(checkBox4);
		checkBox4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				get_ticks();
			}
		});
		
		checkBox5 = new JCheckBox("");
		checkBox5.setBounds(411, 305, 28, 23);
		frame.getContentPane().add(checkBox5);
		checkBox5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				get_ticks();
			}
		});
		
		checkBox6 = new JCheckBox("");
		checkBox6.setBounds(411, 331, 28, 23);
		frame.getContentPane().add(checkBox6);
		checkBox6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				get_ticks();
			}
		});
		
		checkBox7 = new JCheckBox("");
		checkBox7.setBounds(411, 357, 28, 23);
		frame.getContentPane().add(checkBox7);
		checkBox7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				get_ticks();
			}
		});
		
		checkBox8 = new JCheckBox("");
		checkBox8.setBounds(411, 383, 28, 23);
		frame.getContentPane().add(checkBox8);
		checkBox8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				get_ticks();
			}
		});
		
		checkBox9 = new JCheckBox("");
		checkBox9.setBounds(411, 411, 28, 23);
		frame.getContentPane().add(checkBox9);
		checkBox9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				get_ticks();
			}
		});
		
		checkBox10 = new JCheckBox("");
		checkBox10.setBounds(411, 494, 28, 23);
		frame.getContentPane().add(checkBox10);
		checkBox10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				get_ticks();
			}
		});
		
		checkBox11 = new JCheckBox("");
		checkBox11.setBounds(411, 531, 28, 23);
		frame.getContentPane().add(checkBox11);
		checkBox11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				get_ticks();
			}
		});
		
		checkBox12 = new JCheckBox("");
		checkBox12.setBounds(853, 175, 28, 23);
		frame.getContentPane().add(checkBox12);
		checkBox12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				get_ticks();
			}
		});
		
		checkBox13 = new JCheckBox("");
		checkBox13.setBounds(853, 217, 28, 23);
		frame.getContentPane().add(checkBox13);
		checkBox13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				get_ticks();
			}
		});
		
		checkBox14 = new JCheckBox("");
		checkBox14.setBounds(853, 243, 28, 23);
		frame.getContentPane().add(checkBox14);
		checkBox14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				get_ticks();
			}
		});
		
		checkBox15 = new JCheckBox("");
		checkBox15.setBounds(853, 285, 28, 23);
		frame.getContentPane().add(checkBox15);
		checkBox15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				get_ticks();
			}
		});
		
		checkBox16 = new JCheckBox("");
		checkBox16.setBounds(854, 327, 28, 23);
		frame.getContentPane().add(checkBox16);
		checkBox16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				get_ticks();
			}
		});
		
		checkBox17 = new JCheckBox("");
		checkBox17.setBounds(853, 369, 28, 23);
		frame.getContentPane().add(checkBox17);
		checkBox17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				get_ticks();
			}
		});
		
		checkBox18 = new JCheckBox("");
		checkBox18.setBounds(853, 395, 28, 23);
		frame.getContentPane().add(checkBox18);
		checkBox18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				get_ticks();
			}
		});
		
		checkBox19 = new JCheckBox("");
		checkBox19.setBounds(853, 421, 28, 23);
		frame.getContentPane().add(checkBox19);
		checkBox19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				get_ticks();
			}
		});
		
		checkBox20 = new JCheckBox("");
		checkBox20.setBounds(853, 463, 28, 23);
		frame.getContentPane().add(checkBox20);
		checkBox20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				get_ticks();
			}
		});
		
		checkBox21 = new JCheckBox("");
		checkBox21.setBounds(853, 521, 28, 23);
		frame.getContentPane().add(checkBox21);
		checkBox21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				get_ticks();
			}
		});
		
		checkBox22 = new JCheckBox("");
		checkBox22.setBounds(853, 579, 28, 23);
		frame.getContentPane().add(checkBox22);
		checkBox22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				get_ticks();
			}
		});
		
		checkBox23 = new JCheckBox("");
		checkBox23.setBounds(853, 674, 28, 23);
		frame.getContentPane().add(checkBox23);
		checkBox23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				get_ticks();
			}
		});
		
		checkBox24 = new JCheckBox("");
		checkBox24.setBounds(853, 716, 28, 23);
		frame.getContentPane().add(checkBox24);
		checkBox24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				get_ticks();
			}
		});
		
		checkBox25 = new JCheckBox("");
		checkBox25.setBounds(1295, 175, 28, 23);
		frame.getContentPane().add(checkBox25);
		checkBox25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				get_ticks();
			}
		});
		
		checkBox26 = new JCheckBox("");
		checkBox26.setBounds(1295, 217, 28, 23);
		frame.getContentPane().add(checkBox26);
		checkBox26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				get_ticks();
			}
		});
		
		checkBox27 = new JCheckBox("");
		checkBox27.setBounds(1295, 243, 28, 23);
		frame.getContentPane().add(checkBox27);
		checkBox27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				get_ticks();
			}
		});
		
		checkBox28 = new JCheckBox("");
		checkBox28.setBounds(1295, 269, 28, 23);
		frame.getContentPane().add(checkBox28);
		checkBox28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				get_ticks();
			}
		});
		
		checkBox29 = new JCheckBox("");
		checkBox29.setBounds(1295, 295, 28, 23);
		frame.getContentPane().add(checkBox29);
		checkBox29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				get_ticks();
			}
		});
		
		checkBox30 = new JCheckBox("");
		checkBox30.setBounds(1295, 321, 28, 23);
		frame.getContentPane().add(checkBox30);
		checkBox30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				get_ticks();
			}
		});
		
		checkBox31 = new JCheckBox("");
		checkBox31.setBounds(1295, 347, 28, 23);
		frame.getContentPane().add(checkBox31);
		checkBox31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				get_ticks();
			}
		});
		
		checkBox32 = new JCheckBox("");
		checkBox32.setBounds(1295, 373, 28, 23);
		frame.getContentPane().add(checkBox32);
		checkBox32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				get_ticks();
			}
		});
		
		checkBox33 = new JCheckBox("");
		checkBox33.setBounds(1295, 415, 28, 23);
		frame.getContentPane().add(checkBox33);
		checkBox33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				get_ticks();
			}
		});
		
		checkBox34 = new JCheckBox("");
		checkBox34.setBounds(1295, 494, 28, 23);
		frame.getContentPane().add(checkBox34);
		checkBox34.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				get_ticks();
			}
		});
		
		JLabel lblBatimentoDe = new JLabel("1.\tBatimento de pernas crol e costas com posição");
		lblBatimentoDe.setBounds(475, 180, 312, 16);
		frame.getContentPane().add(lblBatimentoDe);
		
		JLabel lblPernadaDe_2 = new JLabel("2.\tPernada de crol com posição lateral");
		lblPernadaDe_2.setBounds(475, 222, 239, 16);
		frame.getContentPane().add(lblPernadaDe_2);
		
		JLabel lblBraosDe = new JLabel("3.\tBraços de costas com paragem das mãos (juntos às\n");
		lblBraosDe.setBounds(475, 248, 344, 16);
		frame.getContentPane().add(lblBraosDe);
		
		JLabel lblBraosDe_1 = new JLabel("4.\tBraços de crol com paragem das mãos à frente e");
		lblBraosDe_1.setBounds(475, 290, 320, 16);
		frame.getContentPane().add(lblBraosDe_1);
		
		JLabel lblBraosDe_2 = new JLabel("5.\tBraços de crol sem paragem das mãos e com respiração");
		lblBraosDe_2.setBounds(475, 332, 367, 16);
		frame.getContentPane().add(lblBraosDe_2);
		
		JLabel lblIntroduo_1 = new JLabel("6.\tIntrodução à pernada de bruços");
		lblIntroduo_1.setBounds(475, 374, 215, 16);
		frame.getContentPane().add(lblIntroduo_1);
		
		JLabel lblIntroduo_2 = new JLabel("7.\tIntrodução à ondulação do corpo");
		lblIntroduo_2.setBounds(475, 400, 224, 16);
		frame.getContentPane().add(lblIntroduo_2);
		
		JLabel lblSaltoDe = new JLabel("8.\tSalto de cabeça e rotação sobre os diferentes eixos");
		lblSaltoDe.setBounds(475, 426, 338, 16);
		frame.getContentPane().add(lblSaltoDe);
		
		JLabel lblmCostas = new JLabel("9.\t25m costas (posição do corpo, ação de pernas, ação de");
		lblmCostas.setBounds(475, 468, 364, 16);
		frame.getContentPane().add(lblmCostas);
		
		JLabel lblmCrol = new JLabel("10.\t15m crol (posição do corpo, ação de pernas, ação de");
		lblmCrol.setBounds(475, 526, 355, 16);
		frame.getContentPane().add(lblmCrol);
		
		JLabel lblSobrevivnciaAqutica_1 = new JLabel("● Sobrevivência aquática- nadar 25m com t-shirt e calções");
		lblSobrevivnciaAqutica_1.setBounds(475, 584, 373, 16);
		frame.getContentPane().add(lblSobrevivnciaAqutica_1);
		
		JLabel label = new JLabel("Objetivos");
		label.setFont(new Font("Arial Black", label.getFont().getStyle() | Font.BOLD, 15));
		label.setBounds(475, 146, 77, 22);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Objetivos");
		label_1.setFont(new Font("Arial Black", label_1.getFont().getStyle() | Font.BOLD, 15));
		label_1.setBounds(917, 146, 77, 22);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Avaliação");
		label_2.setFont(new Font("Arial Black", label_2.getFont().getStyle() | Font.BOLD, 15));
		label_2.setBounds(475, 644, 81, 22);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("Avaliação");
		label_3.setFont(new Font("Arial Black", label_3.getFont().getStyle(), 15));
		label_3.setBounds(917, 464, 81, 22);
		frame.getContentPane().add(label_3);
		
		JLabel lblNadam = new JLabel("● Nada 25m costas, com saída de costas, em posição de");
		lblNadam.setBounds(475, 678, 356, 16);
		frame.getContentPane().add(lblNadam);
		
		JLabel lblNewLabel_6 = new JLabel("● 25m crol (15m completo + 10m com movimentos");
		lblNewLabel_6.setBounds(475, 720, 326, 16);
		frame.getContentPane().add(lblNewLabel_6);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.DARK_GRAY);
		separator_1.setBounds(475, 168, 406, 16);
		frame.getContentPane().add(separator_1);
		
		JLabel lblHidrodinmicaDoCorpo = new JLabel("hidrodinâmica do corpo");
		lblHidrodinmicaDoCorpo.setBounds(492, 196, 150, 16);
		frame.getContentPane().add(lblHidrodinmicaDoCorpo);
		
		JLabel lblCoxasENo = new JLabel("coxas e no prolongamento do corpo)");
		lblCoxasENo.setBounds(492, 264, 232, 16);
		frame.getContentPane().add(lblCoxasENo);
		
		JLabel lblRespiraoLateral = new JLabel("respiração lateral");
		lblRespiraoLateral.setBounds(492, 306, 108, 16);
		frame.getContentPane().add(lblRespiraoLateral);
		
		JLabel lblLateral = new JLabel("lateral");
		lblLateral.setBounds(492, 348, 39, 16);
		frame.getContentPane().add(lblLateral);
		
		JLabel lblexercciosCombinados = new JLabel("(exercícios combinados)");
		lblexercciosCombinados.setBounds(492, 442, 153, 16);
		frame.getContentPane().add(lblexercciosCombinados);
		
		JLabel lblBraosFasePropulsiva = new JLabel("braços, fase propulsiva e não propulsiva, respiração e");
		lblBraosFasePropulsiva.setBounds(492, 484, 426, 16);
		frame.getContentPane().add(lblBraosFasePropulsiva);
		
		JLabel lblCoordenao = new JLabel("coordenação)");
		lblCoordenao.setBounds(492, 500, 84, 16);
		frame.getContentPane().add(lblCoordenao);
		
		JLabel lblBraosFasePropulsiva_1 = new JLabel("braços, fase propulsiva e não propulsiva, respiração e");
		lblBraosFasePropulsiva_1.setBounds(492, 542, 426, 16);
		frame.getContentPane().add(lblBraosFasePropulsiva_1);
		
		JLabel lblCoordenao_1 = new JLabel("coordenação)");
		lblCoordenao_1.setBounds(492, 558, 84, 16);
		frame.getContentPane().add(lblCoordenao_1);
		
		JLabel lblNewLabel_7 = new JLabel("de desporto.");
		lblNewLabel_7.setBounds(492, 600, 79, 16);
		frame.getContentPane().add(lblNewLabel_7);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(Color.DARK_GRAY);
		separator_3.setBounds(475, 666, 406, 16);
		frame.getContentPane().add(separator_3);
		
		JLabel lblEquilbrioECom = new JLabel("equilíbrio e com ações bem definidas de braços e pernas.");
		lblEquilbrioECom.setBounds(492, 694, 361, 16);
		frame.getContentPane().add(lblEquilbrioECom);
		
		JLabel lblAlternadosDeBraos = new JLabel("alternados de braços), com salto de cabeça e ações bem");
		lblAlternadosDeBraos.setBounds(492, 736, 670, 16);
		frame.getContentPane().add(lblAlternadosDeBraos);
		
		JLabel lblDefinidasDePernas = new JLabel("definidas de pernas, braços e ciclos respiratórios.");
		lblDefinidasDePernas.setBounds(492, 752, 313, 16);
		frame.getContentPane().add(lblDefinidasDePernas);
		
		labelDate = new JLabel("");
		labelDate.setBounds(168, 44, 116, 16);
		frame.getContentPane().add(labelDate);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setForeground(Color.DARK_GRAY);
		separator_4.setBounds(917, 168, 406, 16);
		frame.getContentPane().add(separator_4);
		
		JLabel lblRevisoDe = new JLabel("1.\tRevisão de módulos anteriores: pernada de costas com");
		lblRevisoDe.setBounds(917, 180, 362, 16);
		frame.getContentPane().add(lblRevisoDe);
		
		JLabel lblmCostas_1 = new JLabel("2.\t50m costas com braços alternados");
		lblmCostas_1.setBounds(917, 222, 236, 16);
		frame.getContentPane().add(lblmCostas_1);
		
		JLabel lblmCrol_1 = new JLabel("3.\t25m crol com respiração bilateral");
		lblmCrol_1.setBounds(917, 248, 227, 16);
		frame.getContentPane().add(lblmCrol_1);
		
		JLabel lblCoordenaoDe = new JLabel("4.\tCoordenação de crol, braços alternados");
		lblCoordenaoDe.setBounds(917, 274, 265, 16);
		frame.getContentPane().add(lblCoordenaoDe);
		
		JLabel lblSadaDe = new JLabel("5.\tSaída de crol e costas");
		lblSadaDe.setBounds(917, 300, 152, 16);
		frame.getContentPane().add(lblSadaDe);
		
		JLabel lblViragensDe = new JLabel("6.\tViragens de crol e costas");
		lblViragensDe.setBounds(917, 326, 173, 16);
		frame.getContentPane().add(lblViragensDe);
		
		JLabel lblPernadaDe_3 = new JLabel("7.\tPernada de bruços");
		lblPernadaDe_3.setBounds(917, 352, 131, 16);
		frame.getContentPane().add(lblPernadaDe_3);
		
		JLabel lblmBruos = new JLabel("8.\t25m bruços (posição do corpo, ação de pernas, ação de");
		lblmBruos.setBounds(917, 378, 366, 16);
		frame.getContentPane().add(lblmBruos);
		
		JLabel lblSobrevivenciaAqutica = new JLabel("● Sobrevivencia aquática- nadar 25m com fato de treino.");
		lblSobrevivenciaAqutica.setBounds(917, 420, 358, 16);
		frame.getContentPane().add(lblSobrevivenciaAqutica);
		
		JLabel lblNewLabel_8 = new JLabel("● Nada 100m estilos (mariposa 15m completo + 10m nado");
		lblNewLabel_8.setBounds(917, 498, 372, 16);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblRotaoDoTronco = new JLabel("rotação do tronco; pernada de crol com respiração lateral.");
		lblRotaoDoTronco.setBounds(934, 196, 364, 16);
		frame.getContentPane().add(lblRotaoDoTronco);
		
		JLabel lblBraosFasePropulsiva_2 = new JLabel("braços, fase propulsiva, respiração e coordenação).");
		lblBraosFasePropulsiva_2.setBounds(934, 394, 322, 16);
		frame.getContentPane().add(lblBraosFasePropulsiva_2);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setForeground(Color.DARK_GRAY);
		separator_5.setBounds(917, 486, 406, 16);
		frame.getContentPane().add(separator_5);
		
		JLabel lblAlternadoComPartida = new JLabel("alternado), com partida e viragens, de acordo com as");
		lblAlternadoComPartida.setBounds(932, 514, 333, 16);
		frame.getContentPane().add(lblAlternadoComPartida);
		
		JLabel lblRegras = new JLabel("regras.");
		lblRegras.setBounds(932, 530, 43, 16);
		frame.getContentPane().add(lblRegras);
	}
	
	private void update() {
		indice_aluno_atual = -1;
		String name = (String)comboBox.getSelectedItem();
		for(int i = 0; i < alunos.getAlunos().size(); i++) {
			if(alunos.getAlunos().get(i).getName().equals(name)) {
				indice_aluno_atual = i;
			}
		}
		if(indice_aluno_atual == -1) {
			labelDate.setText("");
			boolean[] array = new boolean[35];
			Arrays.fill(array, Boolean.FALSE);
			update_ticks(array);
		}
		else {
			labelDate.setText(alunos.getAlunos().get(indice_aluno_atual).getDate());
			update_ticks(alunos.getAlunos().get(indice_aluno_atual).getTicks());
		}
	}
	
	private void get_ticks() {
		boolean[] array = new boolean[35];
		array[0] = checkBox0.isSelected();
		array[1] = checkBox1.isSelected();
		array[2] = checkBox2.isSelected();
		array[3] = checkBox3.isSelected();
		array[4] = checkBox4.isSelected();
		array[5] = checkBox5.isSelected();
		array[6] = checkBox6.isSelected();
		array[7] = checkBox7.isSelected();
		array[8] = checkBox8.isSelected();
		array[9] = checkBox9.isSelected();
		array[10] = checkBox10.isSelected();
		array[11] = checkBox11.isSelected();
		array[12] = checkBox12.isSelected();
		array[13] = checkBox13.isSelected();
		array[14] = checkBox14.isSelected();
		array[15] = checkBox15.isSelected();
		array[16] = checkBox16.isSelected();
		array[17] = checkBox17.isSelected();
		array[18] = checkBox18.isSelected();
		array[19] = checkBox19.isSelected();
		array[20] = checkBox20.isSelected();
		array[21] = checkBox21.isSelected();
		array[22] = checkBox22.isSelected();
		array[23] = checkBox23.isSelected();
		array[24] = checkBox24.isSelected();
		array[25] = checkBox25.isSelected();
		array[26] = checkBox26.isSelected();
		array[27] = checkBox27.isSelected();
		array[28] = checkBox28.isSelected();
		array[29] = checkBox29.isSelected();
		array[30] = checkBox30.isSelected();
		array[31] = checkBox31.isSelected();
		array[32] = checkBox32.isSelected();
		array[33] = checkBox33.isSelected();
		array[34] = checkBox34.isSelected();
		
		
		ArrayList<Alunos> alunosnew = alunos.getAlunos();
		alunosnew.get(indice_aluno_atual).setTicks(array);
		alunos.setAlunos(alunosnew);
		alunos.save_file();
	}
	
	private void update_ticks(boolean[] ticks) {
		if(ticks[0] == false) {
			checkBox0.setSelected(false);
		}
		else {
			checkBox0.setSelected(true);
		}
		if(ticks[1] == false) {
			checkBox1.setSelected(false);
		}
		else {
			checkBox1.setSelected(true);
		}
		if(ticks[2] == false) {
			checkBox2.setSelected(false);
		}
		else {
			checkBox2.setSelected(true);
		}
		if(ticks[3] == false) {
			checkBox3.setSelected(false);
		}
		else {
			checkBox3.setSelected(true);
		}
		if(ticks[4] == false) {
			checkBox4.setSelected(false);
		}
		else {
			checkBox4.setSelected(true);
		}
		if(ticks[5] == false) {
			checkBox5.setSelected(false);
		}
		else {
			checkBox5.setSelected(true);
		}
		if(ticks[6] == false) {
			checkBox6.setSelected(false);
		}
		else {
			checkBox6.setSelected(true);
		}
		if(ticks[7] == false) {
			checkBox7.setSelected(false);
		}
		else {
			checkBox7.setSelected(true);
		}
		if(ticks[8] == false) {
			checkBox8.setSelected(false);
		}
		else {
			checkBox8.setSelected(true);
		}
		if(ticks[9] == false) {
			checkBox9.setSelected(false);
		}
		else {
			checkBox9.setSelected(true);
		}
		if(ticks[10] == false) {
			checkBox10.setSelected(false);
		}
		else {
			checkBox10.setSelected(true);
		}
		if(ticks[11] == false) {
			checkBox11.setSelected(false);
		}
		else {
			checkBox11.setSelected(true);
		}
		if(ticks[12] == false) {
			checkBox12.setSelected(false);
		}
		else {
			checkBox12.setSelected(true);
		}
		if(ticks[13] == false) {
			checkBox13.setSelected(false);
		}
		else {
			checkBox13.setSelected(true);
		}
		if(ticks[14] == false) {
			checkBox14.setSelected(false);
		}
		else {
			checkBox14.setSelected(true);
		}
		if(ticks[15] == false) {
			checkBox15.setSelected(false);
		}
		else {
			checkBox15.setSelected(true);
		}
		if(ticks[16] == false) {
			checkBox16.setSelected(false);
		}
		else {
			checkBox16.setSelected(true);
		}
		if(ticks[17] == false) {
			checkBox17.setSelected(false);
		}
		else {
			checkBox17.setSelected(true);
		}
		if(ticks[18] == false) {
			checkBox18.setSelected(false);
		}
		else {
			checkBox18.setSelected(true);
		}
		if(ticks[19] == false) {
			checkBox19.setSelected(false);
		}
		else {
			checkBox19.setSelected(true);
		}
		if(ticks[20] == false) {
			checkBox20.setSelected(false);
		}
		else {
			checkBox20.setSelected(true);
		}
		if(ticks[21] == false) {
			checkBox21.setSelected(false);
		}
		else {
			checkBox21.setSelected(true);
		}
		if(ticks[22] == false) {
			checkBox22.setSelected(false);
		}
		else {
			checkBox22.setSelected(true);
		}
		if(ticks[23] == false) {
			checkBox23.setSelected(false);
		}
		else {
			checkBox23.setSelected(true);
		}
		if(ticks[24] == false) {
			checkBox24.setSelected(false);
		}
		else {
			checkBox24.setSelected(true);
		}
		if(ticks[25] == false) {
			checkBox25.setSelected(false);
		}
		else {
			checkBox25.setSelected(true);
		}
		if(ticks[26] == false) {
			checkBox26.setSelected(false);
		}
		else {
			checkBox26.setSelected(true);
		}
		if(ticks[27] == false) {
			checkBox27.setSelected(false);
		}
		else {
			checkBox27.setSelected(true);
		}
		if(ticks[28] == false) {
			checkBox28.setSelected(false);
		}
		else {
			checkBox28.setSelected(true);
		}
		if(ticks[29] == false) {
			checkBox29.setSelected(false);
		}
		else {
			checkBox29.setSelected(true);
		}
		if(ticks[30] == false) {
			checkBox30.setSelected(false);
		}
		else {
			checkBox30.setSelected(true);
		}
		if(ticks[31] == false) {
			checkBox31.setSelected(false);
		}
		else {
			checkBox31.setSelected(true);
		}
		if(ticks[32] == false) {
			checkBox32.setSelected(false);
		}
		else {
			checkBox32.setSelected(true);
		}
		if(ticks[33] == false) {
			checkBox33.setSelected(false);
		}
		else {
			checkBox33.setSelected(true);
		}
		if(ticks[34] == false) {
			checkBox34.setSelected(false);
		}
		else {
			checkBox34.setSelected(true);
		}
	}
}
