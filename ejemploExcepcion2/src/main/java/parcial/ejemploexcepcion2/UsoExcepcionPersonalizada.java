package parcial.ejemploexcepcion2;

public class UsoExcepcionPersonalizada {

    public UsoExcepcionPersonalizada() {
    }
    
    public void validarEdad(int edad) throws ExcepcionPersonalizada {
        if (edad < 18) {
            throw new ExcepcionPersonalizada("La edad debe ser mayor o igual a 18.");
        }
    }
}
