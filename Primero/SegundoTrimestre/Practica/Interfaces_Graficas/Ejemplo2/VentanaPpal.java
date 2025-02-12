package Primero.SegundoTrimestre.Practica.Interfaces_Graficas.Ejemplo2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class VentanaPpal extends JFrame implements ActionListener
{
	
	private JTextField campo;
	
	
	// CONSTRUCTOR CON FlowLayout
	public VentanaPpal()
	{
		this.setTitle("Mi ventana");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 400);
		this.setResizable(true);
		this.setLayout(new FlowLayout(FlowLayout.LEFT));   
		JButton boton = new JButton("Pulsame");   
		boton.addActionListener(this);
		campo = new JTextField(30);
		
		this.getContentPane().add(campo);
		this.getContentPane().add(boton); 
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		//this.campo.setText("Hola");
		System.out.println(this.campo.getText());
		
	}

	//  USANDO BORDERLAYOUT
	/*
	public VentanaPpal()
	   {
		   this.setTitle("Mi ventana");
		   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   this.setSize(600, 400);
	       this.setMinimumSize(new Dimension(300,200));
		   this.setResizable(true);
		   this.setLayout(new BorderLayout());   
		   JButton boton = new JButton("Pulsame arfav�");   
		   JTextField campo = new JTextField(30);
		   this.getContentPane().add(campo,BorderLayout.WEST);
		   this.getContentPane().add(boton,BorderLayout.NORTH); 

		   this.getContentPane().add(new JButton("No, p�lsame a m�"),
				                     BorderLayout.EAST);
		   this.getContentPane().add(new JButton("A MI"),
                   BorderLayout.SOUTH);
		   this.getContentPane().add(new JButton("No"),
                   BorderLayout.CENTER);
	   }*/

}
