package test;

import java.time.LocalDate;

import negocio.PermisoABM;
import negocio.PersonaABM;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("1)");
		int id = 2;
		System.out.println(PersonaABM.getInstance().traer(id));
		
		System.out.println("2)");
		int idPermisoDiario = 3;
		System.out.println(PermisoABM.getInstance().traerPermisoDiario(idPermisoDiario));
		
		System.out.println("3)");
		System.out.println(PermisoABM.getInstance().traerPermisoDiario(idPermisoDiario).activo(LocalDate.of(2021, 4, 18)));
		
		System.out.println("4)");
		System.out.println(PermisoABM.getInstance().traerPermisoDiario(idPermisoDiario).activo(LocalDate.of(2021, 4, 19)));
		
		System.out.println("5)");
		int idPermisoPeriodo = 4;
		System.out.println(PermisoABM.getInstance().traerPermisoPeriodo(idPermisoPeriodo));
		
		System.out.println("6)");
		System.out.println(PermisoABM.getInstance().traerPermisoPeriodo(idPermisoPeriodo).activo(LocalDate.of(2021, 4, 25)));
		
		System.out.println("7)");
		System.out.println(PermisoABM.getInstance().traerPermisoPeriodo(idPermisoPeriodo).activo(LocalDate.of(2021, 5, 2)));
		
		System.out.println("8)");
		System.out.println(PermisoABM.getInstance().traerPermisoPeriodo(idPermisoPeriodo).activo(LocalDate.of(2021, 5, 16)));

	}

}
