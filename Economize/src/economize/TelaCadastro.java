
package economize;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

public class TelaCadastro extends JFrame implements ActionListener {
    private JPanel pnlCadastro;
    private  JLabel lbLogo;
    private JButton btnCadastrar;
    
    public TelaCadastro(){
        //Criação da Janela de cadastro 
        setTitle("Economize");
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        
       //Criação de´painel
        pnlCadastro=new JPanel();
        setContentPane(pnlCadastro);// add painel a tela 
        pnlCadastro.setSize(400, 400);
        pnlCadastro.setBorder(new BevelBorder(5));
        pnlCadastro.setLayout(null);
        pnlCadastro.setVisible(true);
       
        ImageIcon logo=new ImageIcon("C:\\Users\\usuario\\Documents\\NetBeansProjects\\Economize\\src\\resource\\Economize.png");
        lbLogo=new JLabel();
        lbLogo.setIcon(new ImageIcon(logo.getImage().getScaledInstance(300, 70,30)));
        pnlCadastro.add(lbLogo);
        lbLogo.setBounds(50, 100, 500,40);
        lbLogo.setVisible(true);
        
        btnCadastrar=new JButton("Entrar");
        pnlCadastro.add(btnCadastrar);
        btnCadastrar.setBounds(80, 180, 200,40);
        setVisible(true);
        
        btnCadastrar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
       if (e.getSource() == btnCadastrar ){
           TelaPrincipal telaP=new TelaPrincipal();
       }
       
    }
      
}


