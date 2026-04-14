package org.example;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TabPane tabPane;
    @FXML
    private Tab tab1;
    @FXML
    private Tab tab2;
    @FXML
    private Tab tab3;
    @FXML
    private Label lblTitle;
    @FXML
    private Label lblAtributo1;
    @FXML
    private Label lblAtributo2;
    @FXML
    private Label lblAtributo3;
    @FXML
    private TextField txtAtributo1;
    @FXML
    private TextField txtAtributo2;
    @FXML
    private TextField txtAtributo3;
    @FXML
    private Button btnCadastrar;
    @FXML
    private Button btnMetodo1;
    @FXML
    private Button btnMetodo2;
    @FXML
    private Button btnMetodo3;
    @FXML
    private TextArea txtTerminal;

    private String mode = "FARMACIA";

    // Farmacia
    private farmacia.Cliente farmCliente;
    private farmacia.Funcionario farmFuncionario;
    private farmacia.Remedio farmRemedio;

    // Feira
    private feira.Cliente feiraCliente;
    private feira.Funcionario feiraFuncionario;
    private feira.Fruta feiraFruta;

    // Salao
    private salao.Cliente salaoCliente;
    private salao.Funcionario salaoFuncionario;
    private salao.Secador salaoSecador;

    public void setMode(String newMode) {
        this.mode = newMode;
        if (mode.equals("FARMACIA"))
            lblTitle.setText("PDV.FARMADEV");
        else if (mode.equals("FEIRA"))
            lblTitle.setText("PDV.FEIRADEV");
        else if (mode.equals("SALAO"))
            lblTitle.setText("PDV.SALAODEV");

        if (mode.equals("FARMACIA")) {
            tab1.setText("Cliente");
            tab2.setText("Funcionário");
            tab3.setText("Remédio");
        } else if (mode.equals("FEIRA")) {
            tab1.setText("Cliente");
            tab2.setText("Funcionário");
            tab3.setText("Fruta");
        } else if (mode.equals("SALAO")) {
            tab1.setText("Cliente");
            tab2.setText("Funcionário");
            tab3.setText("Secador");
        }

        updateTabContext(tabPane.getSelectionModel().getSelectedIndex());
    }

    @FXML
    public void initialize() {
        PrintStream printStream = new PrintStream(new CustomOutputStream(txtTerminal));
        System.setOut(printStream);

        tabPane.getSelectionModel().selectedIndexProperty().addListener((observable, oldValue, newValue) -> {
            updateTabContext(newValue.intValue());
        });

        updateTabContext(0);
    }

    @FXML
    private void handleVoltar() throws IOException {
        App.setRoot("tela_inicial");
    }

    private void updateTabContext(int tabIndex) {
        txtAtributo1.clear();
        txtAtributo2.clear();
        txtAtributo3.clear();

        if (mode.equals("FARMACIA")) {
            switch (tabIndex) {
                case 0:
                    lblAtributo1.setText("CPF (Apenas números)");
                    lblAtributo2.setText("Nome Completo");
                    lblAtributo3.setText("Idade (Apenas números)");
                    btnCadastrar.setText("Cadastrar Cliente");
                    btnMetodo1.setText("Comprar");
                    btnMetodo2.setText("Reclamar");
                    btnMetodo3.setText("Andar");
                    break;
                case 1:
                    lblAtributo1.setText("CTPS (Apenas números)");
                    lblAtributo2.setText("Nome do Funcionário");
                    lblAtributo3.setText("Altura (Ex: 1.75)");
                    btnCadastrar.setText("Cadastrar Funcionário");
                    btnMetodo1.setText("Vender");
                    btnMetodo2.setText("Tirar Dúvida");
                    btnMetodo3.setText("Sair para Comer");
                    break;
                case 2:
                    lblAtributo1.setText("Nome do Remédio");
                    lblAtributo2.setText("Preço (Ex: 15.50)");
                    lblAtributo3.setText("Validade (Anos/Meses etc)");
                    btnCadastrar.setText("Cadastrar Remédio");
                    btnMetodo1.setText("Curar Paciente");
                    btnMetodo2.setText("Matar (Dose Errada)");
                    btnMetodo3.setText("Estragar");
                    break;
            }
        } else if (mode.equals("FEIRA")) {
            switch (tabIndex) {
                case 0:
                    lblAtributo1.setText("CPF (Apenas números)");
                    lblAtributo2.setText("Nome Completo");
                    lblAtributo3.setText("Idade (Apenas números)");
                    btnCadastrar.setText("Cadastrar Cliente");
                    btnMetodo1.setText("Comprar");
                    btnMetodo2.setText("Reclamar");
                    btnMetodo3.setText("Andar");
                    break;
                case 1:
                    lblAtributo1.setText("CTPS (Apenas números)");
                    lblAtributo2.setText("Nome do Funcionário");
                    lblAtributo3.setText("Altura (Ex: 1.75)");
                    btnCadastrar.setText("Cadastrar Funcionário");
                    btnMetodo1.setText("Vender");
                    btnMetodo2.setText("Tirar Dúvida");
                    btnMetodo3.setText("Sair para Comer");
                    break;
                case 2:
                    lblAtributo1.setText("Peso (Ex: 1.5)");
                    lblAtributo2.setText("Valor (Ex: 5.00)");
                    lblAtributo3.setText("Nome da Fruta");
                    btnCadastrar.setText("Cadastrar Fruta");
                    btnMetodo1.setText("Estragar");
                    btnMetodo2.setText("Comer");
                    btnMetodo3.setText("Madurar");
                    break;
            }
        } else if (mode.equals("SALAO")) {
            switch (tabIndex) {
                case 0:
                    lblAtributo1.setText("CPF (Apenas números)");
                    lblAtributo2.setText("Nome Completo");
                    lblAtributo3.setText("Idade (Apenas números)");
                    btnCadastrar.setText("Cadastrar Cliente");
                    btnMetodo1.setText("Comprar");
                    btnMetodo2.setText("Reclamar");
                    btnMetodo3.setText("Andar");
                    break;
                case 1:
                    lblAtributo1.setText("CTPS (Apenas números)");
                    lblAtributo2.setText("Nome do Funcionário");
                    lblAtributo3.setText("Altura (Ex: 1.75)");
                    btnCadastrar.setText("Cadastrar Funcionário");
                    btnMetodo1.setText("Vender");
                    btnMetodo2.setText("Tirar Dúvida");
                    btnMetodo3.setText("Sair para Comer");
                    break;
                case 2:
                    lblAtributo1.setText("Marca");
                    lblAtributo2.setText("Voltagem (Ex: 110/220)");
                    lblAtributo3.setText("Peso (Ex: 500)");
                    btnCadastrar.setText("Cadastrar Secador");
                    btnMetodo1.setText("Ligar");
                    btnMetodo2.setText("Desligar");
                    btnMetodo3.setText("Queimar");
                    break;
            }
        }
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    private void showError(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Erro de Validação");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    @FXML
    private void handleCadastrar() {
        int tabIndex = tabPane.getSelectionModel().getSelectedIndex();
        try {
            if (mode.equals("FARMACIA")) {
                if (tabIndex == 0) {
                    int cpf = Integer.parseInt(txtAtributo1.getText().trim());
                    String nome = txtAtributo2.getText().trim();
                    int idade = Integer.parseInt(txtAtributo3.getText().trim());
                    farmCliente = new farmacia.Cliente(cpf, nome, idade);
                    showAlert("Sucesso", "Cliente " + nome + " cadastrado com sucesso!");
                    System.out.println("-> CADASTRADO: Cliente " + nome);
                } else if (tabIndex == 1) {
                    int ctps = Integer.parseInt(txtAtributo1.getText().trim());
                    String nome = txtAtributo2.getText().trim();
                    double altura = Double.parseDouble(txtAtributo3.getText().trim().replace(",", "."));
                    farmFuncionario = new farmacia.Funcionario(ctps, nome, altura);
                    showAlert("Sucesso", "Funcionário " + nome + " cadastrado!");
                    System.out.println("-> CADASTRADO: Funcionário " + nome);
                } else if (tabIndex == 2) {
                    String nome = txtAtributo1.getText().trim();
                    double preco = Double.parseDouble(txtAtributo2.getText().trim().replace(",", "."));
                    double val = Double.parseDouble(txtAtributo3.getText().trim().replace(",", "."));
                    farmRemedio = new farmacia.Remedio(nome, preco, val);
                    showAlert("Sucesso", "Remédio " + nome + " cadastrado!");
                    System.out.println("-> CADASTRADO: Remédio " + nome);
                }
            } else if (mode.equals("FEIRA")) {
                if (tabIndex == 0) {
                    int cpf = Integer.parseInt(txtAtributo1.getText().trim());
                    String nome = txtAtributo2.getText().trim();
                    int idade = Integer.parseInt(txtAtributo3.getText().trim());
                    feiraCliente = new feira.Cliente(cpf, nome, idade);
                    showAlert("Sucesso", "Cliente " + nome + " cadastrado!");
                    System.out.println("-> CADASTRADO: Cliente " + nome);
                } else if (tabIndex == 1) {
                    int ctps = Integer.parseInt(txtAtributo1.getText().trim());
                    String nome = txtAtributo2.getText().trim();
                    double altura = Double.parseDouble(txtAtributo3.getText().trim().replace(",", "."));
                    feiraFuncionario = new feira.Funcionario(ctps, nome, altura);
                    showAlert("Sucesso", "Funcionário " + nome + " cadastrado!");
                    System.out.println("-> CADASTRADO: Funcionário " + nome);
                } else if (tabIndex == 2) {
                    double peso = Double.parseDouble(txtAtributo1.getText().trim().replace(",", "."));
                    double valor = Double.parseDouble(txtAtributo2.getText().trim().replace(",", "."));
                    String nome = txtAtributo3.getText().trim();
                    feiraFruta = new feira.Fruta(peso, valor, nome);
                    showAlert("Sucesso", "Fruta " + nome + " cadastrada!");
                    System.out.println("-> CADASTRADO: Fruta " + nome);
                }
            } else if (mode.equals("SALAO")) {
                if (tabIndex == 0) {
                    int cpf = Integer.parseInt(txtAtributo1.getText().trim());
                    String nome = txtAtributo2.getText().trim();
                    int idade = Integer.parseInt(txtAtributo3.getText().trim());
                    salaoCliente = new salao.Cliente(cpf, nome, idade);
                    showAlert("Sucesso", "Cliente " + nome + " cadastrado!");
                    System.out.println("-> CADASTRADO: Cliente " + nome);
                } else if (tabIndex == 1) {
                    int ctps = Integer.parseInt(txtAtributo1.getText().trim());
                    String nome = txtAtributo2.getText().trim();
                    double altura = Double.parseDouble(txtAtributo3.getText().trim().replace(",", "."));
                    salaoFuncionario = new salao.Funcionario(ctps, nome, altura);
                    showAlert("Sucesso", "Funcionário " + nome + " cadastrado!");
                    System.out.println("-> CADASTRADO: Funcionário " + nome);
                } else if (tabIndex == 2) {
                    String marca = txtAtributo1.getText().trim();
                    int voltagem = Integer.parseInt(txtAtributo2.getText().trim());
                    int peso = Integer.parseInt(txtAtributo3.getText().trim());
                    salaoSecador = new salao.Secador(marca, voltagem, peso);
                    showAlert("Sucesso", "Secador " + marca + " cadastrado!");
                    System.out.println("-> CADASTRADO: Secador " + marca);
                }
            }
        } catch (Exception e) {
            showError("Erro: Verifique se os dados estão corretos. " + e.getMessage());
        }
    }

    @FXML
    private void handleMetodo1() {
        int tabIndex = tabPane.getSelectionModel().getSelectedIndex();
        if (mode.equals("FARMACIA")) {
            if (tabIndex == 0 && farmCliente != null)
                farmCliente.comprar();
            else if (tabIndex == 1 && farmFuncionario != null)
                farmFuncionario.vende();
            else if (tabIndex == 2 && farmRemedio != null)
                farmRemedio.curar();
            else
                showError("Cadastre o objeto primeiro.");
        } else if (mode.equals("FEIRA")) {
            if (tabIndex == 0 && feiraCliente != null)
                feiraCliente.comprar();
            else if (tabIndex == 1 && feiraFuncionario != null)
                feiraFuncionario.vende();
            else if (tabIndex == 2 && feiraFruta != null)
                feiraFruta.estragar();
            else
                showError("Cadastre o objeto primeiro.");
        } else if (mode.equals("SALAO")) {
            if (tabIndex == 0 && salaoCliente != null)
                salaoCliente.comprar();
            else if (tabIndex == 1 && salaoFuncionario != null)
                salaoFuncionario.vende();
            else if (tabIndex == 2 && salaoSecador != null)
                salaoSecador.ligar();
            else
                showError("Cadastre o objeto primeiro.");
        }
    }

    @FXML
    private void handleMetodo2() {
        int tabIndex = tabPane.getSelectionModel().getSelectedIndex();
        if (mode.equals("FARMACIA")) {
            if (tabIndex == 0 && farmCliente != null)
                farmCliente.reclamar();
            else if (tabIndex == 1 && farmFuncionario != null)
                farmFuncionario.tiraduvida();
            else if (tabIndex == 2 && farmRemedio != null)
                farmRemedio.matar();
            else
                showError("Cadastre o objeto primeiro.");
        } else if (mode.equals("FEIRA")) {
            if (tabIndex == 0 && feiraCliente != null)
                feiraCliente.reclamar();
            else if (tabIndex == 1 && feiraFuncionario != null)
                feiraFuncionario.tiraduvida();
            else if (tabIndex == 2 && feiraFruta != null)
                feiraFruta.comer();
            else
                showError("Cadastre o objeto primeiro.");
        } else if (mode.equals("SALAO")) {
            if (tabIndex == 0 && salaoCliente != null)
                salaoCliente.reclamar();
            else if (tabIndex == 1 && salaoFuncionario != null)
                salaoFuncionario.tiraduvida();
            else if (tabIndex == 2 && salaoSecador != null)
                salaoSecador.desligar();
            else
                showError("Cadastre o objeto primeiro.");
        }
    }

    @FXML
    private void handleMetodo3() {
        int tabIndex = tabPane.getSelectionModel().getSelectedIndex();
        if (mode.equals("FARMACIA")) {
            if (tabIndex == 0 && farmCliente != null)
                farmCliente.andar();
            else if (tabIndex == 1 && farmFuncionario != null)
                farmFuncionario.come();
            else if (tabIndex == 2 && farmRemedio != null)
                farmRemedio.estragar();
            else
                showError("Cadastre o objeto primeiro.");
        } else if (mode.equals("FEIRA")) {
            if (tabIndex == 0 && feiraCliente != null)
                feiraCliente.andar();
            else if (tabIndex == 1 && feiraFuncionario != null)
                feiraFuncionario.come();
            else if (tabIndex == 2 && feiraFruta != null)
                feiraFruta.madurar();
            else
                showError("Cadastre o objeto primeiro.");
        } else if (mode.equals("SALAO")) {
            if (tabIndex == 0 && salaoCliente != null)
                salaoCliente.andar();
            else if (tabIndex == 1 && salaoFuncionario != null)
                salaoFuncionario.come();
            else if (tabIndex == 2 && salaoSecador != null)
                salaoSecador.queimar();
            else
                showError("Cadastre o objeto primeiro.");
        }
    }

    private class CustomOutputStream extends OutputStream {
        private TextArea console;

        public CustomOutputStream(TextArea console) {
            this.console = console;
        }

        @Override
        public void write(int b) throws IOException {
            Platform.runLater(() -> console.appendText(String.valueOf((char) b)));
        }

        @Override
        public void write(byte[] b, int off, int len) throws IOException {
            String str = new String(b, off, len);
            Platform.runLater(() -> console.appendText(str));
        }
    }
}
