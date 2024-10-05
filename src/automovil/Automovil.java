
package automovil;


public class Automovil {

        private String marca;
        private int modelo;
        private double motor;
        
        public enum TipoCombustible {
            Gasolina,Bioetanol,Biodiésel,Diésel,Gas_Natural
        }
        public TipoCombustible tipocombustible;
        
        public enum TipoAutomovil {
            Ciudad,Subcompacto,Compacto,Familiar,Ejecutico,SUV
        }
        public TipoAutomovil tipoautomovil;
        private int NumPuertas;
        private int CantAsientos;
        private double VelMaxima;
        
        public enum Color{
           Blanco, Negro, Rojo, Naranja, Amarillo, Verde, Azul, Violeta 
        }
        public Color color;
        private double VelActual;

    public Automovil(String marca, int modelo, double motor, TipoCombustible 
            tipocombustible, TipoAutomovil tipoautomovil, int NumPuertas, 
            int CantAsientos, double VelMaxima, Color color, double VelActual) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipocombustible = tipocombustible;
        this.tipoautomovil = tipoautomovil;
        this.NumPuertas = NumPuertas;
        this.CantAsientos = CantAsientos;
        this.VelMaxima = VelMaxima;
        this.color = color;
        this.VelActual = VelActual;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public TipoCombustible getTipocombustible() {
        return tipocombustible;
    }

    public void setTipocombustible(TipoCombustible tipocombustible) {
        this.tipocombustible = tipocombustible;
    }

    public TipoAutomovil getTipoautomovil() {
        return tipoautomovil;
    }

    public void setTipoautomovil(TipoAutomovil tipoautomovil) {
        this.tipoautomovil = tipoautomovil;
    }

    public int getNumPuertas() {
        return NumPuertas;
    }

    public void setNumPuertas(int NumPuertas) {
        this.NumPuertas = NumPuertas;
    }

    public int getCantAsientos() {
        return CantAsientos;
    }

    public void setCantAsientos(int CantAsientos) {
        this.CantAsientos = CantAsientos;
    }

    public double getVelMaxima() {
        return VelMaxima;
    }

    public void setVelMaxima(double VelMaxima) {
        this.VelMaxima = VelMaxima;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getVelActual() {
        return VelActual;
    }

    public void setVelActual(double VelActual) {
        this.VelActual = VelActual;
    }
    public void acelerar(double incremento){
        if (VelActual + incremento < VelMaxima){
            VelActual = VelActual + incremento;
             System.out.println("Velocidad actual = "+ VelActual +" Km/h");
        }else{
            System.out.println("No se puede acelarar más allá de la velocidad "
                    + "maxima");
        }
    }
    public void desacelerar(double decremento){
        if(VelActual- decremento > 0){
           VelActual=VelActual-decremento;
             System.out.println("Velocidad Actual = " + VelActual + "Km/h" );
            }else{
            System.out.println("No se puede desacelerar a un velocidad "
                    + "negativa");
            VelActual=0;
        }
    
    }
    public void frenar(){
        VelActual=0;
        System.out.println("El automovil ha frenado su velocidad actual es = " 
                + VelActual +"Km/h");
    }
    public double TiempoEstimadoLlegada(double distancia){
        return distancia/VelActual;
    }
    public void mostrardatos(){
        System.out.println("Marca = " + marca);
        System.out.println("Modelo = " + modelo);
        System.out.println("Motor = " + motor + " L");
        System.out.println("Tipo de Combustible = " + tipocombustible);
        System.out.println("Tipo de Automóvil = " + tipoautomovil);
        System.out.println("Número de puertas = " + NumPuertas);
        System.out.println("Cantidad de asientos = " + CantAsientos);
        System.out.println("Velocidad máxima = " + VelMaxima + " km/h");
        System.out.println("Color = " + color);
        System.out.println("Velocidad actual = "+ VelActual + "Km/h" );
    
    }
    }
