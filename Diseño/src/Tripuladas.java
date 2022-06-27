import javax.swing.*;

public abstract class Tripuladas  extends Naves{
public boolean EstaLleno;
   public Tripuladas(){
       this.velocidad= 0;
       this.velocidad = this.velocidad + 1;

    }
    public void CapacidadMaxima(){
       if (capacidad < 3 ){
           this.EstaLleno= false;
           JOptionPane.showMessageDialog("cupos de tripulantes disponible");
       }
       else {
           this.EstaLleno = true;
           JOptionPane.showMessageDialog("El cupo total de tripulates esta lleno");
       }
       public boolean isEstalleno(){
            return EstaLleno;
        }

       public void Reposo (){
           this.velocidad = 10;
           this.velocidad = this.velocidad + 1;

        }



    }
}
