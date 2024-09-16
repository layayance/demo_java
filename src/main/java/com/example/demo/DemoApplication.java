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
	DemoDAO dao = new DemoDAO();
	Axe axe = new Axe();
	private List<Axe> listeAxes = new ArrayList<>();

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		try {

			XmlMapper xmlMapper = new XmlMapper();
			xmlMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			Axes axes = xmlMapper.readValue(new File("D:\\projets_oc\\demo\\demo\\src\\main\\resources\\axes.xml"), Axes.class);

			long startTime = System.currentTimeMillis(); // début du calcul du temps
			List<Axe> axeList = axes.getAxes();
			List<Axe> listeAxes = new ArrayList<>(axeList);
		//	for (Axe axe : axeList) {
//				System.out.println("ID_AXE: " + axe.getIdAxe());
//				System.out.println("NOM_AXE: " + axe.getNomAxe());
//				System.out.println("NOM_USAGE: " + axe.getNomUsage());
//				dao.addAxe(axeList);
				dao.addAxe(listeAxes);
//				listeAxes.add(axe);
//				if (axe.getTypeAlertc() != null) {
//					System.out.println("CODE_TYPE_AXE: " + axe.getTypeAlertc().getCodeTypeAxe());
////					System.out.println("LIB_TYPE_AXE: " + axe.getTypeAlertc().getLibTypeAxe());
//
//				} else {
//					System.out.println();
//				}
//
//				if (axe.getSecteurs() != null) {
//					System.out.println("SECTEURS_GEO: " + axe.getSecteurs().getSecteursGeo());
//					System.out.println("TUNNEL: " + axe.getSecteurs().getTunnel());
//				}
//				System.out.println();
			//}
			long endTime = System.currentTimeMillis(); // fin du calcul du temps
			long executionTime = endTime - startTime; // calcul du temps d'exécution
			System.out.println("Temps de la requete : " + executionTime + " millisecondes");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

