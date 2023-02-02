package cuentas;

import ccuenta.CCuenta;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class CCuentaTest {

	@Test
	void testMain() { 
        //Depuracion. Se detiene siempre
        CCuenta miCuenta = new CCuenta();
        System.out.println("Saldo inicial: " + miCuenta.dSaldo + " euros");
        //Depuracion. Provoca parada por ingreso con cantidad menor de 0
        miCuenta.ingresar(1);
        System.out.println("Saldo tras ingreso: " + miCuenta.dSaldo + " euros");
        miCuenta.ingresar(-10);
        System.out.println("Saldo tras ingreso: " + miCuenta.dSaldo + " euros");
	}

	@Test
	int testIngresar(int cantidad, int dSaldo) {
		int iCodErr;
            if (cantidad <0){
            System.out.println("No se puede ingresar una cantidad negativa");
            iCodErr = 1;
            }
            else if (cantidad == -3){
            System.out.println("Error detectable en pruebas de caja blanca");
            iCodErr = 2;
            }
            else{
            //Depuracion. Punto de parada. Solo en el 3 ingreso
            dSaldo = dSaldo + cantidad;
            iCodErr = 0;
            }
            //Depuracion. Punto de parada cuando la cantidad es menor de 0 
            return iCodErr;
	}

	@Test
	void testRetirar(int cantidad, int dSaldo) {
            if (cantidad <=0){
                    System.out.println("No se puede retirar una cantidad negativa");
                }
                else if (dSaldo < cantidad){
                    System.out.println("No hay suficiente saldo");
                }
                else{
	}

}
}