package cl.polett.divisas.controlador;

import cl.polett.divisas.modelo.Divisa;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author polett
 */
public class ControladorDivisa {

    // Definimos una lista y la inicializamos
    private List<Divisa> listaDivisas = null;

     public ControladorDivisa() {
        this.listaDivisas = new ArrayList<>(); //Esta lista nos permitirá trabajar un listado de las Divisas 

        // Se crea un objeto Divisa para cada cambio, con sus respectivos valores
        // Importantes: El nombre de cada divisa será comparado despues con lo ingresado por los comboBox.
        // Los valores de cada tasa son referenciales, pueden variar segun la fuente.
        Divisa clpClp = new Divisa("CLP-CLP", new BigDecimal(1.000000));
        Divisa clpUsd = new Divisa("CLP-USD", new BigDecimal(0.001568));
        Divisa clpEur = new Divisa("CLP-EUR", new BigDecimal(0.001329));
        Divisa clpJpy = new Divisa("CLP-JPY", new BigDecimal(0.175920));
        Divisa clpBrl = new Divisa("CLP-BRL", new BigDecimal(0.005240));
        Divisa usdClp = new Divisa("USD-CLP", new BigDecimal(649.4000));
        Divisa usdUsd = new Divisa("USD-USD", new BigDecimal(1.000000));
        Divisa usdEur = new Divisa("USD-EUR", new BigDecimal(0.848090));
        Divisa usdJpy = new Divisa("USD-JPY", new BigDecimal(112.2500));
        Divisa usdBrl = new Divisa("USD-BRL", new BigDecimal(3.339200));
        Divisa eurClp = new Divisa("EUR-CLP", new BigDecimal(764.0000));
        Divisa eurUsd = new Divisa("EUR-USD", new BigDecimal(1.179400));
        Divisa eurEur = new Divisa("EUR-EUR", new BigDecimal(1.000000));
        Divisa eurJpy = new Divisa("EUR-JPY", new BigDecimal(132.3700));
        Divisa eurBrl = new Divisa("EUR-BRL", new BigDecimal(3.939500));
        Divisa jpyClp = new Divisa("JPY-CLP", new BigDecimal(5.740000));
        Divisa jpyUsd = new Divisa("JPY-USD", new BigDecimal(0.008911));
        Divisa jpyEur = new Divisa("JPY-EUR", new BigDecimal(0.007555));
        Divisa jpyJpy = new Divisa("JPY-JPY", new BigDecimal(1.000000));
        Divisa jpyBrl = new Divisa("JPY-BRL", new BigDecimal(0.029760));
        Divisa brlClp = new Divisa("BRL-CLP", new BigDecimal(196.1300));
        Divisa brlUsd = new Divisa("BRL-USD", new BigDecimal(0.299580));
        Divisa brlEur = new Divisa("BRL-EUR", new BigDecimal(0.253970));
        Divisa brlJpy = new Divisa("BRL-JPY", new BigDecimal(33.61860));
        Divisa brlBrl = new Divisa("BRL-BRL", new BigDecimal(1.000000));
        
        // Agregamos las Divisas al listado
        listaDivisas.add(clpClp);
        listaDivisas.add(clpUsd);
        listaDivisas.add(clpEur);
        listaDivisas.add(clpJpy);
        listaDivisas.add(clpBrl);
        listaDivisas.add(usdClp);
        listaDivisas.add(usdUsd);
        listaDivisas.add(usdEur);
        listaDivisas.add(usdJpy);
        listaDivisas.add(usdBrl);
        listaDivisas.add(eurClp);
        listaDivisas.add(eurUsd);
        listaDivisas.add(eurEur);
        listaDivisas.add(eurJpy);
        listaDivisas.add(eurBrl);
        listaDivisas.add(jpyClp);
        listaDivisas.add(jpyUsd);
        listaDivisas.add(jpyEur);
        listaDivisas.add(jpyJpy);
        listaDivisas.add(jpyBrl);
        listaDivisas.add(brlClp);
        listaDivisas.add(brlUsd);
        listaDivisas.add(brlEur);
        listaDivisas.add(brlJpy);
        listaDivisas.add(brlBrl);
    }
    
     /* Importante: Se trabajo con BigDecimal porque es el tipo de dato recomendado para trabajar monedas 
    (cuando influyen los decimales), dado que el procesamiento de datos float o double es en base 2 (binaria)
     y el de BigDecimal es en base 10 (decimal). 
     Mas info: http://www.javamexico.org/blogs/luxspes/por_que_usar_bigdecimal_y_no_double_para_calculos_aritmeticos_financieros
     */
     
    public BigDecimal validarMonto(String montoOrigen) {
        // Este metodo basicamente toma el string del monto y lo transforma en BigDecimal.
        BigDecimal capital = new BigDecimal(montoOrigen);
        return capital;
    }

    public BigDecimal calcular(String divisaOD, BigDecimal capital) {
        BigDecimal tasa = BigDecimal.ZERO; //Esta es la forma de inicializamos una variable BigDecimal en 0
 
        for (Divisa divisa : listaDivisas) { //Recorremos el listado de las Divisas que creamos.
            if (divisaOD.equals(divisa.getNombre())) { 
                //Comparamos el nombre de cada Divisa con lo que pidio el usuario(divisaOD)
                tasa = divisa.getTasaCambio(); // Si coincide, tomamos la tasa de cambio de esa divisa y la guardamos en una variable.
            }
        }

        BigDecimal total = capital.multiply(tasa); // Esta es la forma de multiplicar dos BigDecimal.
        //metodo de calculo: total = capital*tasaCambio;
        total = total.setScale(4, BigDecimal.ROUND_HALF_UP); // Redondeamos el total para que nos muestre solo 4 decimales
        return total; //Retornamos el valor calculado.
    }
}
