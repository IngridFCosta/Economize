
package economize;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class TelaPrincipal extends JFrame implements ActionListener {
    private JPanel pnPrincipal,pnCadastro,pnBarra, pnSaldo,pnMeta,pnDespesa, pnLimite, pnCadDespesas, pnInformacao;
    private  JLabel lblUsuario,lbTitulo, lbSaldo, lbMeta, lbDespesa, lbLimite,
            lbSaldoVazio, lbMetaVazia,lbDespesaVazia, lbLimiteVazio,lbInfoSaldo,tituloInfo, lblInformacoes,lblInfoTipo, lblInfoMeta, lblInfoLimite;
    private JLabel lblLogo,lbCadUsuario, lbCadRenda,lbCadLimiteDespesa,lbCadMeta;
    private JTextField txfUsuario, txfRenda, txfLimiteDespesa, txfMeta;
    private JButton btnCadastrar;
    private JLabel lbNomeDesp, lbValorDesp,lbDescricao,lbTipoDesp;
    private JLabel lbInfoRenda, lbInfoDespTipo, lbInfoGastos, lbInfoMeta;
    private JTextField txNomeDesp, txValorDesp,txDescricao,txTipoDesp;
    private JButton btnCadastrarDesp ,btnExcluir, btnCalcular,btnMostraInfo;
    private DefaultTableModel modelo = new DefaultTableModel();
    private JTable tabelaDespesas;
    double pegarSaldo;
    
    public TelaPrincipal(){
        Usuario user=new Usuario();
        setTitle("Economize");
        setSize(800,740);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        
        pnPrincipal=new JPanel();
        setContentPane(pnPrincipal);
        pnPrincipal.setLayout(null);
      
        pnBarra=new JPanel();
        pnBarra.setBackground(new java.awt.Color(192,217,217));
        pnBarra.setSize(800,60);
        pnPrincipal.add(pnBarra);
        
        pnCadastro=new JPanel();
        pnCadastro.setBounds(0, 60, 800, 150);
        pnCadastro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnPrincipal.add(pnCadastro);
        pnCadastro.setLayout(null);
        pnCadastro.setVisible(true); 
        
        
        lbCadUsuario=new JLabel("Usuario");
        lbCadUsuario.setBounds(10, 20, 120, 40);
        lbCadUsuario.setOpaque(false);
        pnCadastro.add(lbCadUsuario);
        lbCadUsuario.setVisible(true);
        
        
        txfUsuario=new JTextField();
        txfUsuario.setBounds(90, 30, 120, 20);
        pnCadastro.add(txfUsuario);
        txfUsuario.setVisible(true);
        
        lbCadRenda=new JLabel("Renda");
        pnCadastro.add(lbCadRenda);
        lbCadRenda.setBounds(10, 50, 110, 20);
        setVisible(true);
        
        txfRenda=new JTextField();
        txfRenda.setVisible(true);
        txfRenda.setBounds(90, 50, 120, 20);
        pnCadastro.add(txfRenda);
        
       
        lbCadLimiteDespesa=new JLabel("Limite de despesas");
        pnCadastro.add(lbCadLimiteDespesa);
        lbCadLimiteDespesa.setBounds(240, 30, 150, 20);
        setVisible(true);
        txfLimiteDespesa=new JTextField();
        pnCadastro.add(txfLimiteDespesa);
        txfLimiteDespesa.setBounds(380, 30, 120, 20);
        setVisible(true);
        //lbLimiteDespesa.setBounds(200, 80, 110, 20);
        
        lbMeta=new JLabel("Meta de economia");
        pnCadastro.add(lbMeta);
        lbMeta.setBounds(240, 50, 150, 20);
        setVisible(true);
        
        txfMeta=new JTextField();
        pnCadastro.add(txfMeta);
        txfMeta.setBounds(380, 50, 120, 20);
        setVisible(true);
        
        
        // Botão cadastrar
        btnCadastrar=new JButton("Cadastrar");
        btnCadastrar.setBounds(510, 30, 120,40);
        pnCadastro.add(btnCadastrar);
        btnCadastrar.setVisible(true);
        
        
        lblUsuario=new JLabel();
        lblUsuario.setBounds(600,50,170,100);
        lblUsuario.setVisible(true);
        pnPrincipal.add(lblUsuario);
        
        ImageIcon logo=new ImageIcon("C:\\Users\\usuario\\Documents\\NetBeansProjects\\Economize\\src\\resource\\Economize.png");
        lbTitulo=new JLabel();
        lbTitulo.setIcon(new ImageIcon(logo.getImage().getScaledInstance(400, 70,30)));
        lbTitulo.setVisible(true);
        lbTitulo.setForeground(Color.WHITE);
        pnBarra.add(lbTitulo);
        
        //CRiação dos paineis e labels
        
        pnSaldo=new JPanel();
        pnSaldo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnSaldo.setBackground(new java.awt.Color(0,255,127));
        pnSaldo.setLayout(null);
        pnSaldo.setBounds(40, 130, 150, 70);
        pnSaldo.setVisible(false);
        pnPrincipal.add(pnSaldo);
       
        lbSaldo=new JLabel("Saldo");
        lbSaldo.setForeground(Color.WHITE);
        lbSaldo.setBounds(10,0,55,40);
        pnSaldo.add(lbSaldo);
        lbSaldoVazio=new JLabel();
        lbSaldoVazio.setForeground(Color.WHITE);
        lbSaldoVazio.setFont(new Font("",Font.BOLD, 18));
        lbSaldoVazio.setBounds(10,20,100,40);
        pnSaldo.add(lbSaldoVazio);
        
        pnMeta=new JPanel();
        pnMeta.setBackground(new java.awt.Color(52, 152, 219));
        pnMeta.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnMeta.setLayout(null);
        pnMeta.setBounds(230, 130, 150, 70);
        pnPrincipal.add(pnMeta);
        pnMeta.setVisible(false);
        lbMeta=new JLabel("Meta");
        lbMeta.setForeground(Color.WHITE);
        lbMeta.setBounds(10,0,55,40);
        pnMeta.add(lbMeta);
        lbMetaVazia=new JLabel();
        lbMetaVazia.setForeground(Color.WHITE);
        lbMetaVazia.setFont(new Font("",Font.BOLD, 18));
        lbMetaVazia.setBounds(10,20,100,40);
        pnMeta.add(lbMetaVazia);
        
       
        pnDespesa=new JPanel();
        pnDespesa.setBackground(new java.awt.Color(255,0,0));
        pnDespesa.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnDespesa.setLayout(null);
        pnDespesa.setBounds(420, 130, 150, 70);
        pnPrincipal.add(pnDespesa);
        pnDespesa.setVisible(false);
        lbDespesa=new JLabel("Despesas");
        lbDespesa.setBounds(10,0,60,40);
        lbDespesa.setForeground(Color.WHITE);
        pnDespesa.add(lbDespesa);
        lbDespesaVazia=new JLabel();
        lbDespesaVazia.setForeground(Color.WHITE);
        lbDespesaVazia.setFont(new Font("",Font.BOLD, 18));
        lbDespesaVazia.setBounds(10,20,100,40);
        pnDespesa.add(lbDespesaVazia);
        
        pnLimite=new JPanel();
        pnLimite.setBackground(new java.awt.Color(255,215,0));
        pnLimite.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnLimite.setLayout(null);
        pnLimite.setBounds(610, 130, 150, 70);
        pnPrincipal.add(pnLimite);
        pnLimite.setVisible(false);
        
        lbLimite=new JLabel("Limite");
        lbLimite.setBounds(10,1,55,40);
        lbLimite.setForeground(Color.WHITE);
        lbLimite.setFont(new Font("",Font.BOLD, 14));
        pnLimite.add(lbLimite);
        lbLimiteVazio=new JLabel();
        lbLimiteVazio.setFont(new Font("",Font.BOLD, 18));
        lbLimiteVazio.setBounds(10,20,100,40);
        lbLimiteVazio.setForeground(Color.WHITE);
        pnLimite.add(lbLimiteVazio);
        
        //Painel form de cadastro de despesas +tabela
        pnCadDespesas=new JPanel();
        pnCadDespesas.setBackground(Color.LIGHT_GRAY);
        pnCadDespesas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnCadDespesas.setLayout(null);
        pnCadDespesas.setBounds(0,190,800,300);
        pnCadDespesas.setVisible(true);
        pnPrincipal.add(pnCadDespesas);
      
        lbNomeDesp=new JLabel("Nome da despesa");
        lbNomeDesp.setBounds(20, 50, 110, 20);
        lbNomeDesp.setVisible(true);
        pnCadDespesas.add(lbNomeDesp);
        
        txNomeDesp=new JTextField();
        txNomeDesp.setBounds(140, 50, 180, 20);
        txNomeDesp.setVisible(true);
        pnCadDespesas.add(txNomeDesp);
        
        
        lbValorDesp=new JLabel("Valor da despesa");
        lbValorDesp.setBounds(20, 80, 110, 20);
        lbValorDesp.setVisible(true);
        pnCadDespesas.add(lbValorDesp);
        
        txValorDesp=new JTextField();
        txValorDesp.setBounds(140, 80, 180, 20);
        txValorDesp.setVisible(true);
        pnCadDespesas.add(txValorDesp);
        
        lbDescricao=new JLabel("Descriçao");
        lbDescricao.setBounds(20, 110, 110, 20);
        lbDescricao.setVisible(true);
        pnCadDespesas.add(lbDescricao);
    
        
        txDescricao=new JTextField();
        txDescricao.setBounds(140,110,180,20);
        txDescricao.setVisible(true);
        pnCadDespesas.add(txDescricao);
        
        lbTipoDesp=new JLabel("Tipo");
        lbTipoDesp.setBounds(20,140,110,20);
        lbTipoDesp.setVisible(true);
        pnCadDespesas.add(lbTipoDesp);
       
        
        txTipoDesp=new JTextField();
        txTipoDesp.setBounds(140,140,180,20);
        txTipoDesp.setVisible(true);
        pnCadDespesas.add(txTipoDesp);
        
        //btnCadastraDesp ,btnExcluir, btnCalcular,btnMostraInfo
        btnCadastrarDesp=new JButton("Adicionar"); //Jogar na tabela e mostrar infos no painel
        btnCadastrarDesp.setBounds(20,180,290,25);
        btnCadastrarDesp.setForeground(Color.WHITE);
        btnCadastrarDesp.setBackground(Color.green);
        btnCadastrarDesp.setVisible(true);
        pnCadDespesas.add(btnCadastrarDesp);
        
        btnExcluir=new JButton("Excluir");
        btnExcluir.setBounds(20,210,290,25);
        btnExcluir.setBackground(Color.red);
        btnExcluir.setForeground(Color.WHITE);
        btnExcluir.setVisible(true);
        pnCadDespesas.add(btnExcluir);
        
        btnMostraInfo=new JButton("Informações");
        btnMostraInfo.setBounds(20,240,290,25);
        btnMostraInfo.setBackground(new java.awt.Color(0,191,255));
        btnMostraInfo.setForeground(Color.WHITE);
        btnMostraInfo.setVisible(true);
        pnCadDespesas.add(btnMostraInfo);
        //Tabela
        tabelaDespesas = new JTable();
        tabelaDespesas.setBounds(350, 30, 405, 310);
        pnCadDespesas.add(tabelaDespesas);
        tabelaDespesas.setVisible(true);

        String colunas[] = {"Nome", "Valor", "Descrição", "Tipo"};

        DefaultTableModel modelo = (DefaultTableModel) (new DefaultTableModel() {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });
        modelo.setColumnIdentifiers(colunas);
        modelo.setRowCount(0);

        tabelaDespesas.setModel(modelo);
        tabelaDespesas.setShowGrid(false);
        tabelaDespesas.setFont(new Font("Times new Roman", Font.BOLD, 14));

        //JSCROLLPANE DA TABELA
        JScrollPane scrTabela = new JScrollPane(tabelaDespesas);
        setVisible(true);
        scrTabela.setBounds(350, 30, 390, 250);
        pnCadDespesas.add(scrTabela);
        
        pnInformacao=new JPanel();
        pnInformacao.setLayout(null);
        pnInformacao.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnPrincipal.add(pnInformacao);
        pnInformacao.setVisible(true);
        pnInformacao.setBounds(0,500,800,300);
      
        tituloInfo=new JLabel("Análise financeira");
        tituloInfo.setVisible(false);
        tituloInfo.setBounds(30,40,500,60);
        tituloInfo.setForeground(Color.BLACK);
        pnInformacao.add(tituloInfo);
        
        lbInfoSaldo=new JLabel();
        lbInfoSaldo.setVisible(false);
        lbInfoSaldo.setBounds(30,70,500,40);
        lbInfoSaldo.setForeground(Color.BLACK);
        pnInformacao.add(lbInfoSaldo);
        
        lblInformacoes=new JLabel();
        lblInformacoes.setVisible(false);
        lblInformacoes.setBounds(30,90,500,40);
        lblInformacoes.setForeground(Color.BLACK);
        pnInformacao.add(lblInformacoes);
        
        lblInfoTipo=new JLabel();
        lblInfoTipo.setVisible(false);
        lblInfoTipo.setBounds(30,110,500,40);
        lblInfoTipo.setForeground(Color.BLACK);
        pnInformacao.add(lblInfoTipo);
        
 
        lblInfoLimite=new JLabel();
        lblInfoLimite.setBounds(30,130,500,40);
        lblInfoLimite.setVisible(false);
        lblInfoLimite.setForeground(Color.BLACK);
        pnInformacao.add(lblInfoLimite);
         
        
        // Chamada de botões
          btnCadastrarDesp.addActionListener(this);
          btnExcluir.addActionListener(this);
          btnMostraInfo.addActionListener(this);
          btnCadastrar.addActionListener(this);
          
        
    }
    
    public void mostrarDados(Usuario user){
        lblUsuario.setText("Olá, "+user.getNomeUser());
        lbSaldoVazio.setText(String.format("R$ %.2f",user.getRenda()));
        lbMetaVazia.setText(String.format("R$ %.2f",user.getMeta()));
        lbLimiteVazio.setText(String.format("R$ %.2f",user.getLimiteDespesas()));      
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            Usuario usuario=new Usuario();
            Despesas despesa=new Despesas();
            usuario.setRenda(Double.parseDouble(txfRenda.getText().trim()));
            usuario.setLimiteDespesas(Double.parseDouble(txfLimiteDespesa.getText().trim()));
            usuario.setMeta(Double.parseDouble(txfMeta.getText().trim()));
            
        if(e.getSource() == btnCadastrar){
           usuario.setNomeUser(txfUsuario.getText().trim());
           usuario.setRenda(Double.parseDouble(txfRenda.getText().trim()));
           usuario.setLimiteDespesas(Double.parseDouble(txfLimiteDespesa.getText().trim()));
           usuario.setMeta(Double.parseDouble(txfMeta.getText().trim()));
           mostrarDados(usuario);
           pnCadastro.setVisible(false);

           pnSaldo.setVisible(true);
           pnDespesa.setVisible(true);
           pnLimite.setVisible(true);
           pnMeta.setVisible(true);
        }
        else if(e.getSource() == btnCadastrarDesp){
            despesa.setNome(txNomeDesp.getText().trim());
            despesa.setValor(Double.parseDouble(txValorDesp.getText().trim()));
            despesa.setDescricao(txDescricao.getText().trim());
            despesa.setTipo(txTipoDesp.getText().trim());
            usuario.addListaDespesas(despesa);
           
            //Adicionar os elementos cadastrados na lista a tabela 
            DefaultTableModel modelo = (DefaultTableModel) tabelaDespesas.getModel();
            for (Despesas desp:usuario.getLista()){
                String linhas[]= {despesa.getNome(),String.valueOf(despesa.getValor()),despesa.getDescricao(),despesa.getTipo()};
                modelo.addRow(linhas);
                txNomeDesp.setText(" ");
                txValorDesp.setText(" ");
                txDescricao.setText(" ");
                txTipoDesp.setText(" ");
                txNomeDesp.requestFocus();
            }
            double somaDespesas=0.0;
            double saldo=0.0;
            double percentual=0;
            double percentTipo=0;

            for (int i= 0; i< tabelaDespesas.getRowCount();i++) {
                somaDespesas+=Double.parseDouble(tabelaDespesas.getValueAt(i,1).toString());
                saldo=usuario.calcularSaldo(usuario.getRenda(),somaDespesas);
                percentual=usuario.percentualDespesas(somaDespesas);
                percentTipo=usuario.percentDespesasTipo(somaDespesas, despesa.getValor(), despesa.getNome());
                    
            }
                lbDespesaVazia.setText(String.valueOf(String.format(" %.2f",somaDespesas)));
                lbSaldoVazio.setText(String.valueOf(String.format("R$ %.2f",saldo)));
                lbInfoSaldo.setText(String.valueOf(String.format("Seu saldo é: %.2f",saldo)));
                lblInformacoes.setText(String.valueOf("Você gasta cerca de "+percentual+"% da sua renda"));
                lblInfoTipo.setText(String.valueOf("Você gasta cerca de "+percentTipo+"% da sua renda com "+despesa.getNome()));
               
                if (usuario.getLimiteDespesas()< somaDespesas){
                    lblInfoLimite.setText(String.valueOf("Você excedeu o limite de gastos em "+(usuario.getLimiteDespesas()-somaDespesas)+"reais"));
                }
                else{
                    lblInfoLimite.setText(String.valueOf("Você não excedeu o limite de gastos"));
                }
                
            }
         else if(e.getSource()==btnExcluir){
              ((DefaultTableModel) tabelaDespesas.getModel()).removeRow(tabelaDespesas.getSelectedRow());
              double diminuirDespesas=0;
              double somaSaldo=0;
            for (int i= 0; i< tabelaDespesas.getRowCount();i++) {
                diminuirDespesas=Double.parseDouble(tabelaDespesas.getValueAt(i,1).toString())-diminuirDespesas; 
                somaSaldo=usuario.getRenda()- diminuirDespesas;
                
            }
                lbDespesaVazia.setText(String.valueOf(String.format("R$ %.2f",diminuirDespesas)));
                lbSaldoVazio.setText(String.valueOf(String.format(" %.2f",somaSaldo)));    
            }
              
         else if(e.getSource()==btnMostraInfo){
            tituloInfo.setVisible(true);
            lbInfoSaldo.setVisible(true);
            lblInformacoes.setVisible(true);
            lblInfoTipo.setVisible(true);
            lblInfoLimite.setVisible(true);
         }
       
    }
      

    
    
}
