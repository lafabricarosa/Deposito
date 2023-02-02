package cuentas;

public class CCuenta {

	public static void main(String[] args) {
        
        //Depuracion. Se detiene siempre
        CCuenta cuenta1 = new CCuenta();
        operativa_cuenta(cuenta1, 0);
    }

	private static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
		System.out.println("Saldo inicial: " + cuenta1.getdSaldo() + " euros");
        //Depuracion. Provoca parada por ingreso con cantidad menor de 0
        cuenta1.ingresar(-100);
        System.out.println("Saldo inicial: " + cuenta1.getdSaldo() + " euros");
        cuenta1.ingresar(100);
        System.out.println("Saldo tras ingreso: " + cuenta1.getdSaldo() + " euros");
        cuenta1.ingresar(200);
        System.out.println("Saldo tras ingreso: " + cuenta1.getdSaldo() + " euros");
        //Depuracion. Provoca parada con condicion de tercer ingreso
        cuenta1.ingresar(300);
        System.out.println("Saldo tras ingreso: " + cuenta1.getdSaldo() + " euros");
        cuenta1.retirar(50);
        System.out.println("Saldo tras retirada: " + cuenta1.getdSaldo() + " euros");
	}
    private double dSaldo;
    
    public int ingresar (double cantidad){
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
            setdSaldo(getdSaldo() + cantidad);
            iCodErr = 0;
            }
            //Depuracion. Punto de parada cuando la cantidad es menor de 0 
            return iCodErr;
    }
            
            public void retirar (double cantidad){
                if (cantidad <=0){
                    System.out.println("No se puede retirar una cantidad negativa");
                }
                else if (getdSaldo() < cantidad){
                    System.out.println("No hay suficiente saldo");
                }
                else{
                    
                }
            }

			private double getdSaldo() {
				return dSaldo;
			}

			private void setdSaldo(double dSaldo) {
				this.dSaldo = dSaldo;
			}
}

