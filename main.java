import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Cliente cliente1 = new Cliente();
        
        cliente1.setNombre ("Roberto");
        cliente1.setEdad (35);
        cliente1.setTelefono (556677);
        cliente1.setCredito (700000);
        
        System.out.println(cliente1.getNombre());
        System.out.println(cliente1.getEdad());
        System.out.println(cliente1.getTelefono());
        System.out.println(cliente1.getCredito());
    }
}

class Persona {
    
    String nombre;
    int edad;
    int telefono;
    
    public void setNombre (String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre () {
        return this.nombre;
    }
    
    public void setEdad (int edad) {
        this.edad = edad;
    }
    
    public int getEdad () {
        return this.edad;
    }
    
    public void setTelefono (int telefono) {
        this.telefono = telefono;
    }
    
    public int getTelefono () {
        return this.telefono;
    }
}

class Cliente extends Persona {
    
    double credito;
    
    public void setCredito (double credito) {
        this.credito = credito;
    }
    
    public double getCredito () {
        return this.credito;
    }
}

class Trabajador extends Persona {
    
    double salario;
    
    public void setSalario (double salario) {
        this.salario = salario;
    }
    
    public double getSalario () {
        return this.salario;
    }
}
