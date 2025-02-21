import java.awt.BorderLayout;  // Importa a classe BorderLayout do pacote AWT para controle de layout com áreas (Norte, Sul, Leste, Oeste, Centro)
import java.awt.Component;  // Importa a classe Component, que é a classe base para todos os componentes gráficos em AWT
import java.awt.Dimension;  // Importa a classe Dimension, usada para definir o tamanho dos componentes gráficos
import java.awt.FlowLayout;  // Importa o FlowLayout, que organiza os componentes em linha, alinhando-os ao centro ou à esquerda/direita
import java.awt.event.ActionEvent;  // Importa a classe ActionEvent para capturar eventos de ação de botões
import java.awt.event.ActionListener;  // Importa a interface ActionListener para escutar eventos de ação, como cliques em botões

import javax.swing.Box;  // Importa a classe Box, usada para criar caixas de layout que podem organizar componentes vertical ou horizontalmente
import javax.swing.BoxLayout;  // Importa a classe BoxLayout, usada para definir o layout do tipo "caixa" para organizar os componentes
import javax.swing.JButton;  // Importa a classe JButton, que representa um botão clicável
import javax.swing.JFrame;  // Importa a classe JFrame, que representa a janela principal da aplicação
import javax.swing.JLabel;  // Importa a classe JLabel, usada para criar rótulos de texto na interface gráfica
import javax.swing.JPanel;  // Importa a classe JPanel, que é usada para criar painéis que organizam componentes
import javax.swing.JTextField;  // Importa a classe JTextField, usada para criar campos de texto onde o usuário pode digitar informações

public class Tela extends JFrame {  // Declara a classe Tela, que herda de JFrame, criando uma janela gráfica

	private JTextField inputField;  // Declara um campo de texto para o usuário inserir um número
	private JLabel resultLabel;  // Declara um rótulo onde o resultado será exibido
	private JButton roundButton, floorButton, cecilButton;  // Declara três botões para operações diferentes

	// Construtor responsável por configurar a janela da aplicação.
	// Criamos o construtor para centralizar a inicialização da interface gráfica e
	// garantir que todos os elementos da janela, como título, tamanho e
	// comportamento de fechamento, sejam definidos de maneira organizada e
	// consistente, antes de exibir a janela ao usuário.
	public Tela() {
	      // Configuração da janela
        setTitle("Conversão de Números");  // Define o título da janela como "Conversão de Números"
        setSize(400, 400);  // Define o tamanho da janela, 400x400 pixels
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Define que a aplicação será encerrada ao fechar a janela
        setLocationRelativeTo(null);  // Centraliza a janela na tela

        // Inicializa os componentes
        inputField = new JTextField(20);  // Cria um campo de texto com 20 colunas
        inputField.setPreferredSize(new Dimension(250, 40));  // Define o tamanho preferencial do campo de texto para 250x40 pixels

        resultLabel = new JLabel("Resultado: ");  // Cria um rótulo que exibe o texto "Resultado: "
        resultLabel.setPreferredSize(new Dimension(250, 40));  // Define o tamanho preferencial do rótulo para 250x40 pixels

        // Definindo os botões com tamanho maior e mais largo
        roundButton = new JButton("Usar Round");  // Cria um botão com o texto "Usar Round"
        roundButton.setPreferredSize(new Dimension(250, 50));  // Define o tamanho preferencial do botão para 250x50 pixels
        floorButton = new JButton("Usar Floor");  // Cria um botão com o texto "Usar Floor"
        floorButton.setPreferredSize(new Dimension(250, 50));  // Define o tamanho preferencial do botão para 250x50 pixels
        cecilButton = new JButton("Usar Cecil");  // Cria um botão com o texto "Usar Cecil"
        cecilButton.setPreferredSize(new Dimension(250, 50));  // Define o tamanho preferencial do botão para 250x50 pixels

        // Painel principal com FlowLayout para centralizar os componentes
        JPanel mainPanel = new JPanel();  // Cria um painel principal
        mainPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));  // Define o layout do painel como FlowLayout, com centralização e espaçamento
        mainPanel.add(inputField);  // Adiciona o campo de texto ao painel
        mainPanel.add(resultLabel);  // Adiciona o rótulo de resultado ao painel
        
        // Adicionando os botões diretamente ao painel principal com espaçamento
        mainPanel.add(roundButton);  // Adiciona o botão "Usar Round" ao painel
        mainPanel.add(floorButton);  // Adiciona o botão "Usar Floor" ao painel
        mainPanel.add(cecilButton);  // Adiciona o botão "Usar Cecil" ao painel

        // Adiciona o painel principal à janela
        add(mainPanel);  // Adiciona o painel ao JFrame (janela principal)
        
     // Configurar os botoes 
        
     // Ação do botão Round
        roundButton.addActionListener(new ActionListener() {  // Adiciona um ouvinte de evento de ação para o botão roundButton
            @Override
            public void actionPerformed(ActionEvent e) {  // Define o comportamento ao clicar no botão
                try {
                    double value = Double.parseDouble(inputField.getText());  // Tenta converter o texto digitado no campo para um número decimal (double)
                    resultLabel.setText("Resultado (Round): " + Math.round(value));  // Exibe o resultado da operação Math.round no rótulo
                } catch (NumberFormatException ex) {  // Se ocorrer erro de conversão (não for um número válido)
                    resultLabel.setText("Por favor, insira um número válido.");  // Exibe mensagem de erro
                }
            }
        });

        // Ação do botão Floor
        floorButton.addActionListener(new ActionListener() {  // Adiciona um ouvinte de evento de ação para o botão floorButton
            @Override
            public void actionPerformed(ActionEvent e) {  // Define o comportamento ao clicar no botão
                try {
                    double value = Double.parseDouble(inputField.getText());  // Tenta converter o texto digitado no campo para um número decimal (double)
                    resultLabel.setText("Resultado (Floor): " + Math.floor(value));  // Exibe o resultado da operação Math.floor no rótulo
                } catch (NumberFormatException ex) {  // Se ocorrer erro de conversão (não for um número válido)
                    resultLabel.setText("Por favor, insira um número válido.");  // Exibe mensagem de erro
                }
            }
        });
        

        // Ação do botão Cecil (exemplo simples de conversão, você pode personalizar)
        cecilButton.addActionListener(new ActionListener() {  // Adiciona um ouvinte de evento de ação para o botão cecilButton
            @Override
            public void actionPerformed(ActionEvent e) {  // Define o comportamento ao clicar no botão
                try {
                    double value = Double.parseDouble(inputField.getText());  // Tenta converter o texto digitado no campo para um número decimal (double)
                    // Exemplo de uma conversão fictícia "Cecil" (adicione sua lógica personalizada aqui)
                    double cecilValue = value * 2;  // Exemplo de multiplicação por 2 como conversão fictícia
                    resultLabel.setText("Resultado (Cecil): " + cecilValue);  // Exibe o resultado da "conversão Cecil" no rótulo
                } catch (NumberFormatException ex) {  // Se ocorrer erro de conversão (não for um número válido)
                    resultLabel.setText("Por favor, insira um número válido.");  // Exibe mensagem de erro
                }
            }
        });
	}
}
