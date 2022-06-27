import javax.swing.*;

public  abstract  class NoTripluladas extends Naves {
  private boolean EstaDesplazandose;
    public NoTripluladas( int motor){
        super(motor= 4);

        }
    public void pioneroXI(){
     this.peso = 258;
     this.velocidad = this.velocidad +1 ;
     }

    public void setEstaDesplazandose() {
        velocidad = 0;
        this.EstaDesplazandose = false;
        JOptionPane.showMessageDialog("sin energia, desplazamiento de forma inercial");

    }
    public boolean Estadeplazandose(){
        if(velocidad > 0){
            this.EstaDesplazandose = true;
        }
        public boolean isEstadesplazandose(){
            return EstaDesplazandose;
        }

}

}
