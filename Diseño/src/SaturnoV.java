import javax.swing.*;

public  abstract  class SaturnoV extends Naves{
    private boolean suficienteCapacidad;

    public SaturnoV() {
        super(motor 4);
    }

    public void SaturnoV(int peso){
           super(peso);
           this.setPeso(2900);
           this.setPeso(this.getPeso());


      }
    public void acelerar() {

           this.velocidad = this.velocidad + 1000;
    }
    public void CapacidadCompleta(){
           capacidad = 118;
           this.suficienteCapacidad = true;
    }
    public void DisponibleCarga() {
        if (capacidad < 18) {
            this.suficienteCapacidad = false;
            JOptionPane.showMessageDialog("hay espacio disponible para cargar");
        }
    }


    public boolean isSuficienteCapacidad() {

           return suficienteCapacidad;
    }
}
