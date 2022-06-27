public abstract class Naves {
    public int velocidad;
    public int capacidad = 0;
    public int peso;
    public int motor;

    public int velocidadMaxima = 0;




        public abstract void acelerar();
    public void desacelerar(){
        if(this.velocidad >= this.velocidadMaxima){
            this.velocidad = this.velocidad - 10 ;
            } else{
            this.velocidad = this.velocidad + 10;
        }
    }






}

