import javax.swing.*;

public class TelaPrincipal {
    JFrame tela_principal = new JFrame("Tela Principal");

    public JFrame getTela_principal() {
        return tela_principal;
    }

    JDesktopPane desktopPane = new JDesktopPane();  // Cria o JDesktopPane

    public JDesktopPane getDesktopPane() {
        return desktopPane;
    }

    public void setDesktopPane(JDesktopPane desktopPane) {
        this.desktopPane = desktopPane;
    }

    public void setTela_principal(JFrame tela_principal) {
        this.tela_principal = tela_principal;
    }

    public TelaPrincipal(){   // CONSTRUTOR
        tela_principal.setSize(600, 400);
        tela_principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Criando barra de menus
        JMenuBar Menubar = new JMenuBar();

        // Criando menus
        JMenu menuVeiculo = new JMenu("Cadastrar Veículo");
        JMenu menuEmbalagem = new JMenu("Cadastrar Embalagem");

        // Adicionando os menus à barra de menus
        Menubar.add(menuVeiculo);
        Menubar.add(menuEmbalagem);

        // Configurando a barra de menus na tela principal
        tela_principal.setJMenuBar(Menubar);

        // Criando item de menu para cadastro de veículo
        JMenuItem itemCadastrarVeiculo = new JMenuItem("Cadastrar Veículo");
        menuVeiculo.add(itemCadastrarVeiculo); // Adiciona o item ao menu

        // Adicionando ação para o item de menu
        itemCadastrarVeiculo.addActionListener(e -> abrirTelaCadastroVeiculo()); // Chama a função ao clicar

        // Configurando a tela principal
        tela_principal.setContentPane(desktopPane);  // Adiciona o JDesktopPane
        tela_principal.setVisible(true);
    }

    // Função que cria e adiciona o CadastroVeiculo ao desktopPane
    private void abrirTelaCadastroVeiculo() {
        CadastroVeiculo cadastroVeiculo = new CadastroVeiculo();  // Cria a tela de cadastro de veículo

        // Adicionando o InternalFrame ao JDesktopPane
        desktopPane.add(cadastroVeiculo);

        // Tornando o InternalFrame visível
        cadastroVeiculo.setVisible(true);

        // Colocando o InternalFrame no topo
        try {
            cadastroVeiculo.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new TelaPrincipal();  // Cria e exibe a tela principal
    }
}
