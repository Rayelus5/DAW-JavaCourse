package Primero.SegundoTrimestre.Practica.POO.ControlPOO_21_22.fuentes;
public class Principal
{
	public static void main(String[] args)
	{
	  LineaFerrea linea = new LineaFerrea();
	  
	  Maquinista m1 = new Maquinista("Pepe");
	  Maquinista m2 = new Maquinista("Mari");
	  Maquinista m3 = new Maquinista("Juan");
	  Maquinista m4 = new Maquinista("Lola");
	  Maquinista m5 = new Maquinista("Jose");
	  
	  
	  Vagon v00= new Vagon(0);
	  v00.anadeCarga(new Carga("Albaricoque",1623));
	  v00.anadeCarga(new Carga("Calabaza",7575));
	  v00.anadeCarga(new Carga("Berenjena",1978));
	  v00.anadeCarga(new Carga("Limon",5547));
	  v00.anadeCarga(new Carga("Cebolla",8106));
	  Vagon v01= new Vagon(1);
	  v01.anadeCarga(new Carga("Oliva",3396));
	  v01.anadeCarga(new Carga("Albaricoque",5373));
	  v01.anadeCarga(new Carga("Patata",8408));
	  v01.anadeCarga(new Carga("Limon",5508));
	  Vagon v02= new Vagon(2);
	  v02.anadeCarga(new Carga("Manzana",7723));
	  v02.anadeCarga(new Carga("Berenjena",1585));
	  v02.anadeCarga(new Carga("Lechuga",7668));
	  Vagon v03= new Vagon(3);
	  v03.anadeCarga(new Carga("Calabaza",9383));
	  Vagon v04= new Vagon(4);
	  v04.anadeCarga(new Carga("Coliflor",7593));
	  v04.anadeCarga(new Carga("Lechuga",5195));
	  Vagon v05= new Vagon(5);
	  v05.anadeCarga(new Carga("Cebada",5713));
	  v05.anadeCarga(new Carga("Albaricoque",6825));
	  v05.anadeCarga(new Carga("Chalota",7388));
	  v05.anadeCarga(new Carga("Patata",9963));
	  v05.anadeCarga(new Carga("Calabaza",8225));
	  v05.anadeCarga(new Carga("Cebolla",4318));
	  
	  Vagon v10= new Vagon(10);
	  v10.anadeCarga(new Carga("Berenjena",2863));
	  v10.anadeCarga(new Carga("Coliflor",707));
	  v10.anadeCarga(new Carga("Albaricoque",6828));
	  v10.anadeCarga(new Carga("Manzana",443));
	  v10.anadeCarga(new Carga("Oliva",8355));
	  Vagon v11= new Vagon(11);
	  v11.anadeCarga(new Carga("Garbanzo",866));
	  v11.anadeCarga(new Carga("Chalota",155));
	  v11.anadeCarga(new Carga("Limon",570));
	  v11.anadeCarga(new Carga("Cafe",8498));
	  Vagon v12= new Vagon(12);
	  v12.anadeCarga(new Carga("Garbanzo",20943));
	  v12.anadeCarga(new Carga("Cebolla",5211));
	  v12.anadeCarga(new Carga("Patata",8258));
	  Vagon v13= new Vagon(13);
	  v13.anadeCarga(new Carga("Berenjena",3314));
	  v13.anadeCarga(new Carga("Esparrago",780));
	  Vagon v14= new Vagon(14);
	  v14.anadeCarga(new Carga("Lechuga",292));
	  v14.anadeCarga(new Carga("Cebolla",4025));
	  v14.anadeCarga(new Carga("Garbanzo",409));
	  v14.anadeCarga(new Carga("Manzana",2735));
	  v14.anadeCarga(new Carga("Albaricoque",841));
	  Vagon v15= new Vagon(15);
	  v15.anadeCarga(new Carga("Calabaza",3663));
	  v15.anadeCarga(new Carga("Coliflor",54049));
	  v15.anadeCarga(new Carga("Berenjena",564));
	  
	  Locomotora l1 = new Locomotora(30000,450000);
	  Locomotora l2 = new Locomotora(20000,110000);
	  Locomotora l3 = new Locomotora(45000,230000);
	  
	  Tren t1 = new Tren(443,l1,m2);
	  Tren t2 = new Tren(552,l3,m3);
	  Tren t3 = new Tren(126,l2,m1);
	  Tren t4 = new Tren(975,l2,m4);
	  Tren t5 = new Tren(486,l1,m5);
	  Tren t6 = new Tren(266,l3,m2);
	  
	  t1.anadeVagon(v00);
	  t2.anadeVagon(v01);
	  t2.anadeVagon(v02);
	  t2.anadeVagon(v03);
	  t3.anadeVagon(v04);
	  t3.anadeVagon(v05);
	  
	  t4.anadeVagon(v10);
	  t5.anadeVagon(v11);
	  t5.anadeVagon(v12);
	  t5.anadeVagon(v13);
	  t6.anadeVagon(v14);
	  t6.anadeVagon(v15);
	  
	  linea.anadeLocomotora(l1);
	  linea.anadeLocomotora(l2);
	  linea.anadeLocomotora(l3);
	  linea.anadeMaquinista(m1);
	  linea.anadeMaquinista(m2);
	  linea.anadeMaquinista(m3);
	  linea.anadeMaquinista(m4);
	  linea.anadeMaquinista(m5);
	  linea.anadeVagon(v00);
	  linea.anadeVagon(v01);
	  linea.anadeVagon(v02);
	  linea.anadeVagon(v03);
	  linea.anadeVagon(v04);
	  linea.anadeVagon(v05);
	  linea.anadeVagon(v10);
	  linea.anadeVagon(v11);
	  linea.anadeVagon(v12);
	  linea.anadeVagon(v13);
	  linea.anadeVagon(v14);
	  linea.anadeVagon(v15);
	  
	  linea.anadeTren(t1);
	  linea.anadeTren(t2);
	  linea.anadeTren(t3);
	  linea.anadeTren(t4);
	  linea.anadeTren(t5);
	  linea.anadeTren(t6);
	  
	  /* DESCOMENTAR PARA VER TODOS LOS TRENES
	  for(Tren t:linea.trenes)
		  System.out.println(t);
	  */
	  
	  System.out.println("Apartado a) Carga de garbanzos en tren 486: "+
	                        linea.totalCargaDeProducto(486, "Garbanzo"));
	  
	  /******************************************************************************/
	  System.out.print("Apartado b) Numero de los trenes conducidos por Mari: ");
	  Tren[] tablaTrenes = linea.trenesConducidosPor("Mari");
	  for(Tren t:tablaTrenes)
		  System.out.print(t.getNumero()+" ");

	  /*******************************************************************************/
	  System.out.println("\nApartado c) Maquinistas que conducen al menos 2 trenes: "+linea.numMaquinistasConducenAlMenos(2));
 
	  /******************************************************************************/
	  System.out.println("Apartado d) Problemas antes de cargar plomo: "+linea.hayProblemas());
	  v15.anadeCarga(new Carga("Plomo",300000));
	  System.out.println("Apartado d) Problemas despues de cargar plomo: "+linea.hayProblemas());
	  
	  /********************************************************************************/
	  linea.eliminaVagonesConCargaDelTren("Garbanzo", 486);
	  System.out.print("Apartado e) Tren 486 despues de eliminar vagones con garbanzo:\n"+t5);
	  
	  /*********************************************************************************/
	  Vagon[] tVagones = new Vagon[11];
	  int i=0;
	  tVagones[i++]=v00;
	  tVagones[i++]=v01;
	  tVagones[i++]=v02;
	  tVagones[i++]=v03;
	  tVagones[i++]=v04;
	  tVagones[i++]=v05;
	  tVagones[i++]=v10;
	  tVagones[i++]=v11;
	  tVagones[i++]=v12;
	  tVagones[i++]=v13;
	  tVagones[i++]=v14;
	  
	  System.out.println("Apartado f) Locomotoras que pueden llevar conjunto de vagones definido:");
	  for(Locomotora l:linea.locomotorasQuePuedenLlevar(tVagones))
		  System.out.println("         "+l);
	  

	  
	  
	}
	
}



