public class Calculadora {
    
    private double n1;
    private double n2;
    private double resultado;

    public Calculadora() {
    }
    
    public double soma(double n1, double n2) {
        resultado = n1 + n2;
        return resultado;
    }
    
    public double subtrai(double n1, double n2) {
        resultado = n1 - n2;
        return resultado;
    }
    
    public double multiplica(double n1, double n2) {
        resultado = n1 * n2;
        return resultado;
    }
    
    public double divide(double n1, double n2) {
        if (n2 == 0) {
            
        } else {  
        resultado = n1 / n2;}
        return resultado;
    }

    @Override
    public String toString() { 
    return "Resultado: " + resultado + ' ';  
    }
    
}
