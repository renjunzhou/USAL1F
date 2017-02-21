package sems.cnam.velib;

/**
 * Created by Jean-marc on 25/10/2016.
 */

public class StationVelib {
    private String nom;
    private String numero;
    private double latitude;
    private double longitude;

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getLatitude() { return latitude; }
    public void setLatitude(double latitude) { this.latitude = latitude; }

    public double getLongitude() { return longitude;}
    public void setLongitude(double longitude) { this.longitude = longitude; }

    /*
   business
    */
    @Override
    public String toString() {
        return "StationVelib{" +
                "nom='" + nom + '\'' +
                ", numero='" + numero + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                '}';
    }

}
