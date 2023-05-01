package br.com.unicid.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

import br.com.unicid.dao.AlunoDAO;
import br.com.unicid.dao.BoletimDAO;
import br.com.unicid.dao.NotaFaltaDAO;
import br.com.unicid.model.Aluno;
import br.com.unicid.model.Boletim;

public class TelaPrincipal extends JFrame {

	SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
	
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
	private JTextField txtDpRGM;
	private JLabel lblNome;
	private JTextField txtDpNome;
	private JLabel lblDataDeNascimento;
	private JLabel lblCpf;
	private JLabel lblEmail;
	private JTextField txtDpEmail;
	private JLabel lblEnd;
	private JTextField txtDpEndereco;
	private JLabel lblMuncipio;
	private JTextField txtDpMunicipio;
	private JLabel lblUf;
	private JComboBox cmbDpUF;
	private JLabel lblCelular;
	private JButton btnDpLimpar;
	private JLabel lblCurso;
	private JComboBox cmbCCurso;
	private JLabel lblCampus;
	private JComboBox cmbCCampus;
	private JLabel lblPerodo;
	private JRadioButton rdbtnCMatutino;
	private JRadioButton rdbtnCVespertino;
	private JRadioButton rdbtnCNoturno;
	private JButton btnCSalvar;
	private JButton btnCAlterar;
	private JButton btnCConsultar;
	private JButton btnCDeletar;
	private JButton btnCLimpar;
	private JLabel lblNewLabel_1;
	private JTextField txtNfRGM;
	private JTextField lblNfNome;
	private JTextField lblNfCurso;
	private JLabel lblNewLabel_2;
	private JComboBox lblNfDisciplina;
	private JLabel lblNewLabel_3;
	private JComboBox lblcmbNfSemestre;
	private JLabel lblNewLabel_4;
	private JComboBox lblcmbNfNotas;
	private JLabel lblNewLabel_5;
	private JButton btnNfConsultar;
	private JButton btnNfAlterar;
	private JButton btnNfDeletar;
	private JButton btnNfLimpar;
	private JButton btnNfSalvar;
	private JLabel lblNewLabel_6;
	private JTextField txtBRGM;
	private JLabel lblNome_1;
	private JTextField txtBNome;
	private JLabel lblCurso_1;
	private JTextField txtBCurso;
	private JLabel lblCampus_1;
	private JTextField txtBCampus;
	private JTable table;
	private JButton btBConsultar;
	private JButton btnBLimpar;
	private JScrollPane spBtable;
	private JFormattedTextField txtDpCPF;
	private JFormattedTextField txtDpCelular;
	private JFormattedTextField txtDpData;
	private JTextField lblNfFaltas;

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
	 * @throws ParseException 
	 */
	public TelaPrincipal() throws ParseException {
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
		
		txtDpRGM = new JTextField();
		txtDpRGM.setFont(new Font("Arial", Font.PLAIN, 13));
		txtDpRGM.setBounds(60, 11, 146, 22);
		panel.add(txtDpRGM);
		txtDpRGM.setColumns(10);
		
		lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNome.setBounds(231, 14, 99, 14);
		panel.add(lblNome);
		
		txtDpNome = new JTextField();
		txtDpNome.setFont(new Font("Arial", Font.PLAIN, 13));
		txtDpNome.setColumns(10);
		txtDpNome.setBounds(305, 11, 248, 22);
		panel.add(txtDpNome);
		
		lblDataDeNascimento = new JLabel("Data de Nascimento");
		lblDataDeNascimento.setFont(new Font("Arial", Font.PLAIN, 14));
		lblDataDeNascimento.setBounds(10, 53, 127, 14);
		panel.add(lblDataDeNascimento);
		
		lblCpf = new JLabel("CPF");
		lblCpf.setFont(new Font("Arial", Font.PLAIN, 14));
		lblCpf.setBounds(305, 54, 99, 14);
		panel.add(lblCpf);
		
		lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Arial", Font.PLAIN, 14));
		lblEmail.setBounds(10, 94, 99, 14);
		panel.add(lblEmail);
		
		txtDpEmail = new JTextField();
		txtDpEmail.setFont(new Font("Arial", Font.PLAIN, 13));
		txtDpEmail.setColumns(10);
		txtDpEmail.setBounds(60, 92, 468, 22);
		panel.add(txtDpEmail);
		
		lblEnd = new JLabel("End.");
		lblEnd.setFont(new Font("Arial", Font.PLAIN, 14));
		lblEnd.setBounds(10, 139, 99, 14);
		panel.add(lblEnd);
		
		txtDpEndereco = new JTextField();
		txtDpEndereco.setFont(new Font("Arial", Font.PLAIN, 13));
		txtDpEndereco.setColumns(10);
		txtDpEndereco.setBounds(60, 136, 468, 22);
		panel.add(txtDpEndereco);
		
		lblMuncipio = new JLabel("Município");
		lblMuncipio.setFont(new Font("Arial", Font.PLAIN, 14));
		lblMuncipio.setBounds(10, 182, 99, 14);
		panel.add(lblMuncipio);
		
		txtDpMunicipio = new JTextField();
		txtDpMunicipio.setFont(new Font("Arial", Font.PLAIN, 13));
		txtDpMunicipio.setColumns(10);
		txtDpMunicipio.setBounds(82, 179, 139, 22);
		panel.add(txtDpMunicipio);
		
		lblUf = new JLabel("UF");
		lblUf.setFont(new Font("Arial", Font.PLAIN, 14));
		lblUf.setBounds(239, 183, 99, 14);
		panel.add(lblUf);
		
		cmbDpUF = new JComboBox();
		cmbDpUF.setModel(new DefaultComboBoxModel(new String[] {"AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"}));
		cmbDpUF.setBounds(267, 179, 43, 22);
		panel.add(cmbDpUF);
		
		lblCelular = new JLabel("Celular");
		lblCelular.setFont(new Font("Arial", Font.PLAIN, 14));
		lblCelular.setBounds(330, 182, 99, 14);
		panel.add(lblCelular);
		
		btnDpLimpar = new JButton("Limpar");
		btnDpLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// =====================================
				// 1. Método de Limpar
				txtDpRGM.setText(null);
				txtDpNome.setText(null);
				txtDpData.setText(null);
				txtDpCPF.setText(null);
				txtDpEmail.setText(null);
				txtDpEndereco.setText(null);
				txtDpMunicipio.setText(null);
				cmbDpUF.setSelectedIndex(0);
				txtDpCelular.setText(null);
				cmbCCurso.setSelectedIndex(0);
				cmbCCampus.setSelectedIndex(0);
				if (rdbtnCMatutino.isSelected()) {
					rdbtnCMatutino.setSelected(true);
				} else if (rdbtnCVespertino.isSelected()) {
					rdbtnCMatutino.setSelected(true);
				} else if (rdbtnCNoturno.isSelected()) {
					rdbtnCMatutino.setSelected(true);
				}
				// =====================================
			}
		});
		btnDpLimpar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnDpLimpar.setBounds(399, 223, 129, 30);
		panel.add(btnDpLimpar);
		
		txtDpCPF = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
		txtDpCPF.setBounds(346, 51, 182, 22);
		panel.add(txtDpCPF);
		
		txtDpCelular = new JFormattedTextField(new MaskFormatter("## #####-####"));
		txtDpCelular.setBounds(389, 180, 139, 22);
		panel.add(txtDpCelular);
		
		txtDpData = new JFormattedTextField(new MaskFormatter("##/##/####"));
		txtDpData.setBounds(147, 51, 139, 22);
		panel.add(txtDpData);
		
		panel_1 = new JPanel();
		tabbedPane.addTab("Curso", null, panel_1, null);
		panel_1.setLayout(null);
		
		lblCurso = new JLabel("Curso");
		lblCurso.setFont(new Font("Arial", Font.PLAIN, 14));
		lblCurso.setBounds(15, 26, 127, 14);
		panel_1.add(lblCurso);
		
		cmbCCurso = new JComboBox();
		cmbCCurso.setModel(new DefaultComboBoxModel(new String[] {"Análise e Desenvolvimento de Sistemas", "Ciência da Computação", "Sistemas da Informação", "Tecnologia da Informação"}));
		cmbCCurso.setFont(new Font("Arial", Font.PLAIN, 14));
		cmbCCurso.setBounds(94, 18, 433, 30);
		panel_1.add(cmbCCurso);
		
		lblCampus = new JLabel("Campus");
		lblCampus.setFont(new Font("Arial", Font.PLAIN, 14));
		lblCampus.setBounds(15, 77, 127, 14);
		panel_1.add(lblCampus);
		
		cmbCCampus = new JComboBox();
		cmbCCampus.setModel(new DefaultComboBoxModel(new String[] {"EAD", "Pinheiros", "Tatuapé"}));
		cmbCCampus.setFont(new Font("Arial", Font.PLAIN, 14));
		cmbCCampus.setBounds(94, 69, 433, 30);
		panel_1.add(cmbCCampus);
		
		lblPerodo = new JLabel("Período");
		lblPerodo.setFont(new Font("Arial", Font.PLAIN, 14));
		lblPerodo.setBounds(15, 132, 127, 14);
		panel_1.add(lblPerodo);
		
		rdbtnCMatutino = new JRadioButton("Matutino");
		rdbtnCMatutino.setFont(new Font("Arial", Font.PLAIN, 14));
		rdbtnCMatutino.setBounds(94, 128, 109, 23);
		panel_1.add(rdbtnCMatutino);
		
		rdbtnCVespertino = new JRadioButton("Vespertino");
		rdbtnCVespertino.setFont(new Font("Arial", Font.PLAIN, 14));
		rdbtnCVespertino.setBounds(221, 127, 109, 23);
		panel_1.add(rdbtnCVespertino);
		
		rdbtnCNoturno = new JRadioButton("Noturno");
		rdbtnCNoturno.setFont(new Font("Arial", Font.PLAIN, 14));
		rdbtnCNoturno.setBounds(362, 127, 109, 23);
		panel_1.add(rdbtnCNoturno);
		
		btnCSalvar = new JButton("Salvar");
		btnCSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// =====================================
				// 1. Validação do botão Salvar

				// 1.1 Campo - RGM
				if (txtDpRGM.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Inválido - Insira o RGM do aluno!");
					txtDpRGM.requestFocus();
				} 

				// 1.2 Campo - Nome
				if (txtDpNome.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Inválido - Insira o nome do aluno!");
					txtDpNome.requestFocus();
				} else if (txtDpNome.getText().length() < 3) {
					JOptionPane.showMessageDialog(null, "Inválido - Insira mais caracteres para formar um nome!");
					txtDpNome.requestFocus();
				}

				// 1.3 Campo - Data Nascimento
				if (txtDpData.getText().trim().length() != 10) {
					JOptionPane.showMessageDialog(null, "Inválido - Insira uma data de nascimento válida!");
					txtDpData.requestFocus();
				} 

				// 1.4 Campo - CPF
				if (txtDpCPF.getText().trim().length() < 10) {
					JOptionPane.showMessageDialog(null, "Inválido - Campo de CPF incompleto ou vazio!");
					txtDpCPF.requestFocus();
				} 

				// 1.5 Campo - Email
				if (txtDpEmail.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Inválido - Insira um e-mail!");
					txtDpEmail.requestFocus();
				} 

				// 1.6 Campo - Endereço
				if (txtDpEndereco.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Inválido - Insira um endereço!");
					txtDpEndereco.requestFocus();
				} 

				// 1.7 Campo - Município
				if (txtDpMunicipio.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Inválido - Insira um município!");
					txtDpMunicipio.requestFocus();
				} 
				
				// 1.8 Campo - Celular
				if (txtDpCelular.getText().trim().length() < 10) {
					JOptionPane.showMessageDialog(null, "Inválido - Campo de celular vazio ou incompleto!");
					txtDpCelular.requestFocus();
				}
				
				// 2. Método de Salvar
					
				try {
					Aluno aluno = new Aluno();
					aluno.setRgmAluno(Integer.parseInt(txtDpRGM.getText()));
					aluno.setNomeAluno(txtDpNome.getText());
					aluno.setDataAluno((txtDpData.getText()));
					aluno.setCpfAluno(txtDpCPF.getText());
					aluno.setEmailAluno(txtDpEmail.getText());
					aluno.setEnderecoAluno(txtDpEndereco.getText());
					aluno.setMunicipioAluno(txtDpMunicipio.getText());
					aluno.setUfAluno((String) cmbDpUF.getSelectedItem());
					aluno.setCelularAluno(txtDpCelular.getText());
					aluno.setCursoAluno((String) cmbCCurso.getSelectedItem());
					aluno.setCampusAluno((String) cmbCCampus.getSelectedItem());
					if (rdbtnCMatutino.isSelected()) {
						aluno.setPeriodoAluno("Matutino");
					} else if (rdbtnCVespertino.isSelected()) {
						aluno.setPeriodoAluno("Vespertino");
					} else if (rdbtnCNoturno.isSelected()) {
						aluno.setPeriodoAluno("Noturno");
					}
					// 2.1 Abre conexão
					AlunoDAO dao = new AlunoDAO();
					// 2.2 Salva
					dao.salvar(aluno);
					JOptionPane.showMessageDialog(null, "Salvo com sucesso!");

				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Erro ao salvar: " + e1.getMessage());
				}
		// =====================================
			}
		});
		btnCSalvar.setBounds(27, 171, 80, 80);
		panel_1.add(btnCSalvar);
		
		btnCAlterar = new JButton("Alterar");
		btnCAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// =====================================
				// 1. Validação do botão Alterar

				// 1.1 Campo - RGM
				if (txtDpRGM.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Inválido - Insira o RGM do aluno!");
					txtDpRGM.requestFocus();
				} 

				// 1.2 Campo - Nome
				if (txtDpNome.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Inválido - Insira o nome do aluno!");
					txtDpNome.requestFocus();
				} else if (txtDpNome.getText().length() < 3) {
					JOptionPane.showMessageDialog(null, "Inválido - Insira mais caracteres para formar um nome!");
					txtDpNome.requestFocus();
				}

				// 1.3 Campo - Data Nascimento
				if (txtDpData.getText().trim().length() != 10) {
					JOptionPane.showMessageDialog(null, "Inválido - Insira uma data de nascimento válida!");
					txtDpData.requestFocus();
				} 

				// 1.4 Campo - CPF
				if (txtDpCPF.getText().trim().length() < 10) {
					JOptionPane.showMessageDialog(null, "Inválido - Campo de CPF incompleto ou vazio!");
					txtDpCPF.requestFocus();
				} 

				// 1.5 Campo - Email
				if (txtDpEmail.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Inválido - Insira um e-mail!");
					txtDpEmail.requestFocus();
				} 

				// 1.6 Campo - Endereço
				if (txtDpEndereco.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Inválido - Insira um endereço!");
					txtDpEndereco.requestFocus();
				} 

				// 1.7 Campo - Município
				if (txtDpMunicipio.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Inválido - Insira um município!");
					txtDpMunicipio.requestFocus();
				} 
				
				// 1.8 Campo - Celular
				if (txtDpCelular.getText().trim().length() < 10) {
					JOptionPane.showMessageDialog(null, "Inválido - Campo de celular vazio ou incompleto!");
					txtDpCelular.requestFocus();
				}
				
				// 2. Método de Alterar
					
				try {
					Aluno aluno = new Aluno();
					aluno.setRgmAluno(Integer.parseInt(txtDpRGM.getText()));
					aluno.setNomeAluno(txtDpNome.getText());
					aluno.setDataAluno((txtDpData.getText()));
					aluno.setCpfAluno(txtDpCPF.getText());
					aluno.setEmailAluno(txtDpEmail.getText());
					aluno.setEnderecoAluno(txtDpEndereco.getText());
					aluno.setMunicipioAluno(txtDpMunicipio.getText());
					aluno.setUfAluno((String) cmbDpUF.getSelectedItem());
					aluno.setCelularAluno(txtDpCelular.getText());
					aluno.setCursoAluno((String) cmbCCurso.getSelectedItem());
					aluno.setCampusAluno((String) cmbCCampus.getSelectedItem());
					if (rdbtnCMatutino.isSelected()) {
						aluno.setPeriodoAluno("Matutino");
					} else if (rdbtnCVespertino.isSelected()) {
						aluno.setPeriodoAluno("Vespertino");
					} else if (rdbtnCNoturno.isSelected()) {
						aluno.setPeriodoAluno("Noturno");
					}
					
					AlunoDAO dao = new AlunoDAO();
					
					dao.alterar(aluno);
					JOptionPane.showMessageDialog(null, "Alterado com sucesso!");

				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Erro ao alterar: " + e1.getMessage());
				}
		// =====================================
			}
		});
		btnCAlterar.setBounds(128, 171, 80, 80);
		panel_1.add(btnCAlterar);
		
		btnCConsultar = new JButton("Consultar");
		btnCConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// =====================================
				
				// 1. Validação do botão Consultar
				// 1.1 Campo - RGM
				if (txtDpRGM.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Inválido - Insira o RGM do aluno!");
					txtDpRGM.requestFocus();
				} else {
					// 2. Método de Consultar
					try {
						AlunoDAO dao = new AlunoDAO();
						Aluno aluno = dao.consultar(Integer.parseInt(txtDpRGM.getText()));
						
						txtDpNome.setText(aluno.getNomeAluno());
						txtDpData.setText(new SimpleDateFormat("dd/MM/yyyy").format(aluno.getDataAluno()));
						txtDpCPF.setText(aluno.getCpfAluno());
						txtDpEmail.setText(aluno.getEmailAluno());
						txtDpEndereco.setText(aluno.getEnderecoAluno());
						txtDpMunicipio.setText(aluno.getMunicipioAluno());
				
						String uf = aluno.getUfAluno();
						if (uf.equals("AC")) {
							cmbDpUF.setSelectedIndex(0);
						} else if (uf.equals("AL")) {
							cmbDpUF.setSelectedIndex(1);
						} else if (uf.equals("AM")) {
							cmbDpUF.setSelectedIndex(2);
						} else if (uf.equals("AP")) {
							cmbDpUF.setSelectedIndex(3);
						}else if (uf.equals("BA")) {
							cmbDpUF.setSelectedIndex(4);
						}else if (uf.equals("CE")) {
							cmbDpUF.setSelectedIndex(5);
						}else if (uf.equals("DF")) {
							cmbDpUF.setSelectedIndex(6);
						}else if (uf.equals("ES")) {
							cmbDpUF.setSelectedIndex(7);
						}else if (uf.equals("GO")) {
							cmbDpUF.setSelectedIndex(8);
						}else if (uf.equals("MA")) {
							cmbDpUF.setSelectedIndex(9);
						}else if (uf.equals("MT")) {
							cmbDpUF.setSelectedIndex(10);
						}else if (uf.equals("MS")) {
							cmbDpUF.setSelectedIndex(11);
						}else if (uf.equals("MG")) {
							cmbDpUF.setSelectedIndex(12);
						}else if (uf.equals("PA")) {
							cmbDpUF.setSelectedIndex(13);
						}else if (uf.equals("PB")) {
							cmbDpUF.setSelectedIndex(14);
						}else if (uf.equals("PR")) {
							cmbDpUF.setSelectedIndex(15);
						}else if (uf.equals("PE")) {
							cmbDpUF.setSelectedIndex(16);
						}else if (uf.equals("PI")) {
							cmbDpUF.setSelectedIndex(17);
						}else if (uf.equals("RJ")) {
							cmbDpUF.setSelectedIndex(18);
						}else if (uf.equals("RN")) {
							cmbDpUF.setSelectedIndex(19);
						}else if (uf.equals("RS")) {
							cmbDpUF.setSelectedIndex(20);
						}else if (uf.equals("RO")) {
							cmbDpUF.setSelectedIndex(21);
						}else if (uf.equals("RR")) {
							cmbDpUF.setSelectedIndex(22);
						}else if (uf.equals("SC")) {
							cmbDpUF.setSelectedIndex(23);
						}else if (uf.equals("SP")) {
							cmbDpUF.setSelectedIndex(24);
						}else if (uf.equals("SE")) {
							cmbDpUF.setSelectedIndex(25);
						}else {
							cmbDpUF.setSelectedIndex(26);
						}

						txtDpCelular.setText(aluno.getCelularAluno());
						
						String curso = aluno.getCursoAluno();
						if (curso.equals("Análise e Desenvolvimento de Sistemas")) {
							cmbCCurso.setSelectedIndex(0);
						} else if (curso.equals("Ciência da Computação")) {
							cmbCCurso.setSelectedIndex(1);
						}else if (curso.equals("Sistemas da Informação")) {
							cmbCCurso.setSelectedIndex(2);
						} else {
							cmbCCurso.setSelectedIndex(3);
						}
					
						String campus = aluno.getCampusAluno();
						if (campus.equals("EAD")) {
							cmbCCampus.setSelectedIndex(0);
						} else if (campus.equals("Pinheiros")) {
							cmbCCampus.setSelectedIndex(1);
						} else {
							cmbCCampus.setSelectedIndex(2);
						}
						
						String periodo = aluno.getPeriodoAluno();
						if (periodo.equals("Matutino")) {
							rdbtnCMatutino.setSelected(true);
						} else if (periodo.equals("Vespertino")) {
							rdbtnCVespertino.setSelected(true);
						} else if (periodo.equals("Noturno")) {
							rdbtnCNoturno.setSelected(true);
						}

					} catch (Exception e4) {
						e4.printStackTrace();
						JOptionPane.showMessageDialog(null, "Inválido - RGM inserido não está cadastrado!");
					}
				}
				// =====================================
			}
		});
		btnCConsultar.setBounds(231, 171, 80, 80);
		panel_1.add(btnCConsultar);
		
		btnCDeletar = new JButton("Deletar");
		btnCDeletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// =====================================
				// 1. Validação do botão Excluir
				// 1.1 Campo - RGM
				if (txtDpRGM.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Inválido - Insira o RGM do aluno!");
					txtDpRGM.requestFocus();
				} else {
					// 2. Método de Excluir
					try {
						AlunoDAO dao = new AlunoDAO();
						NotaFaltaDAO daoNota = new NotaFaltaDAO();
						
						dao.excluir(Integer.parseInt(txtDpRGM.getText()));
						daoNota.excluir(Integer.parseInt(txtDpRGM.getText()));
						JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
					} catch (Exception e1) {
						JOptionPane.showMessageDialog(null, "Erro ao Excluir" + e1.getMessage());
					}
				}
				// =====================================
			}
		});
		btnCDeletar.setBounds(335, 171, 80, 80);
		panel_1.add(btnCDeletar);
		
		btnCLimpar = new JButton("Limpar");
		btnCLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// =====================================
				// 1. Método de Limpar
				txtDpRGM.setText(null);
				txtDpNome.setText(null);
				txtDpData.setText(null);
				txtDpCPF.setText(null);
				txtDpEmail.setText(null);
				txtDpEndereco.setText(null);
				txtDpMunicipio.setText(null);
				cmbDpUF.setSelectedIndex(0);
				txtDpCelular.setText(null);
				cmbCCurso.setSelectedIndex(0);
				cmbCCampus.setSelectedIndex(0);
				if (rdbtnCMatutino.isSelected()) {
					rdbtnCMatutino.setSelected(true);
				} else if (rdbtnCVespertino.isSelected()) {
					rdbtnCMatutino.setSelected(true);
				} else if (rdbtnCNoturno.isSelected()) {
					rdbtnCMatutino.setSelected(true);
				}
				// =====================================
			}
		});
		btnCLimpar.setBounds(440, 171, 80, 80);
		panel_1.add(btnCLimpar);
		
		panel_2 = new JPanel();
		tabbedPane.addTab("Notas e Faltas", null, panel_2, null);
		panel_2.setLayout(null);
		
		lblNewLabel_1 = new JLabel("RGM");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 14, 99, 14);
		panel_2.add(lblNewLabel_1);
		
		txtNfRGM = new JTextField();
		txtNfRGM.setFont(new Font("Arial", Font.PLAIN, 13));
		txtNfRGM.setColumns(10);
		txtNfRGM.setBounds(60, 11, 146, 22);
		panel_2.add(txtNfRGM);
		
		lblNfNome = new JTextField();
		lblNfNome.setBackground(new Color(214, 214, 214));
		lblNfNome.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, Color.GRAY, new Color(128, 128, 128)));
		lblNfNome.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNfNome.setColumns(10);
		lblNfNome.setBounds(233, 12, 289, 22);
		panel_2.add(lblNfNome);
		
		lblNfCurso = new JTextField();
		lblNfCurso.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNfCurso.setColumns(10);
		lblNfCurso.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, Color.GRAY, new Color(128, 128, 128)));
		lblNfCurso.setBackground(new Color(214, 214, 214));
		lblNfCurso.setBounds(10, 44, 514, 22);
		panel_2.add(lblNfCurso);
		
		lblNewLabel_2 = new JLabel("Disciplina");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(10, 88, 99, 14);
		panel_2.add(lblNewLabel_2);
		
		lblNfDisciplina = new JComboBox();
		lblNfDisciplina.setModel(new DefaultComboBoxModel(new String[] {"Programação Orientada à Objetos", "Técnicas de Algoritmos", "Técnicas de Programação"}));
		lblNfDisciplina.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNfDisciplina.setBounds(89, 83, 433, 25);
		panel_2.add(lblNfDisciplina);
		
		lblNewLabel_3 = new JLabel("Semestre");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(10, 134, 99, 14);
		panel_2.add(lblNewLabel_3);
		
		lblcmbNfSemestre = new JComboBox();
		lblcmbNfSemestre.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		lblcmbNfSemestre.setFont(new Font("Arial", Font.PLAIN, 14));
		lblcmbNfSemestre.setBounds(89, 131, 117, 25);
		panel_2.add(lblcmbNfSemestre);
		
		lblNewLabel_4 = new JLabel("Nota");
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(233, 134, 99, 14);
		panel_2.add(lblNewLabel_4);
		
		lblcmbNfNotas = new JComboBox();
		lblcmbNfNotas.setModel(new DefaultComboBoxModel(new String[] {"0.0", "0.5", "1.0", "1.5", "2.0", "2.5", "3.0", "3.5", "4.0", "4.5", "5.0", "5.5", "6.0", "6.5", "7.0", "7.5", "8.0", "8.5", "9.0", "9.5", "10.0"}));
		lblcmbNfNotas.setFont(new Font("Arial", Font.PLAIN, 14));
		lblcmbNfNotas.setBounds(278, 131, 83, 25);
		panel_2.add(lblcmbNfNotas);
		
		lblNewLabel_5 = new JLabel("Faltas");
		lblNewLabel_5.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(384, 134, 99, 14);
		panel_2.add(lblNewLabel_5);
		
		btnNfConsultar = new JButton("Consultar");
		btnNfConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// =====================================
				
				// 1. Validação do botão Consultar
				// 1.1 Campo - RGM
				if (txtNfRGM.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Inválido - Insira o RGM do aluno!");
					txtNfRGM.requestFocus();
				} else {
					// 2. Método de Consultar
					try {
						AlunoDAO dao = new AlunoDAO();
						NotaFaltaDAO dao2 = new NotaFaltaDAO();
						Aluno aluno = dao.consultar(Integer.parseInt(txtNfRGM.getText()));
						Boletim boletim = dao2.consultar(Integer.parseInt(txtNfRGM.getText()));
						
						// 2.1 Labels relacionadas ao banco de Aluno
						lblNfNome.setText(aluno.getNomeAluno());
						lblNfCurso.setText(aluno.getCursoAluno());
						
						// 2.2 Campos relacionados ao banco de Notas/Boletim
		
				
						String disciplina = boletim.getDisciplina();
						if (disciplina.equals("Programação Orientada à Objetos")) {
							lblNfDisciplina.setSelectedIndex(0);
						} else if (disciplina.equals("Técnicas de Algoritmos")) {
							lblNfDisciplina.setSelectedIndex(1);
						} else {
							lblNfDisciplina.setSelectedIndex(2);
						}
						
						int semestre = boletim.getSemestre();
						if (semestre == 1) {
							lblcmbNfSemestre.setSelectedIndex(0);
						} else if (semestre == 2) {
							lblcmbNfSemestre.setSelectedIndex(1);
						}else if (semestre == 3) {
							lblcmbNfSemestre.setSelectedIndex(2);
						}else if (semestre == 4) {
							lblcmbNfSemestre.setSelectedIndex(3);
						}else if (semestre == 5) {
							lblcmbNfSemestre.setSelectedIndex(4);
						}else if (semestre == 6) {
							lblcmbNfSemestre.setSelectedIndex(5);
						}else if (semestre == 7) {
							lblcmbNfSemestre.setSelectedIndex(6);
						}else if (semestre == 8) {
							lblcmbNfSemestre.setSelectedIndex(7);
						}else if (semestre == 9) {
							lblcmbNfSemestre.setSelectedIndex(8);
						} else {
							lblcmbNfSemestre.setSelectedIndex(9);
						}

						double nota = boletim.getNota();
						if (nota == 0) {
							lblcmbNfNotas.setSelectedIndex(0);
						} else if (nota == 0.5) {
							lblcmbNfNotas.setSelectedIndex(1);
						}else if (nota == 1) {
							lblcmbNfNotas.setSelectedIndex(2);
						}else if (nota == 1.5) {
							lblcmbNfNotas.setSelectedIndex(3);
						}else if (nota == 2) {
							lblcmbNfNotas.setSelectedIndex(4);
						}else if (nota == 2.5) {
							lblcmbNfNotas.setSelectedIndex(5);
						}else if (nota == 3) {
							lblcmbNfNotas.setSelectedIndex(6);
						}else if (nota == 3.5) {
							lblcmbNfNotas.setSelectedIndex(7);
						}else if (nota == 4) {
							lblcmbNfNotas.setSelectedIndex(8);
						} else if (nota == 4.5) {
							lblcmbNfNotas.setSelectedIndex(9);
						}else if (nota == 5) {
							lblcmbNfNotas.setSelectedIndex(10);
						}else if (nota == 5.5) {
							lblcmbNfNotas.setSelectedIndex(11);
						}else if (nota == 6) {
							lblcmbNfNotas.setSelectedIndex(12);
						}else if (nota == 6.5) {
							lblcmbNfNotas.setSelectedIndex(13);
						}else if (nota == 7) {
							lblcmbNfNotas.setSelectedIndex(14);
						}else if (nota == 7.5) {
							lblcmbNfNotas.setSelectedIndex(15);
						}else if (nota == 8) {
							lblcmbNfNotas.setSelectedIndex(16);
						}else if (nota == 8.5) {
							lblcmbNfNotas.setSelectedIndex(17);
						}else if (nota == 9) {
							lblcmbNfNotas.setSelectedIndex(18);
						}else if (nota == 9.5) {
							lblcmbNfNotas.setSelectedIndex(19);
						}else {
							lblcmbNfNotas.setSelectedIndex(20);
						}
					
						lblNfFaltas.setText(String.valueOf(boletim.getFalta()));

					} catch (Exception e4) {
						e4.printStackTrace();
						JOptionPane.showMessageDialog(null, "Inválido - RGM inserido não está cadastrado!");
					}
					// =====================================
				}
			}
		});
		btnNfConsultar.setBounds(20, 175, 80, 80);
		panel_2.add(btnNfConsultar);
		
		btnNfAlterar = new JButton("Alterar");
		btnNfAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// =====================================
				// 1. Validação do botão Alterar

				// 1.1 Campo - RGM
				if (txtNfRGM.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Inválido - Insira o RGM do aluno!");
					txtNfRGM.requestFocus();
				} 

				// 1.2 Campo - Falta
				if (lblNfFaltas.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Inválido - Insira o número de faltas");
					lblNfFaltas.requestFocus();
				} 
				// 2. Método de Alterar
					
				try {
					Boletim boletim = new Boletim();
					boletim.setRgmAluno(Integer.parseInt(txtNfRGM.getText()));
					boletim.setDisciplina((String) lblNfDisciplina.getSelectedItem());
					boletim.setSemestre(Integer.parseInt((String) lblcmbNfSemestre.getSelectedItem()));
					boletim.setNota(Double.parseDouble((String) lblcmbNfNotas.getSelectedItem()));
					boletim.setFalta(Integer.parseInt(lblNfFaltas.getText()));
					
					NotaFaltaDAO dao = new NotaFaltaDAO();
					
					dao.alterar(boletim);
					JOptionPane.showMessageDialog(null, "Alterado com sucesso!");

				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Erro ao alterar: " + e1.getMessage());
				}
		// =====================================
			}
		});
		btnNfAlterar.setBounds(121, 175, 80, 80);
		panel_2.add(btnNfAlterar);
		
		btnNfDeletar = new JButton("Excluir");
		btnNfDeletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// =====================================
				// 1. Validação do botão Excluir

				// 1.1 Campo - RGM
				if (txtNfRGM.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Inválido - Insira o RGM do aluno!");
					txtNfRGM.requestFocus();
				} 

				// 2. Método de Excluir
					
				try {
					
					NotaFaltaDAO daoNota = new NotaFaltaDAO();
					
					daoNota.excluir(Integer.parseInt(txtNfRGM.getText()));
					JOptionPane.showMessageDialog(null, "Excluido com sucesso!");

				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Erro ao excluir: " + e1.getMessage());
				}
		// =====================================
			}
		});
		btnNfDeletar.setBounds(224, 175, 80, 80);
		panel_2.add(btnNfDeletar);
		
		btnNfLimpar = new JButton("Limpar");
		btnNfLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// =====================================
				// 1. Método de Limpar
				txtNfRGM.setText(null);
				lblNfNome.setText(null);
				lblNfCurso.setText(null);
				lblNfDisciplina.setSelectedIndex(0);
				lblcmbNfSemestre.setSelectedIndex(0);
				lblcmbNfNotas.setSelectedIndex(0);
				lblNfFaltas.setText(null);
				// =====================================
			}
		});
		btnNfLimpar.setBounds(328, 175, 80, 80);
		panel_2.add(btnNfLimpar);
		
		btnNfSalvar = new JButton("Salvar");
		btnNfSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// =====================================
				// 1. Validação do botão Salvar

				// 1.1 Campo - RGM
				if (txtNfRGM.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Inválido - Insira o RGM do aluno!");
					txtNfRGM.requestFocus();
				} 

				// 1.2 Campo - Falta
				if (lblNfFaltas.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Inválido - Insira o número de faltas");
					lblNfFaltas.requestFocus();
				} 
				// 2. Método de Salvar
					
				try {
					Boletim boletim = new Boletim();
					boletim.setRgmAluno(Integer.parseInt(txtNfRGM.getText()));
					boletim.setDisciplina((String) lblNfDisciplina.getSelectedItem());
					boletim.setSemestre(Integer.parseInt((String) lblcmbNfSemestre.getSelectedItem()));
					boletim.setNota(Double.parseDouble((String) lblcmbNfNotas.getSelectedItem()));
					boletim.setFalta(Integer.parseInt(lblNfFaltas.getText()));
					
					NotaFaltaDAO dao = new NotaFaltaDAO();
					
					dao.salvar(boletim);
					JOptionPane.showMessageDialog(null, "Salvo com sucesso!");

				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Erro ao Salvar: " + e1.getMessage());
				}
		// =====================================
			}
		});
		btnNfSalvar.setBounds(433, 175, 80, 80);
		panel_2.add(btnNfSalvar);
		
		lblNfFaltas = new JTextField();
		lblNfFaltas.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNfFaltas.setColumns(10);
		lblNfFaltas.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, Color.GRAY, new Color(128, 128, 128)));
		lblNfFaltas.setBackground(new Color(214, 214, 214));
		lblNfFaltas.setBounds(439, 132, 83, 22);
		panel_2.add(lblNfFaltas);
		
		panel_3 = new JPanel();
		tabbedPane.addTab("Boletim", null, panel_3, null);
		panel_3.setLayout(null);
		
		lblNewLabel_6 = new JLabel("RGM");
		lblNewLabel_6.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(10, 14, 99, 14);
		panel_3.add(lblNewLabel_6);
		
		txtBRGM = new JTextField();
		txtBRGM.setFont(new Font("Arial", Font.PLAIN, 13));
		txtBRGM.setColumns(10);
		txtBRGM.setBounds(67, 11, 139, 22);
		panel_3.add(txtBRGM);
		
		lblNome_1 = new JLabel("Nome");
		lblNome_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNome_1.setBounds(231, 14, 99, 14);
		panel_3.add(lblNome_1);
		
		txtBNome = new JTextField();
		txtBNome.setFont(new Font("Arial", Font.PLAIN, 13));
		txtBNome.setColumns(10);
		txtBNome.setBounds(280, 11, 248, 22);
		panel_3.add(txtBNome);
		
		lblCurso_1 = new JLabel("Curso");
		lblCurso_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblCurso_1.setBounds(10, 53, 127, 14);
		panel_3.add(lblCurso_1);
		
		txtBCurso = new JTextField();
		txtBCurso.setFont(new Font("Arial", Font.PLAIN, 13));
		txtBCurso.setColumns(10);
		txtBCurso.setBounds(67, 50, 461, 22);
		panel_3.add(txtBCurso);
		
		lblCampus_1 = new JLabel("Campus");
		lblCampus_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblCampus_1.setBounds(10, 94, 99, 14);
		panel_3.add(lblCampus_1);
		
		txtBCampus = new JTextField();
		txtBCampus.setFont(new Font("Arial", Font.PLAIN, 13));
		txtBCampus.setColumns(10);
		txtBCampus.setBounds(67, 92, 461, 22);
		panel_3.add(txtBCampus);
		
		spBtable = new JScrollPane();
		spBtable.setBounds(10, 130, 517, 100);
		panel_3.add(spBtable);
		
		table = new JTable();
		spBtable.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Disciplinas", "Notas", "Faltas"
			}
		));
		
		btBConsultar = new JButton("Consultar");
		btBConsultar.setFont(new Font("Arial", Font.PLAIN, 14));
		btBConsultar.setBounds(323, 236, 129, 30);
		panel_3.add(btBConsultar);
		
		btnBLimpar = new JButton("Limpar");
		btnBLimpar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnBLimpar.setBounds(97, 236, 129, 30);
		panel_3.add(btnBLimpar);
	}
}
