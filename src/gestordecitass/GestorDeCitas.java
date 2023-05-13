/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestordecitass;

import entidades.Cita;
import entidades.Medico;
import entidades.Paciente;
import gestordecitas.pantallas.JFrameGestorDeCitas;
import java.util.ArrayList;

import java.util.List;

/**
 *
 * @author Fabritzio
 */
public class GestorDeCitas {
    
    public static List<Cita> ProgramacionCitas;
    public static List<Paciente> listaDePacientes;
    public static List<Medico> listaDeMedicos;
    public static List<String> HorasDisponibles=new ArrayList<>();
    public static List<String> FechasDisponibles=new ArrayList<>();
    
    
    public static void main(String[] args){
        
        //Genero las listas en blanco para todo el sistema hasta que se cierre
        ProgramacionCitas=new ArrayList<>();
        
        listaDePacientes=new ArrayList<>();
        
        listaDeMedicos=new ArrayList<>();
        
        HorasDisponibles.add("12:00pm");
        HorasDisponibles.add("12:30pm");
        HorasDisponibles.add("13:00pm");
        HorasDisponibles.add("13:30pm");
        HorasDisponibles.add("14:00pm");
        HorasDisponibles.add("14:30pm");
        HorasDisponibles.add("15:00pm");
        
        
        FechasDisponibles.add("12/05/2023");
        FechasDisponibles.add("13/05/2023");
        FechasDisponibles.add("14/05/2023");
        FechasDisponibles.add("15/05/2023");
        FechasDisponibles.add("16/05/2023");
        
        
        //Inicio la ventana principal de gestor de citas.
        
        JFrameGestorDeCitas framePrincipal= new JFrameGestorDeCitas();
        framePrincipal.setLocationRelativeTo(null); //Centra el Formulario
        framePrincipal.setVisible(true);//Propiedad que me permite mostrar la pantalla
                                         
        
        
    }
    
}
