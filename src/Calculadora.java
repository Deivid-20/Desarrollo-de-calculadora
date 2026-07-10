void main() {
    IO.println("------- PUCE -------");
    IO.println("-".repeat(20));

    boolean continuar = true;

    while (continuar) {
        IO.println("\n=== MENU CALCULADORA ===");
        IO.println("1. Sumar");
        IO.println("0. Salir");
        IO.println("-".repeat(20));

        String opcion = IO.readln("Seleccione una opcion (0-1): ");
        IO.println(opcion);

        while (!opcion.matches("[0-1]")) {
            IO.println("¡Error! '" + opcion + "' no es una opcion valida.");
            opcion = IO.readln("Seleccione una opcion (0-1) nuevamente: ");
            IO.println(opcion);
        }

        if (opcion.equals("0")) {
            IO.println("¡Gracias por usar la calculadora! Saliendo del programa...");
            continuar = false;
            continue;
        }

        String texto = IO.readln("Ingrese el primer valor: ");
        IO.println(texto);

        while (!texto.matches("-?[0-9]+")) {
            IO.println("¡Error! '" + texto + "' no es un numero entero valido.");
            texto = IO.readln("Ingrese el primer valor nuevamente: ");
            IO.println(texto);
        }
        int numero1 = Integer.parseInt(texto);

        texto = IO.readln("Ingrese el segundo valor: ");
        IO.println(texto);

        while (!texto.matches("-?[0-9]+")) {
            IO.println("¡Error! '" + texto + "' no es un numero entero valido.");
            texto = IO.readln("Ingrese el segundo valor nuevamente: ");
            IO.println(texto);
        }
        int numero2 = Integer.parseInt(texto);

        switch (opcion) {
            case "1":
                int resultadoSuma = numero1 + numero2;
                IO.println("El resultado de la suma es: " + resultadoSuma);
                break;

        }

        IO.println("-".repeat(20));
    }
}