
package repasoej01;

public class Subsidio {
    private double montoPedido;
    private String motivo;
    private boolean otorgado;

    public Subsidio(double montoPedido, String motivo) {
        this.setMontoPedido(montoPedido);
        this.setMotivo(motivo);
        this.setOtorgado(false);
    }

    public Subsidio() {
    }

    
    public double getMontoPedido() {
        return montoPedido;
    }

    public void setMontoPedido(double montoPedido) {
        this.montoPedido = montoPedido;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public boolean isOtorgado() {
        return otorgado;
    }

    public void setOtorgado(boolean otorgado) {
        this.otorgado = otorgado;
    }
    
    
    
}
