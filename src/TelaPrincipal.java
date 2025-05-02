import javax.swing.*;

public class TelaPrincipal {
    JFrame tela_principal = new JFrame("Tela Principal");

    public JFrame getTela_principal() {
        return tela_principal;
    }

    public void setTela_principal(JFrame tela_principal) {
        this.tela_principal = tela_principal;
    }

    public TelaPrincipal(){   //CONSTRUTOR
        tela_principal.setSize(400, 300);
        tela_principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JMenuBar Menubar = new JMenuBar(); // criando barra de menus

        JMenu menuVeiculo = new JMenu("Cadastrar Veículo"); //criando menu veiculo

        JMenu menuEmbalagem = new JMenu("Cadastrar Embalagem"); //criando menu embalagem

        Menubar.add(menuVeiculo); //adicionando menu na menu bar
        Menubar.add(menuEmbalagem); //adicionando menu na menu bar

        tela_principal.setJMenuBar(Menubar);
        tela_principal.setVisible(true);
    }
}
