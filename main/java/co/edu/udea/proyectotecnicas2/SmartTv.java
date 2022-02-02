package co.edu.udea.proyectotecnicas2;

public class SmartTv extends Televisor {
    private boolean conectadoInternet;
    private String aplicacionAbierta;
    private String sistemaOperativo;
    private String[] aplicacionesInstaladas;

    public SmartTv() {
        super(false,"Apple","blanco",0,0,40,0);
        conectadoInternet = false;
        aplicacionAbierta = "menú";
        sistemaOperativo = "Android TV";
        aplicacionesInstaladas = new String[4];
        aplicacionesInstaladas[0] = "menú";
        aplicacionesInstaladas[1] = "Netflix";
        aplicacionesInstaladas[2] = "Amazon Prime";
        aplicacionesInstaladas[3] = "Disney+";
    }
    
    public SmartTv(String marca) {
        super(false,marca,"blanco",0,0,40,0);
        conectadoInternet = false;
        aplicacionAbierta = "menú";
        sistemaOperativo = "Android TV";
        aplicacionesInstaladas = new String[4];
        aplicacionesInstaladas[0] = "menú";
        aplicacionesInstaladas[1] = "Netflix";
        aplicacionesInstaladas[2] = "Amazon Prime";
        aplicacionesInstaladas[3] = "Disney+";
    }
    
    @Override
    public void encender() {
        super.encender();
        System.out.println("Se conecto el smart TV");
        conectadoInternet = true;
    }

    public boolean isConectadoInternet() {
        return conectadoInternet;
    }

    public void setConectadoInternet(boolean conectadoInternet) {
        this.conectadoInternet = conectadoInternet;
    }

    public String getAplicacionAbierta() {
        return aplicacionAbierta;
    }

    public void setAplicacionAbierta(String aplicacionAbierta) {
        this.aplicacionAbierta = aplicacionAbierta;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public String[] getAplicacionesInstaladas() {
        return aplicacionesInstaladas;
    }
    
    public void instalarAplicacion(String app, int lugar) {
        aplicacionesInstaladas[lugar] = app;
        reiniciarAlInstalar();
    }
    
    public void instalarAplicacion(String app) {
        aplicacionesInstaladas[aplicacionesInstaladas.length - 1] = app;
        reiniciarAlInstalar();
    }
    
    public void instalarAplicacion() {
        aplicacionesInstaladas[aplicacionesInstaladas.length - 1] = "Ude@";
        reiniciarAlInstalar();
    }
    
    private void reiniciarAlInstalar() {
        this.apagar();
        this.encender();
    }

    @Override
    public String toString() {
        return super.toString() + " // SmartTv{" + "conectadoInternet=" + conectadoInternet + ", aplicacionAbierta=" + aplicacionAbierta + ", sistemaOperativo=" + sistemaOperativo + ", aplicacionesInstaladas=" + aplicacionesInstaladas + '}';
    }
    
    
}
