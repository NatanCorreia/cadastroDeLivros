/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.Livro;


public class GerenciaLivros {
    private ArrayList<Livro> livros;
    private String modo;
    private boolean edit ;
    private JTextField textAutor,textTitulo, textEditora,  textAno, textEdicao,textISBN;
    private GerenciaInterface gerenciaInterface;
    private GerenciaTabela gerenciaTable;

    public GerenciaLivros(ArrayList<Livro> livros, boolean edit,  
            JTextField textAutor, JTextField textTitulo, JTextField textEditora, JTextField textAno, JTextField textEdicao, JTextField textIBSN,GerenciaTabela gerenciaTable, GerenciaInterface gerenciaInterface) {
        this.livros = livros;
        this.edit = edit;
        this.textAutor = textAutor;
        this.textTitulo = textTitulo;
        this.textEditora = textEditora;
        this.textAno = textAno;
        this.textEdicao = textEdicao;
        this.textISBN = textIBSN;
        this.gerenciaTable = gerenciaTable;
        this.gerenciaInterface = gerenciaInterface;
    }
    
    
    
    public void cadastrar(){
      if(!edit){
        Livro livroTemp = new Livro(textTitulo.getText(),textAutor.getText(),textEditora.getText(), 
                textISBN.getText(),Integer.parseInt(textAno.getText()), Integer.parseInt(textEdicao.getText()));
        livros.add(livroTemp);}
       
        else{
            int index = gerenciaTable.returnIndexSelectedRow();
            livros.get(index).setAutor(textAutor.getText());
            livros.get(index).setTitulo(textTitulo.getText());
            livros.get(index).setEditora(textEditora.getText());
            livros.get(index).setPublicacao(Integer.parseInt(textAno.getText()));
            livros.get(index).setEdicao(Integer.parseInt(textEdicao.getText()));
            livros.get(index).setIsbn(textISBN.getText());
        }
        gerenciaTable.loadTable();
        gerenciaInterface.manipulaInterface("Navegar");
        gerenciaInterface.manipulaInterface("Limpar");
        edit = false;  
    }
    
    
    public void excluir(){
        int index = gerenciaTable.returnIndexSelectedRow();
        livros.remove(index);
        gerenciaTable.loadTable();
    }
    public void editar(){
        edit = true;
        gerenciaInterface.manipulaInterface("Editar");
    }
    

    
}
