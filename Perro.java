class Perro{
    private String nombre; 
    private String color; 
    private float peso;
    private float tamanio;
    
    public Perro(String nombre,String color,float peso,float tamanio){
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

    public void JugarPerro(){
        System.out.println("el perro "+ getNombre()+" esta jugando");
    }
    public void SaltarPerro(){
        System.out.println("el perro "+getNombre()+" esta saltado");
    }
    public void PesoPerro(){
        System.out.println("El perro pesa "+ getPeso()+" kg");
    }
    public void ColorPerro(){
        System.out.println("el perro "+getNombre() +" es de color "+ getColor());
    }
    public void TamanioPerro(){
        System.out.println("el perro "+ getNombre()+" mide "+getTamanio() +" centimetros");
    }

}

