/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author tan-c
 */
public class GerenciaInterface {
   private JTextField textAutor,textTitulo, textEditora,  textAno, textEdicao,textISBN; 
   JButton btnNovo, btnSalvar, btnCancelar, btnExcluir, btnEditar; 
    
    
  public GerenciaInterface(JButton btnNovo, JButton btnSalvar, JButton btnCancelar, JButton btnExcluir, JButton btnEditar, 
            JTextField textAutor, JTextField textTitulo, JTextField textEditora, JTextField textAno, JTextField textEdicao, JTextField textISBN){
        this.btnNovo = btnNovo;
        this.btnSalvar = btnSalvar;
        this.btnCancelar = btnCancelar;
        this.btnExcluir = btnExcluir;
        this.textAutor = textAutor;
        this.textTitulo = textTitulo;
        this.textEditora = textEditora;
        this.textAno = textAno;
        this.textEdicao = textEdicao;
        this.btnEditar = btnEditar;
        this.textISBN = textISBN;}  
    
    public void manipulaInterface(String modo){
         switch(modo){
        case "Navegar":
        btnNovo.setEnabled(true);
        btnSalvar.setEnabled(false);
        btnCancelar.setEnabled(false);
        textAutor.setEnabled(false);
        textTitulo.setEnabled(false);
        textEditora.setEnabled(false);
        textISBN.setEnabled(false);
        textAno.setEnabled(false);
        textEdicao.setEnabled(false);
        btnEditar.setEnabled(false);
        btnExcluir.setEnabled(false);
            break;
        case "Novo":
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);
        textAutor.setEnabled(true);
        textTitulo.setEnabled(true);
        textEditora.setEnabled(true);
        textISBN.setEnabled(true);
        textAno.setEnabled(true);
        textEdicao.setEnabled(true);
       
           
            break;
        case "Editar": 
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);
        textAutor.setEnabled(true);
        textTitulo.setEnabled(true);
        textEditora.setEnabled(true);
        textISBN.setEnabled(true);
        textAno.setEnabled(true);
        textEdicao.setEnabled(true);
       
            break;
        case "Limpar":
        textTitulo.setText(null);
        textAutor.setText(null);
        textEditora.setText(null);
        textAno.setText(null);
        textEdicao.setText(null);
        textISBN.setText(null);
           ;
            break;
        default: System.out.println("Modo invalido");
            break;
    }
}
}
