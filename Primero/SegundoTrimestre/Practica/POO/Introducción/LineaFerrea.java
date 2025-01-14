package Primero.SegundoTrimestre.Practica.POO.Introducción;

public class LineaFerrea {
    private Maquinista[] maquinista;
    private Tren[] trenes;
    private Locomotora[] locomotoras;
    private Vagon[] vagones;

    /*public void añadirMaquinista(Maquinista maquinista) {
        Maquinista tNueva[] = new Maquinista[this.maquinistas.length+1];

        for (int i=0; i < this.maquinistas.length; i++) {
            tNueva[i] = this.maquinistas[i];
        }
        tNueva[this.maquinistas.length] = maquinista;
        this.maquinistas = tNueva; // Actualiza los maquinistas
    }

    public Tren[] trenesConducidosPor(String nombreMaquinista) {
        Tren[] tablaADevolver = new Tren[0];

        for(Tren t:this.trenes) {
            if(t.getMaquinista().getNombre().equals(nombreMaquinista)) {
                tablaADevolver = Arrays.copyOf(tablaADevolver, tablaADevolver.length+1);
                tablaADevolver[tablaADevolver.length-1]=t;
            }
        }
    }*/
}
