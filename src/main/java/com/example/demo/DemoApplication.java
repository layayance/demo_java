package com.example.demo;

import com.example.demo.models.Axe;
import com.example.demo.models.Axes;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.util.*;

@SpringBootApplication

class DemoApplication implements CommandLineRunner {


	private static String nomCourant;
	@Autowired
	private BusinessService bs;
	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		try {

			XmlMapper xmlMapper = new XmlMapper();
			xmlMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			Axes axes = xmlMapper.readValue(new File("D:\\projets_oc\\demo\\demo\\src\\main\\resources\\axes.xml"), Axes.class);


			List<Axe> axeList = axes.getAxes();
			for (Axe axe : axeList) {
				System.out.println("ID_AXE: " + axe.getIdAxe());
				System.out.println("NOM_AXE: " + axe.getNomAxe());

				if (axe.getTypeAlertc() != null) {
					System.out.println("CODE_TYPE_AXE: " + axe.getTypeAlertc().getCodeTypeAxe());
					System.out.println("LIB_TYPE_AXE: " + axe.getTypeAlertc().getLibTypeAxe());
				} else {
					System.out.println();
				}

				if (axe.getSecteurs() != null) {
					System.out.println("SECTEURS_GEO: " + axe.getSecteurs().getSecteursGeo());
					System.out.println("TUNNEL: " + axe.getSecteurs().getTunnel());
				}
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}


//	@Override
//	public void run(String... args) throws Exception {
//		HelloWord hw = bs.getHelloWorld();
//		System.out.println(hw);
//	}

//	@Override
//	public void run(String... args) throws Exception {
//		testYaya();
//	}
//	private static void testYaya() {
//		BufferedReader reader;
//
//		try {
//			reader = new BufferedReader(new FileReader("D:\\projets_oc\\demo\\demo\\src\\main\\resources\\axes.xml"));
//			String line = reader.readLine();
//			List<String> idAxes =  new ArrayList<>();
//			List<String> nomCourantChev =  new ArrayList<>();
//			Map<String, String>  idVersNom = new LinkedHashMap<>();
//			// TreeMap --> mais par odre structure arborescente
//			// HashMap -->
//			// LinkedHashMap --> Les performances de LinkedHashMap sont plus faibles que celles du HashMap
//
//			while (line != null) {
//
////              line =  <AXE ID_AXE="11002398">
//				if (line.contains("ID_AXE=")){
//					String[] splittedLine = line.split("\"");  //  <AXE ID_AXE=  11002398 >
//					String idCourant = splittedLine[1];
//					idAxes.add(idCourant);
//				}
//
//				//  <NOM_AXE>Pont Morland</NOM_AXE>
//				if (line.contains("NOM_AXE")){
//					String[] splittedLine = line.split(">"); // <NOM_AXE    Pont Morland</NOM_AXE
//
//					String partieDroite = splittedLine[1];  // Pont Morland</NOM_AXE
//					String[] splittedLineDroite = partieDroite.split("<");  // "Pont Morland" "/NOM_AXE"
//					//  temp = "toto est grand"
//					//  temp.split(" ") => ["toto", "est", "grand"]
//					String nomCourant = splittedLineDroite[0];
//					nomCourantChev.add(nomCourant);
//				}
//				// read next line
//				line = reader.readLine();
//			}
//			reader.close();

//			idVersNom.put(idAxes.get(0), nomCourantChev.get(0));
//			idVersNom.put(idAxes.get(1), nomCourantChev.get(1));
//			idVersNom.put(idAxes.get(2), nomCourantChev.get(2));
//			idVersNom.put(idAxes.get(3), nomCourantChev.get(3));


//			for(String  : idVersNom){
//				String id = ;
//				String nom = ;
//				System.out.println("ID:" + id + " NOM: " + nom);
//			}

//			for(String id : idAxes){
//				System.out.println("ID: " + id );
//			}
//			for(String id : nomCourantChev){
//				System.out.println("ID: " + id );
//			}

//			idAxes et nomCourantChev
//				8	       4
//			for (int i = 0; i < idAxes.size(); i++) {
//				// Si i est plus petit que la taille de idAxes ET i est plus petit que la taille de nomCourantChev
//				if( i < idAxes.size()  && i < nomCourantChev.size())  {
//					idVersNom.put(idAxes.get(i), nomCourantChev.get(i));
//				} else  {
//					idVersNom.put(idAxes.get(i), null);
//				}
//			}
//
//
//
//
//
//			for (Map.Entry<String, String> entry : idVersNom.entrySet()) {
//				String id = entry.getKey();
//				String nom = entry.getValue();
//				System.out.println("ID: " + id + " NOM: " + nom);
//			}
//
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
}

