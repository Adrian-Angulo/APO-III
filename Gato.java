class Gato{
    private String nombre; 
    private String color; 
    private float peso;
    private float tamanio;
    
    public Gato(String nombre,String color,float peso,float tamanio){
    this.nombre = nombre;
    this.color = color;
    this.peso = peso;
    this. tamanio = tamanio;
    
    
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public float getPeso() {
        return peso;
    }

    public float getTamanio() {
        return tamanio;
    }
    
    //metodos

    public void JugarGato(){
        System.out.println("el Gato "+ getNombre()+" esta jugando");
    }
    public void SaltarGato(){
        System.out.println("el Gato "+getNombre()+" esta saltado");
    }
    public void PesoGato(){
        System.out.println("El Gato pesa "+ getPeso()+" kg");
    }
    public void ColorGato(){
        System.out.println("el Gato "+getNombre() +" es de color "+ getColor());
    }
    public void TamanioGato(){
        System.out.println("el Gato "+ getNombre()+" mide "+getTamanio() +" centimetros de altura");
    }

}
