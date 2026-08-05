package solid.ocp.bad;

public class DiscountCalculator {
    public double calculate(String memberType, double price) {
        if (memberType.equals("PRIME")) {
            return price * 0.85;
        } else if (memberType.equals("GOLD")) {
            return price * 0.80;
        } else if (memberType.equals("SILVER")) {
            return price * 0.90;
        }
        return price;
    }
}

//Aquí tenemos una clase de una calculadora de descuentos
// que usa tipo de membresía y precio
//Se usa un loop condicional comparando Strings para calcular
// los precios de acuerdo a la categoria adecuada.
//Devuelve el precio calculado.
//Esa clase viola el principio de abierto/cerrado. Cualquier nuevo
//tipo de miembro obliga a modificar directamente el metodo calculate.
// Para arreglarlo, creamos una estructura condicional por polimorfismo,
//para extender el sistema creando nuevas clases sin alterar el código.
