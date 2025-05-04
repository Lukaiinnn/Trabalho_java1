import javax.swing.*;

public class CadastroVeiculo extends JInternalFrame {
    JTextField txtid = new JTextField();
    JTextField txtNome_do_veiculo = new JTextField();
    JTextField txtPlaca = new JTextField();
    JTextField txtModelo = new JTextField();
    JTextField txtaltura_interna = new JTextField();
    JTextField txtComprimento_interno = new JTextField();
    JTextField txtCapacidade_de_peso = new JTextField();
    JTextField txtObservacoes = new JTextField();
    JButton btnSalvar = new JButton("Salvar");
    JButton btnLimpar = new JButton("Limpar");
    public CadastroVeiculo() {
     super("Cadastro de Veículo", true, true,true,true);
        setSize(400, 200);
        setLayout(null);





        JLabel lblid = new JLabel("id:");
        JLabel lbNome_do_veiculo = new JLabel("Nome:");
        JLabel lblPlaca = new JLabel("Placa:");
        JLabel lblModelo = new JLabel("Modelo:");
        JLabel lblaltura_interna = new JLabel("Altura interna:");
        JLabel lbComprimento_interno = new JLabel("Comprimento interno:");
        JLabel lblcapacidade_de_peso = new JLabel("Capacidade de peso:");
        JLabel lblObservacoes = new JLabel("Observações:");


        txtid.setBounds(150, 20, 200, 25);
        txtNome_do_veiculo.setBounds(150, 60, 200, 25);
        txtPlaca.setBounds(150, 100, 200, 25);
        txtModelo.setBounds(150, 140, 200, 25);
        txtaltura_interna.setBounds(150, 180, 200, 25);
        txtComprimento_interno.setBounds(150, 220, 200, 25);
        txtCapacidade_de_peso.setBounds(150, 260, 200, 25);
        txtObservacoes.setBounds(150, 300, 200, 25);
        btnSalvar.setBounds(150, 340, 100, 30);
        btnLimpar.setBounds(250, 340, 100, 30);

        lblid.setBounds(20, 20, 120, 25);
        lbNome_do_veiculo.setBounds(20, 60, 120, 25);
        lblPlaca.setBounds(20, 100, 120, 25);
        lblModelo.setBounds(20, 140, 120, 25);
        lblaltura_interna.setBounds(20, 180, 120, 25);
        lbComprimento_interno.setBounds(20, 220, 120, 25);
        lblcapacidade_de_peso.setBounds(20, 260, 120, 25);
        lblObservacoes.setBounds(20, 300, 120, 25);


        add(lblid);
        add(lbNome_do_veiculo);
        add(lblPlaca);
        add(lblModelo);
        add(lblaltura_interna);
        add(lbComprimento_interno);
        add(lblcapacidade_de_peso);
        add(lblObservacoes);


        add(txtid);
        add(txtNome_do_veiculo);
        add(txtPlaca);
        add(txtModelo);
        add(txtaltura_interna);
        add(txtComprimento_interno);
        add(txtCapacidade_de_peso);
        add(txtObservacoes);

        add(btnSalvar);
        add(btnLimpar);

        btnSalvar.addActionListener(e -> validarESalvar());
        btnLimpar.addActionListener(e -> limparCampos());
    }
    public void limparCampos() {
        txtid.setText("");
        txtNome_do_veiculo.setText("");
        txtPlaca.setText("");
        txtModelo.setText("");
        txtaltura_interna.setText("");
        txtComprimento_interno.setText("");
        txtCapacidade_de_peso.setText("");
        txtObservacoes.setText("");
    }

    public void validarESalvar() {
        if (
                txtid.getText().trim().isEmpty() ||
                        txtNome_do_veiculo.getText().trim().isEmpty() ||
                        txtPlaca.getText().trim().isEmpty() ||
                        txtModelo.getText().trim().isEmpty() ||
                        txtaltura_interna.getText().trim().isEmpty() ||
                        txtComprimento_interno.getText().trim().isEmpty() ||
                        txtCapacidade_de_peso.getText().trim().isEmpty()
        ) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos obrigatórios!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }


        JOptionPane.showMessageDialog(this, "Dados salvos com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);


        limparCampos();
    }

}

