/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.Livro;

/**
 *
 * @author tan-c
 */
public class GerenciaTabela {
    private ArrayList<Livro> livros;
    private JTable tableLivros;
    private JTextField textAutor,textTitulo, textEditora,  textAno, textEdicao,textISBN;
    
    public GerenciaTabela(ArrayList livros, JTextField textAutor, JTextField textTitulo, JTextField textEditora, JTextField textAno, JTextField textEdicao, JTextField textIBSN,JTable tableLivros){
    this.livros = livros;
    this.tableLivros = tableLivros;
    this.textAutor = textAutor;
    this.textTitulo = textTitulo;
    this.textEditora = textEditora;
    this.textAno = textAno;
    this.textEdicao = textEdicao;
    this.textISBN = textIBSN;
    this.tableLivros = tableLivros;
    }
    
    
    public void loadTable(){
    
DefaultTableModel modelo = new DefaultTableModel( new Object[]{"Título","Autor","Editora","Ano Pub","Edição","ISBN"},0);
tableLivros.setModel(modelo);
for(int i = 0; i<livros.size(); i++){
modelo.addRow(new Object[]{livros.get(i).getTitulo(),livros.get(i).getAutor(), livros.get(i).getEditora(), 
    livros.get(i).getPublicacao(),livros.get(i).getEdicao(),livros.get(i).getIsbn()});

}
}
    public void tableToTextField(){
       int index = tableLivros.getSelectedRow();
       if(index>=0 && index<= livros.size() ){
       Livro livroTemp = livros.get(index);
        textTitulo.setText(livroTemp.getTitulo());
        textAutor.setText(livroTemp.getAutor());
        textEditora.setText(livroTemp.getEditora());
        textAno.setText(String.valueOf(livroTemp.getPublicacao()));
        textEdicao.setText(String.valueOf(livroTemp.getEdicao()));
        textISBN.setText(livroTemp.getIsbn());
       }
    }
    
    public int returnIndexSelectedRow(){
    return tableLivros.getSelectedRow();
    }
}
