package CLASS;

/**
 *
 * @author Juan_K
 */
public class Producto {
    private String codigo;
    private String nombre;
    private double precio;
    private String existencia;
    
    public Producto(){
        
    }

    public Producto(String codigo, String nombre, double precio, String existencia) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.existencia = existencia;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getExistencia() {
        return existencia;
    }

    public void setExistencia(String existencia) {
        this.existencia = existencia;
    }
    
    public Object[] getinfo(){
        Object[] inf = new Object[4];
        inf[0] = this.codigo;
        inf[1] = this.nombre;
        inf[2] = this.precio;
        inf[3] = this.existencia;
        return inf;
    }
}
