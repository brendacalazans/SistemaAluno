package br.com.unicid.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.JSeparator;
import java.awt.Insets;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Component;
import javax.swing.JTabbedPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import java.awt.Panel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenu mnNewMenu_1;
	private JMenu mnNewMenu_2;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmNewMenuItem_2;
	private JMenuItem mntmNewMenuItem_3;
	private JMenuItem mntmNewMenuItem_4;
	private JSeparator separator;
	private JMenuItem mntmNewMenuItem_5;
	private JMenuItem mntmNewMenuItem_6;
	private JMenuItem mntmNewMenuItem_7;
	private JMenuItem mntmNewMenuItem_8;
	private JMenuItem mntmNewMenuItem_9;
	private JTabbedPane tabbedPane;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JLabel lblNome;
	private JTextField textField_1;
	private JLabel lblDataDeNascimento;
	private JTextField textField_2;
	private JLabel lblCpf;
	private JTextField textField_3;
	private JLabel lblEmail;
	private JTextField textField_4;
	private JLabel lblEnd;
	private JTextField textField_5;
	private JLabel lblMuncipio;
	private JTextField textField_6;
	private JLabel lblUf;
	private JComboBox comboBox;
	private JLabel lblCelular;
	private JTextField textField_7;
	private JButton btnNewButton;
	private JLabel lblCurso;
	private JComboBox comboBox_1;
	private JLabel lblCampus;
	private JComboBox comboBox_2;
	private JLabel lblPerodo;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JRadioButton rdbtnNewRadioButton_2;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JLabel lblNewLabel_1;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JLabel lblNewLabel_2;
	private JComboBox comboBox_3;
	private JLabel lblNewLabel_3;
	private JComboBox comboBox_4;
	private JLabel lblNewLabel_4;
	private JComboBox comboBox_5;
	private JLabel lblNewLabel_5;
	private JComboBox comboBox_6;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private JButton btnNewButton_9;
	private JButton btnNewButton_10;
	private JLabel lblNewLabel_6;
	private JTextField textField_11;
	private JLabel lblNome_1;
	private JTextField textField_12;
	private JLabel lblCurso_1;
	private JTextField textField_13;
	private JLabel lblCampus_1;
	private JTextField textField_14;
	private JTable table;
	private JButton btnConsultar;
	private JButton btnNewButton_12;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 581, 412);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnNewMenu = new JMenu("Aluno");
		menuBar.add(mnNewMenu);
		
		mntmNewMenuItem = new JMenuItem("Salvar");
		mntmNewMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
		mntmNewMenuItem.setHorizontalAlignment(SwingConstants.LEFT);
		mnNewMenu.add(mntmNewMenuItem);
		
		mntmNewMenuItem_1 = new JMenuItem("Alterar");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		mntmNewMenuItem_2 = new JMenuItem("Consultar");
		mnNewMenu.add(mntmNewMenuItem_2);
		
		mntmNewMenuItem_3 = new JMenuItem("Excluir");
		mnNewMenu.add(mntmNewMenuItem_3);
		
		separator = new JSeparator();
		mnNewMenu.add(separator);
		
		mntmNewMenuItem_4 = new JMenuItem("Sair");
		mntmNewMenuItem_4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.SHIFT_DOWN_MASK));
		mnNewMenu.add(mntmNewMenuItem_4);
		
		mnNewMenu_1 = new JMenu("Notas e Faltas");
		menuBar.add(mnNewMenu_1);
		
		mntmNewMenuItem_5 = new JMenuItem("Salvar");
		mntmNewMenuItem_5.setHorizontalAlignment(SwingConstants.LEFT);
		mnNewMenu_1.add(mntmNewMenuItem_5);
		
		mntmNewMenuItem_6 = new JMenuItem("Alterar");
		mntmNewMenuItem_6.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_DOWN_MASK));
		mnNewMenu_1.add(mntmNewMenuItem_6);
		
		mntmNewMenuItem_7 = new JMenuItem("Excluir");
		mnNewMenu_1.add(mntmNewMenuItem_7);
		
		mntmNewMenuItem_8 = new JMenuItem("Consultar");
		mnNewMenu_1.add(mntmNewMenuItem_8);
		
		mnNewMenu_2 = new JMenu("Ajuda");
		menuBar.add(mnNewMenu_2);
		
		mntmNewMenuItem_9 = new JMenuItem("Sobre");
		mntmNewMenuItem_9.setHorizontalAlignment(SwingConstants.LEFT);
		mnNewMenu_2.add(mntmNewMenuItem_9);
		contentPane =  new JPanel();
		contentPane.setAlignmentX(Component.RIGHT_ALIGNMENT);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 37, 555, 303);
		contentPane.add(tabbedPane);
		
		panel = new JPanel();
		panel.setName("Dados Pessoais");
		tabbedPane.addTab("Dados Pessoais", null, panel, null);
		panel.setLayout(null);
		
		lblNewLabel = new JLabel("RGM");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 14, 99, 14);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 13));
		textField.setBounds(60, 11, 146, 22);
		panel.add(textField);
		textField.setColumns(10);
		
		lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNome.setBounds(231, 14, 99, 14);
		panel.add(lblNome);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial", Font.PLAIN, 13));
		textField_1.setColumns(10);
		textField_1.setBounds(280, 11, 248, 22);
		panel.add(textField_1);
		
		lblDataDeNascimento = new JLabel("Data de Nascimento");
		lblDataDeNascimento.setFont(new Font("Arial", Font.PLAIN, 14));
		lblDataDeNascimento.setBounds(10, 53, 127, 14);
		panel.add(lblDataDeNascimento);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Arial", Font.PLAIN, 13));
		textField_2.setColumns(10);
		textField_2.setBounds(146, 51, 139, 22);
		panel.add(textField_2);
		
		lblCpf = new JLabel("CPF");
		lblCpf.setFont(new Font("Arial", Font.PLAIN, 14));
		lblCpf.setBounds(305, 54, 99, 14);
		panel.add(lblCpf);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Arial", Font.PLAIN, 13));
		textField_3.setColumns(10);
		textField_3.setBounds(346, 51, 182, 22);
		panel.add(textField_3);
		
		lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Arial", Font.PLAIN, 14));
		lblEmail.setBounds(10, 94, 99, 14);
		panel.add(lblEmail);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Arial", Font.PLAIN, 13));
		textField_4.setColumns(10);
		textField_4.setBounds(60, 92, 468, 22);
		panel.add(textField_4);
		
		lblEnd = new JLabel("End.");
		lblEnd.setFont(new Font("Arial", Font.PLAIN, 14));
		lblEnd.setBounds(10, 139, 99, 14);
		panel.add(lblEnd);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Arial", Font.PLAIN, 13));
		textField_5.setColumns(10);
		textField_5.setBounds(60, 136, 468, 22);
		panel.add(textField_5);
		
		lblMuncipio = new JLabel("Município");
		lblMuncipio.setFont(new Font("Arial", Font.PLAIN, 14));
		lblMuncipio.setBounds(10, 182, 99, 14);
		panel.add(lblMuncipio);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Arial", Font.PLAIN, 13));
		textField_6.setColumns(10);
		textField_6.setBounds(82, 179, 139, 22);
		panel.add(textField_6);
		
		lblUf = new JLabel("UF");
		lblUf.setFont(new Font("Arial", Font.PLAIN, 14));
		lblUf.setBounds(239, 183, 99, 14);
		panel.add(lblUf);
		
		comboBox = new JComboBox();
		comboBox.setBounds(267, 179, 43, 22);
		panel.add(comboBox);
		
		lblCelular = new JLabel("Celular");
		lblCelular.setFont(new Font("Arial", Font.PLAIN, 14));
		lblCelular.setBounds(330, 182, 99, 14);
		panel.add(lblCelular);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Arial", Font.PLAIN, 13));
		textField_7.setColumns(10);
		textField_7.setBounds(389, 180, 139, 22);
		panel.add(textField_7);
		
		btnNewButton = new JButton("Limpar");
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 14));
		btnNewButton.setBounds(399, 223, 129, 30);
		panel.add(btnNewButton);
		
		panel_1 = new JPanel();
		tabbedPane.addTab("Curso", null, panel_1, null);
		panel_1.setLayout(null);
		
		lblCurso = new JLabel("Curso");
		lblCurso.setFont(new Font("Arial", Font.PLAIN, 14));
		lblCurso.setBounds(15, 26, 127, 14);
		panel_1.add(lblCurso);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Arial", Font.PLAIN, 14));
		comboBox_1.setBounds(94, 18, 433, 30);
		panel_1.add(comboBox_1);
		
		lblCampus = new JLabel("Campus");
		lblCampus.setFont(new Font("Arial", Font.PLAIN, 14));
		lblCampus.setBounds(15, 77, 127, 14);
		panel_1.add(lblCampus);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Arial", Font.PLAIN, 14));
		comboBox_2.setBounds(94, 69, 433, 30);
		panel_1.add(comboBox_2);
		
		lblPerodo = new JLabel("Período");
		lblPerodo.setFont(new Font("Arial", Font.PLAIN, 14));
		lblPerodo.setBounds(15, 132, 127, 14);
		panel_1.add(lblPerodo);
		
		rdbtnNewRadioButton = new JRadioButton("Matutino");
		rdbtnNewRadioButton.setFont(new Font("Arial", Font.PLAIN, 14));
		rdbtnNewRadioButton.setBounds(94, 128, 109, 23);
		panel_1.add(rdbtnNewRadioButton);
		
		rdbtnNewRadioButton_1 = new JRadioButton("Vespertino");
		rdbtnNewRadioButton_1.setFont(new Font("Arial", Font.PLAIN, 14));
		rdbtnNewRadioButton_1.setBounds(221, 127, 109, 23);
		panel_1.add(rdbtnNewRadioButton_1);
		
		rdbtnNewRadioButton_2 = new JRadioButton("Noturno");
		rdbtnNewRadioButton_2.setFont(new Font("Arial", Font.PLAIN, 14));
		rdbtnNewRadioButton_2.setBounds(362, 127, 109, 23);
		panel_1.add(rdbtnNewRadioButton_2);
		
		btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(27, 171, 80, 80);
		panel_1.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(128, 171, 80, 80);
		panel_1.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(231, 171, 80, 80);
		panel_1.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setBounds(335, 171, 80, 80);
		panel_1.add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("New button");
		btnNewButton_5.setBounds(440, 171, 80, 80);
		panel_1.add(btnNewButton_5);
		
		panel_2 = new JPanel();
		tabbedPane.addTab("Notas e Faltas", null, panel_2, null);
		panel_2.setLayout(null);
		
		lblNewLabel_1 = new JLabel("RGM");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 14, 99, 14);
		panel_2.add(lblNewLabel_1);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Arial", Font.PLAIN, 13));
		textField_8.setColumns(10);
		textField_8.setBounds(60, 11, 146, 22);
		panel_2.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setBackground(new Color(214, 214, 214));
		textField_9.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, Color.GRAY, new Color(128, 128, 128)));
		textField_9.setFont(new Font("Arial", Font.PLAIN, 13));
		textField_9.setColumns(10);
		textField_9.setBounds(233, 12, 289, 22);
		panel_2.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Arial", Font.PLAIN, 13));
		textField_10.setColumns(10);
		textField_10.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, Color.GRAY, new Color(128, 128, 128)));
		textField_10.setBackground(new Color(214, 214, 214));
		textField_10.setBounds(10, 44, 514, 22);
		panel_2.add(textField_10);
		
		lblNewLabel_2 = new JLabel("Disciplina");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(10, 88, 99, 14);
		panel_2.add(lblNewLabel_2);
		
		comboBox_3 = new JComboBox();
		comboBox_3.setFont(new Font("Arial", Font.PLAIN, 14));
		comboBox_3.setBounds(89, 83, 433, 25);
		panel_2.add(comboBox_3);
		
		lblNewLabel_3 = new JLabel("Semestre");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(10, 134, 99, 14);
		panel_2.add(lblNewLabel_3);
		
		comboBox_4 = new JComboBox();
		comboBox_4.setFont(new Font("Arial", Font.PLAIN, 14));
		comboBox_4.setBounds(89, 131, 117, 25);
		panel_2.add(comboBox_4);
		
		lblNewLabel_4 = new JLabel("Nota");
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(233, 134, 99, 14);
		panel_2.add(lblNewLabel_4);
		
		comboBox_5 = new JComboBox();
		comboBox_5.setFont(new Font("Arial", Font.PLAIN, 14));
		comboBox_5.setBounds(278, 131, 83, 25);
		panel_2.add(comboBox_5);
		
		lblNewLabel_5 = new JLabel("Faltas");
		lblNewLabel_5.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(384, 134, 99, 14);
		panel_2.add(lblNewLabel_5);
		
		comboBox_6 = new JComboBox();
		comboBox_6.setFont(new Font("Arial", Font.PLAIN, 14));
		comboBox_6.setBounds(439, 131, 83, 25);
		panel_2.add(comboBox_6);
		
		btnNewButton_6 = new JButton("New button");
		btnNewButton_6.setBounds(20, 175, 80, 80);
		panel_2.add(btnNewButton_6);
		
		btnNewButton_7 = new JButton("New button");
		btnNewButton_7.setBounds(121, 175, 80, 80);
		panel_2.add(btnNewButton_7);
		
		btnNewButton_8 = new JButton("New button");
		btnNewButton_8.setBounds(224, 175, 80, 80);
		panel_2.add(btnNewButton_8);
		
		btnNewButton_9 = new JButton("New button");
		btnNewButton_9.setBounds(328, 175, 80, 80);
		panel_2.add(btnNewButton_9);
		
		btnNewButton_10 = new JButton("New button");
		btnNewButton_10.setBounds(433, 175, 80, 80);
		panel_2.add(btnNewButton_10);
		
		panel_3 = new JPanel();
		tabbedPane.addTab("Boletim", null, panel_3, null);
		panel_3.setLayout(null);
		
		lblNewLabel_6 = new JLabel("RGM");
		lblNewLabel_6.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(10, 14, 99, 14);
		panel_3.add(lblNewLabel_6);
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("Arial", Font.PLAIN, 13));
		textField_11.setColumns(10);
		textField_11.setBounds(67, 11, 139, 22);
		panel_3.add(textField_11);
		
		lblNome_1 = new JLabel("Nome");
		lblNome_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNome_1.setBounds(231, 14, 99, 14);
		panel_3.add(lblNome_1);
		
		textField_12 = new JTextField();
		textField_12.setFont(new Font("Arial", Font.PLAIN, 13));
		textField_12.setColumns(10);
		textField_12.setBounds(280, 11, 248, 22);
		panel_3.add(textField_12);
		
		lblCurso_1 = new JLabel("Curso");
		lblCurso_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblCurso_1.setBounds(10, 53, 127, 14);
		panel_3.add(lblCurso_1);
		
		textField_13 = new JTextField();
		textField_13.setFont(new Font("Arial", Font.PLAIN, 13));
		textField_13.setColumns(10);
		textField_13.setBounds(67, 50, 461, 22);
		panel_3.add(textField_13);
		
		lblCampus_1 = new JLabel("Campus");
		lblCampus_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblCampus_1.setBounds(10, 94, 99, 14);
		panel_3.add(lblCampus_1);
		
		textField_14 = new JTextField();
		textField_14.setFont(new Font("Arial", Font.PLAIN, 13));
		textField_14.setColumns(10);
		textField_14.setBounds(67, 92, 461, 22);
		panel_3.add(textField_14);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 130, 517, 100);
		panel_3.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Disciplinas", "Notas", "Faltas"
			}
		));
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnConsultar.setBounds(323, 236, 129, 30);
		panel_3.add(btnConsultar);
		
		btnNewButton_12 = new JButton("Limpar");
		btnNewButton_12.setFont(new Font("Arial", Font.PLAIN, 14));
		btnNewButton_12.setBounds(97, 236, 129, 30);
		panel_3.add(btnNewButton_12);
	}
}
