package erick.hiberante.Main;

import java.awt.Component;
import java.util.List;
import java.util.Scanner;

import javax.swing.Icon;
import javax.swing.JOptionPane;

import org.hibernate.Session;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import erick.hibernate.controller.ClienteController;
import erick.hibernate.persona.Taller;
import erick.hibernate.util.HibernateUtil;



public class main {

	public static void main(String[] args) 
	{

		Component unComponentePadre = null;
		Icon unIcono = null;
	int opcion;
	do{
		
		 opcion = JOptionPane.showOptionDialog(
				   unComponentePadre,
				   "Seleccione opcion", 
				   "Selector de opciones",
				   JOptionPane.YES_NO_CANCEL_OPTION,
				   JOptionPane.QUESTION_MESSAGE,
				   unIcono,    // null para icono por defecto.
				   new Object[] { "Mostrar", "Ingresar", "Salir" },"Mostrar");
		switch (opcion +1)
		{
		case 1: buscar();
		        break;
		case 2: ingresar();
				break;
		case 3: JOptionPane.showMessageDialog(null, "Gracias por su atencion");
		      
		 }
		}while (opcion == 3);
	
	//JOptionPane.showMessageDialog(null, "Elija una opcion "+"\n"+"1. buscar por ciudad"+"\n"+"2. consultar todos"+"\n"+"3. Salir");
	}
	public static void buscar()
	{
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        List<Taller> result = (List<Taller>)session.createQuery("from Taller").list();
        session.getTransaction().commit();
        
		for(int i=0; i<result.size();i++)
		{
			 String uno = "Codigo: "+" ' "+result.get(i).getCodigo()+" ' \n"
					 +" Cedula: "+" ' "+result.get(i).getCedula()+" ' \n"
					 +" Nombre: "+" ' "+result.get(i).getNombre()+" ' \n"
					 +" Apellido: "+" ' "+result.get(i).getApellido()+" ' ";
        	JOptionPane.showMessageDialog(null, uno);

		}
	}
	public static void ingresar()
	{
		int codigo = 0;
		int cedula = 0;
		String Nombre;
		String Apellido;
		Scanner op = new Scanner(System.in);
		codigo = Integer.parseInt(JOptionPane.showInputDialog(codigo+" Inserte un codigo"));
		cedula = Integer.parseInt(JOptionPane.showInputDialog(cedula+" Inserte una Cedula"));
		Nombre = JOptionPane.showInputDialog("Inserte Un Nombre");
		Apellido = JOptionPane.showInputDialog("Inserte Un Apellido");
		ApplicationContext context=new GenericXmlApplicationContext("appContext.xml");
		ClienteController clienteController=context.getBean("clienteController",ClienteController.class);
		Taller taller=new Taller(codigo,cedula,Nombre,Apellido);
		clienteController.ingresar(taller);
		
	}
	
	
}
