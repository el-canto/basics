import java.text.NumberFormat;
import java.util.Scanner;
//############################
//PRUEBA DE BRANCH GIT
//#########################
//############################
public class TipoDatoReferencial {


    public static void main(String[] args) {
        //  1. Definición de variable Tipo referencial. Es un objeto.
        //  Date ahora = new Date();
        //  System.out.println(ahora);

        //  2. Pruebas variables. En tipos primitivos cada variable se almacena en una posición de memoria

        //  byte x = 1;
        //  byte y = x;
        //  x = 2;
        //  System.out.println(y);

        //  3. Pruebas variables. En tipos referencia la variable almacena
        //  la posición de la memoria en la que existe el objeto

        //  Point punto1 = new Point(1,5);
        //  Point punto2 = punto1;
        //  punto1.x = 3;
        //  System.out.println(punto2.x);

        //  4. String. El String es un reference type, es un objeto. Pruebas métodos.
        // Maestría en printeo

        //  String mensajeTexto = "Hola, Pepito";
        //  System.out.println(mensajeTexto);
        //  System.out.println(mensajeTexto.length());
        //  System.out.println(mensajeTexto.indexOf("P"));
        //  boolean certeza = mensajeTexto.startsWith("Ho");
        //  System.out.println(mensajeTexto.startsWith("Hu"));
        //  System.out.println(certeza);
        //  System.out.println(mensajeTexto.replace("i", "u"));
        //  System.out.println(mensajeTexto);

        // 5. Arrays

        //  int [] numeros = new int[5];
        //  numeros [0] = 1;
        //  numeros [1] = 2;
        //  int [] numeros = { 2, 5, 4, 1, 3};
        //  System.out.println(numeros);
        //  System.out.println(Arrays.toString(numeros));
        //  Arrays.sort(numeros);
        //  System.out.println(Arrays.toString(numeros));

        //  int [][] numeros = new int [2][3];
        //  int [][] numeros = {{1, 2, 3}, {4, 5, 6}};
        //  System.out.println(Arrays.toString(numeros));
        //  System.out.println(Arrays.deepToString(numeros));

        //  double resultado = (double) 10 / (double) 3;
        //  System.out.println(resultado);
        //  int x = 6;
        //  x++;
        //  x += 2;
        //  x /= 3;
        //  x *= 5;
        //  System.out.println(x);

        //  short x = 1;
        //  int y = x + 5;
        //  System.out.println(y);
        //  y = 0;
        //  System.out.println(y);

        //  String texto = "234";
        //  int y = Integer.parseInt(texto) + 3;
        //  System.out.println(y);

        //  String texto = "287.99";
        //  Float y = Float.parseFloat(texto) + 7.1F;
        //  System.out.println(y);
        //  float redondeo = 1.789F;
        //  System.out.println(redondeo);
        //  System.out.println((int) Math.ceil(redondeo));
        //  System.out.println((int) Math.floor(redondeo));
        //  System.out.println(Math.random());
        //  System.out.println(Math.random() * 100);

        //  double aleatorio = Math.random();
        //  double aleatorio_entero = aleatorio * 100;
        //  System.out.println(aleatorio);
        //  System.out.println(aleatorio_entero);

        //  int aleatorio = (int) Math.round(Math.random() * 100);
        //  System.out.println(aleatorio);

        //  System.out.println(Math.round(Math.random() * 100));
        //  System.out.println((int) (Math.random()*100));

        //  Clase NumberFormat. Es abstracta. No se instancia con el comando new
        /*  NumberFormat dinero = NumberFormat.getCurrencyInstance();
        float euros = 2349739.789F;
        String moneda = dinero.format(euros);
        System.out.println(moneda);

        NumberFormat porcentaje = NumberFormat.getPercentInstance();
        String resultado = porcentaje.format(0.1);
        System.out.println(resultado);

        //  Encadenamiento de métodos
        System.out.println(NumberFormat.getPercentInstance().format(0.7));

        char caracter = '\u2122';
        System.out.println(caracter); */

        // Calculadora de hipotecas

        /* ->>>>>>>>>
        final byte MESES_POR_AÑO = 12;
        final byte PORCENTAJE = 100;


        Scanner entradasUsuario = new Scanner(System.in);

        System.out.print("Introduce el Principal: ");
        float Principal = entradasUsuario.nextFloat();
        //  NumberFormat PrincipalEuros = NumberFormat.getCurrencyInstance();
        //  System.out.println("El principal es " + PrincipalEuros.format(Principal));

        System.out.print("Introduce el interés anual: ");
        float InteresMensual = (entradasUsuario.nextFloat() / PORCENTAJE / MESES_POR_AÑO);

        System.out.print("Introduce número de años: ");
        int NumeroCoutas = entradasUsuario.nextInt() * MESES_POR_AÑO;

        //  System.out.println(NumeroCoutas);

        //  NumberFormat InteresMensualFormato = NumberFormat.getPercentInstance();
        double CuotaMensual = Principal * (
                (InteresMensual * Math.pow ( (1 + InteresMensual), NumeroCoutas)) )/
                (Math.pow((1+InteresMensual), NumeroCoutas) - 1);
        NumberFormat CuotaMensualFormato = NumberFormat.getCurrencyInstance();
        System.out.println("La cuota mensual es: " + CuotaMensualFormato.format(CuotaMensual));
        System.out.println("Yes un máquina");
        ->>>>>>>>>> */

        // Operadores lógicos

        //  int a = 10;
        //  int b = 0;
        //  System.out.println(a/b);

        // Sentencias switch
  /*
        String perfil = "admi99";
        switch (perfil) {
            case "admin999":
                System.out.println("Eres administrador");
                break;

            case "admi99":
                System.out.println("Eres invitado");
                break;

            default:
                System.out.println("No se sabe nada");

                //  Sentencias if

        /*if (perfil == "admi")

            System.out.println("Eres administrador");
        else if (perfil == "guest")
            System.out.println("Eres invitado");
        else
            System.out.println("No eres nadie");

         */
        /*
        // MEGAPROGRAMA ZIPRI Y ZRAPE
        Scanner entradaUsuario = new Scanner(System.in);
        System.out.print("Teclea un número entero: ");
        int número = entradaUsuario.nextInt();

        if (número % 3 == 0 && número % 5 == 0)
            System.out.println("ZipriZrape");
        else if (número % 3 == 0)
            System.out.println("Zipri");
        else if (número % 5 == 0)
            System.out.println("Zrape");
        else System.out.println("No das una, cagontal");
*/
        // Bucles for
        /* for (int i = 0; i < 5; i++)
            System.out.println("Aquí va un " + i);
        for (int i = 1; i <=5; i++)
        System.out.println("Aquí va un " + i);
*/
        //  Bucles while
        //  Bucles do while
        // Bucles

        /* #####################################################

        // Calculadora de hipotecas mejorada


        final byte MESES_POR_AÑO = 12;
        final byte PORCENTAJE = 100;


        Scanner entradasUsuario = new Scanner(System.in);


        float Principal = 0;
        float InteresAnual = 0;
        float InteresMensual = 0;
        int NumeroAños = 0;
        int NumeroCuotas = 0;

         // Primera pregunta con bucle do while
        do {
            System.out.print("Introduce el Principal (entre 1K y 1M): ");
            Principal = entradasUsuario.nextFloat();
        }
        while (Principal < 1000 || Principal > 1_000_000);


        // Segunda pregunta con bucle while infinito

        while (true) {
            System.out.print("Introduce el interés anual: ");
            InteresAnual = entradasUsuario.nextFloat() / PORCENTAJE;
            if (InteresAnual >= 0.01 && InteresAnual <= 0.3) {
                InteresMensual = InteresAnual / MESES_POR_AÑO;
                break;
            }
            System.out.println("El interés anual debe ser entre 1% y 30%");
        }
        /* do {
            System.out.print("Introduce el interés anual (entre 1% y 30%): ");
            InteresAnual = entradasUsuario.nextFloat() / PORCENTAJE ;
            System.out.println(InteresAnual);
        }
        while (InteresAnual < 0.01F || InteresAnual > 0.3F);
        float InteresMensual = InteresAnual / MESES_POR_AÑO;
        System.out.println(InteresMensual);
          */


        /*
        // Tercera pregunta con bucle do while
        do {
            System.out.print("Introduce número de años (5-50): ");
            NumeroAños = entradasUsuario.nextInt();
            System.out.println(NumeroAños);
        }
        while (NumeroAños < 5 || NumeroAños > 50);
        NumeroCuotas = NumeroAños * MESES_POR_AÑO;
        System.out.println(NumeroCuotas);

        double CuotaMensual = Principal
                * ((InteresMensual * Math.pow ( (1 + InteresMensual), NumeroCuotas)) )
                / (Math.pow((1+InteresMensual), NumeroCuotas) - 1);
        NumberFormat CuotaMensualFormato = NumberFormat.getCurrencyInstance();
        System.out.println("La cuota mensual es: " + CuotaMensualFormato.format(CuotaMensual));
        System.out.println("Yes un máquina");
            */

        // Seguimos para bingo. Calculadora con refactoring del cáculo de la fórmula.
        // Se mantienen los bucles while (true)



        //  int principal = 0;
        //  float interesAnual = 0;
        //  byte años = 0;

        //  Scanner entradasUsuario = new Scanner(System.in);

        /*
        while (true) {
            System.out.print("Introduce el principal: ");
            principal = entradasUsuario.nextInt();
            if (principal >= 25_000 && principal <= 1_000_000)
                break;
            System.out.println("El principal debe ser entre 50K y 1M");
        }

        while (true) {
              System.out.print("Introduce el interés anual: ");
              interesAnual = entradasUsuario.nextFloat();
                   if (interesAnual >= 1 && interesAnual <= 30)
                          break;
                   System.out.println("El interés anual debe estar entre 1% y 30%");
                    }
        while (true) {
            System.out.print("Introduce el número de años: ");
            años = entradasUsuario.nextByte();
            if (años >= 5 && años <=50)
                break;
            System.out.println("Mínimo 5, Máximo 50");


        }
*/



     // Calculadora con refactoring de preguntas al usuario


    int principal = (int) preguntasAlUsuario("Principal: ", 25_000, 1_000_000);
    float interesAnual = (float) preguntasAlUsuario("Interés anual: ", 1, 30);
    byte años = (byte) preguntasAlUsuario("Años: ", 5, 50);

    double hipoteca = calculoCuotaMensual(principal, interesAnual, años);

    NumberFormat hipotecaFormato = NumberFormat.getCurrencyInstance();
        System.out.println("La cuota mensual es: " + hipotecaFormato.format(hipoteca));
        System.out.println("Yes un máquina");
    }

    public static double preguntasAlUsuario(String pregunta, double min, double max) {
        double valor;
        Scanner respuestasUsuario = new Scanner(System.in);
        while (true) {
            System.out.print(pregunta);
            valor = respuestasUsuario.nextInt();
            if (valor >= min && valor <= max)
                break;
            System.out.println("Introduce un valor entre " + min + " y " + max);
        }
        return valor;

    }

    public static double calculoCuotaMensual(
            double principal,
            double interesAnual,
            double años) {

           final byte MESES_POR_AÑO = 12;
           final byte PORCENTAJE = 100;
           
           double interesMensual = interesAnual / MESES_POR_AÑO / PORCENTAJE;
           double numeroCuotas = años * MESES_POR_AÑO;

           double cuotaMensual = principal
                 * ((interesMensual * Math.pow ( (1 + interesMensual), numeroCuotas)) )
                 / (Math.pow((1+interesMensual), numeroCuotas) - 1);
           return cuotaMensual;
    }

    /*
    Cálculo del balance mensual restante

    B=P*[(1+c)^n - (1+c)^p]/[(1+c)^n - 1]

    B, balance
    P, principal
    c, interés mensual
    n, número de cuotas
    p, número de pagos hechos
     */

}





