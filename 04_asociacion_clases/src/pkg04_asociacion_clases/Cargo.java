package pkg04_asociacion_clases;
public class Cargo {
    //atributos
    public String descripcion;
    private char jornada;
    private Empresa empresa;
    private float salario;
    //constructor
    public Cargo(String descripcion, char jornada, Empresa empresa, float salario) {
        this.descripcion = descripcion;
        this.setJornada(jornada);
        this.setEmpresa(empresa);
        this.setSalario(salario);
    }
    //metodos
    public char getJornada() {
        return this.jornada;
    }
    public Empresa getEmpresa() {
        return this.empresa;
    }
    public float getSalario() {
        return this.salario;
    }
    public void setEmpresa(Empresa empresa) {
        if( empresa != null )
            this.empresa = empresa; //se acepta
        else
            throw new IllegalArgumentException("empresa no puede ser null en Cargo");
    }
    public void setJornada(char jornada) {
        if( jornada == 'M' || jornada == 'T' || jornada == 'N' )
            this.jornada = jornada; //se acepta
        else
            throw new IllegalArgumentException("jornada en Cargo debe ser M, T, N");
    }
    public void setSalario(float salario) {
        if( salario >= 0 )
            this.salario = salario; //se acepta
        else
            throw new IllegalArgumentException("salario en Cargo debe ser >= 0");
    }
}
