
package Adicional;


public class Medicamento {
   
    protected String medicina;
    protected String dosis;
    protected String observaciones;
    protected int cantidadTotal;
    protected String unidad;

    public Medicamento(){
        
    }
    
    public Medicamento(String medicina, String dosis, String observaciones, int cantidadTotal, String unidad) {
        this.medicina = medicina;
        this.dosis = dosis;
        this.observaciones = observaciones;
        this.cantidadTotal = cantidadTotal;
        this.unidad = unidad;
    }
    
    
}
