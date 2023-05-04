# Projeto destinado à matéria de Programação Orientada à Objetos lecionada pelo Prof. Jadir Mendonça.

A explicação do projeto será dividida em três partes, sendo elas: 1) funcionamento das telas, 2) funcionamento do menu e 3) conexão entre os pacotes e classes.

## 1. Funcionamento das Telas
### 1.1 Dados Pessoais
![image](https://user-images.githubusercontent.com/62815330/236336289-68d8cb1e-e32e-455e-bfa9-90973c231e6f.png)
![image](https://user-images.githubusercontent.com/62815330/236336323-730cf922-611b-4c97-8b7a-75380b679e98.png)
 
Nesta tela, o usuário irá iniciar o cadastro do aluno, que é divido em dados pessoais e curso. Na parte de Dados Pessoais, é necessário inserir um RGM (Registro Geral de Matrícula) com 8 dígitos – que será a chave primária de ambas tabelas do banco de dados, nome completo, data de nascimento, CPF, e-mail, endereço, município, estado e celular. 
É importante ressaltar que os campos de data de nascimento, CPF e celular são do tipo JFormattedTextField, que possibilita criar uma “máscara” em que permite a visualização dos caracteres especiais pré-programados. É importante lembrar, que esses caracteres especiais não são enviados para o banco de dados. Além disso, é utilizado o campo de JComboBox para criar várias seleções pré-programadas para selecionar o estado. Os demais campos são os JTextField.
O único botão disponível nessa tela é o de limpar, que limpa os campos dos dados pessoais e os campos da aba “Cursos”.
Ademais, quando se exclui um aluno do sistema, o seu boletim também é excluído. Portanto, é necessário um cuidado a mais com essa parte do sistema.

### 1.2 Cursos
![image](https://user-images.githubusercontent.com/62815330/236336368-1fa0d74f-ff58-40c2-8473-6ac8166467f6.png)
![image](https://user-images.githubusercontent.com/62815330/236336375-0d77ba0f-bf7c-440f-b852-46c4b38e82ed.png)
 
Na aba “Cursos”, o usuário escolhe o curso do aluno, o campus e o período. O campo do curso e de campus são do tipo JComboBox, que permite escolher opções pré-programadas do sistema. Já o campo de período é do tipo JRadioButton, que realiza o preenchimento via checkbox.
Nesta tela, temos a opção de salvar, alterar, consultar, deletar e limpar os campos da tela. Os primeiros 4 botões fazem alterações no banco de dados e o último apenas limpa os campos dos dados pessoais e os campos da tela “Cursos”. Na opção de salvar e alterar, é necessário preencher todos os campos, já o de consultar e de deletar apenas precisa preencher o RGM.
É importante avisar, que nessas duas telas as interações são realizadas na tbAluno.

### 1.3 Notas e Faltas
![image](https://user-images.githubusercontent.com/62815330/236336438-ec45b788-19f5-4403-acca-807605cc9238.png)
![image](https://user-images.githubusercontent.com/62815330/236336455-1865c669-eaf1-40f6-a238-39b948c53a2d.png)
 
Na tela de Notas e Faltas, o usuário cadastra as notas e faltas de uma determinada disciplina que o aluno está cursando. É necessário inserir o RGM – campo JTextField -, disciplina, semestre e notas – ambas campo JComboBox – e as faltas – campo JTextField.
Através dos botões consultar, alterar, excluir e salvar podemos fazer alterações na tabela “tbBoletim”, além de puxar informações como o nome e o curso da tabela “tbAluno”. Para consultar alguma informação ou excluir, necessita-se apenas do RGM. Já os botões alterar e salvar, necessita-se de todas as informações preenchidas. O botão de limpar apenas reseta todos os campos do Notas e Faltas.

### 1.4 Boletim
![image](https://user-images.githubusercontent.com/62815330/236336481-20c0e9f5-6771-49a8-a56a-64e9c47b51c7.png)
![image](https://user-images.githubusercontent.com/62815330/236336494-3cb84fe2-b896-458b-b7a5-81f2085ac30f.png)
 
Por fim, na tela Boletim, geramos o boletim através da consulta do RGM do aluno. Nessa tela, temos os campos RGM, nome, curso, campus – sendo todos do campo JTextField – e a tabela que mostra o boletim – campo JTable.
Aqui, só tempos um botão de consultar que é ligado as tabelas “tbAluno” e “tbBoletim” e o botão de limpar os campos.
É importante lembrar que as colunas da JTable são redimensionáveis.

## 2. Funcionamento do menu
### 2.1 Menu - Aluno
![image](https://user-images.githubusercontent.com/62815330/236336526-0f8d846d-6f30-456e-b23f-8792d52304ff.png)
![image](https://user-images.githubusercontent.com/62815330/236336534-585ab6b1-7e78-4207-b7ff-e3332465b1d6.png)
  
Na parte “Aluno” do menu, tem os mesmos botões da aba “Cursos” com exceção do limpar. Ambos as opções tem a mesma programação dos botões de cadastro e manuseio de dados da aba “Curso”, fazendo alterações na tabela “tbAluno”. Além disso, tem o botão de sair que aciona um JOptionPane.showOptionDialog, disponibilizando as opções de sair ou não do sistema.
Os atalhos de salvar é “Ctrl + S” e o de sair é “Shift + R”.

### 2.2  Menu - Notas e Faltas
![image](https://user-images.githubusercontent.com/62815330/236336594-d97c913a-a747-44f8-ac4f-4bfd0a120770.png)
 
Já a parte “Notas e Faltas” do menu realiza as mesmas operações de seus botões equivalentes da aba “Notas e faltas”, realizando apenas alterações na tabela “tbBoletim”. 
O atalho de alterar é “Ctrl + A”.

### 2.3 Menu – Ajuda
![image](https://user-images.githubusercontent.com/62815330/236336611-dafa9d71-0020-44da-8d41-5dcd69562ea8.png)
![image](https://user-images.githubusercontent.com/62815330/236336622-3ff0c6d6-8eb1-4f68-803e-faf06be074c8.png)
 
Na última parte “Ajuda” do menu, apenas aparece a opção de abrir o sobre por meio do JOptionPane.showMessageDialog. Este abre uma breve mensagem, que explica o sistema de cadastro de alunos.

## 3. Conexão entre as os pacotes e classes
![image](https://user-images.githubusercontent.com/62815330/236336648-4ba4262b-cece-4c79-b046-96fec6d50b5e.png)

A divisão de pacotes é realizada da seguinte forma: 1) dao, 2) model, 3) util e 4) view. Esta divisão é baseada nos parâmetros MVC.
 
### 3.1 Pacote DAO
![image](https://user-images.githubusercontent.com/62815330/236336662-912f8397-892b-4ce8-aafc-67a1eb0d494a.png)
 
No pacote DAO, é realizado todas as programações de SQL para fazer as operações de salvar, consultar, alterar e excluir dados das tabelas. Dessa forma, é possível – por meio da conexão do banco de dados com o sistema – fazer os botões funcionarem e terem acesso aos dados passados.

### 3.2 Pacote Model
![image](https://user-images.githubusercontent.com/62815330/236336679-03bde1fd-00c3-4634-b50b-a17d4566ea48.png)
 
No pacote Model, é realizado a setagem dos atributos, construtores e getters e setters. Esses são responsáveis por guardar temporariamente as informações dos objetos criados pelo sistema. Assim, é possível enviar as informações para os demais pacotes.

### 3.3 Pacote Util
![image](https://user-images.githubusercontent.com/62815330/236336713-e6661a3d-0e7f-482e-982a-672601a26e36.png)
 
No pacote Util, realiza-se a conexão do banco de dados com o sistema. Além disso, é feito o fechamento dessa conexão.
Através desse pacote, podemos limitar o acesso do sistema com login e senha.

### 3.4 Pacote View
![image](https://user-images.githubusercontent.com/62815330/236336734-7a9c2eec-332e-4da6-8958-e16caa746d4c.png)
 
Por fim, o pacote View, contém o JFrame o qual é responsável pela interface gráfica do projeto. Ademais, nessa parte é realizado a programação dos botões para chamar as classes do pacote DAO e Model. Esta programação manual dos botões está separada no código por meio de comentários que limitam esses blocos.
