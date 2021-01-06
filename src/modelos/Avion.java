package modelos;

public class Avion {
    private String idAvion;
    private int capacidad;
    private String marca;

    public Avion(String idAvion, int capacidad, String marca) {
        this.idAvion = idAvion;
        this.capacidad = capacidad;
        this.marca = marca;
    }

    public String getIdAvion() {
        return idAvion;
    }

    public void setIdAvion(String idAvion) {
        this.idAvion = idAvion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Avion{" +
                "idAvion='" + idAvion + '\'' +
                ", capacidad=" + capacidad +
                ", marca='" + marca + '\'' +
                '}';
    }
}
