public class DiaDeMuertos {
    public static void main(String[] args) {
        String[] ofrenda = {"Pan de muerto", "Cempasúchil", "Calaverita de azúcar", "Velas", "Papel picado"};
        double[] precios = {35.00, 50.00, 15.50, 20.00, 45.75};
        double total = 0;
        System.out.println("--- Ofrenda de Día de Muertos ---");
        for (int i = 0; i < precios.length; i++) {
            System.out.println("Producto " + i + ": " + ofrenda[i] + " - $" + precios[i]);
            total += precios[i];
        }
        double promedio = total / precios.length;
        System.out.println("\nCosto total: $" + total);
        System.out.println("Costo promedio por producto: $" + promedio);
        int posMasCaro = 0;
        for (int i = 1; i < precios.length; i++) {
            if (precios[i] > precios[posMasCaro]) {
                posMasCaro = i;
            }
        }
        System.out.println("El elemento más costoso es: " + ofrenda[posMasCaro] + " ($" + precios[posMasCaro] + ")");
    }
}