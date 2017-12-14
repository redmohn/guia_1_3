package cl.polett.divisas.controlador;

import cl.polett.divisas.modelo.Divisa;

import java.math.BigDecimal;

/**
 *
 * @author polett
 */
public class ControladorDivisa {
    
    public BigDecimal capital;
    public BigDecimal total;
    
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
    
    public BigDecimal validarMonto(String montoOrigen){
        
        return capital;
    }
    
    
    public BigDecimal calcular(BigDecimal capital, BigDecimal tasaCambio){
        
        this.total = capital.multiply(tasaCambio);
        //total = capital*tasaCambio;        
        return this.total;
    }
    
    
    
    
  
}
