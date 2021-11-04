public class App {
    public static void main(String[] args) throws Exception {
        int opcion = 0;
        Cliente cuentaBancaria = null;
        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));

        while(opcion < 4){
            if(cuentaBancaria != null){
                cuentaBancaria.verSaldo();
            }
            System.out.println("1. Abrir cuenta ");
            System.out.println("2. Depositar ");
            System.out.println("3. Retirar ");
            System.out.println("4. Salir ");
            try{
                opcion = Integer.parseInt(bufferReader.readLine());
                if(opcion == 1){
                    System.out.println("Indique el saldo inicial");
                    Double saldoInicial = Double.parseDouble(bufferReader.readLine());
                    cuentaBancaria = new Cliente(saldoInicial);
                    System.out.println("Indique el nombre");
                    cuentaBancaria.nombre = bufferReader.readLine();
                    System.out.println("Indique el apellido");
                    cuentaBancaria.apellido = bufferReader.readLine();
                }else if(opcion == 2 && cuentaBancaria != null){
                    System.out.println("Indique el monto del deposito");
                    cuentaBancaria.depositar(Double.parseDouble(bufferReader.readLine()));
                }else if(opcion == 3 && cuentaBancaria != null){
                    System.out.println("Indique el monto del retiro");
                    cuentaBancaria.retirar(Double.parseDouble(bufferReader.readLine()));
                }else if(cuentaBancaria == null){
                    System.out.println("No puede operar una cuenta sin abrirla primero");
                }
            }catch(Exception ex){
                System.out.println("Por favor seleccione una opcion de numeros entre 1 y 4");
            }
        }
    }
}