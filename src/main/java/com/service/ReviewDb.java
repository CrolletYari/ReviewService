package com.service;

import java.util.ArrayList;
import java.util.List;

public class ReviewDb {

	private ArrayList<Gemeente> gemeentes;
	Gemeente antwerpen = new Gemeente(1,"Antwerpen");
	Gemeente gent = new Gemeente(2, "Gent");
	Gemeente brugge = new Gemeente(3,"Brugge");
	Gemeente hasselt = new Gemeente(4,"Hasselt");
	Gemeente leuven = new Gemeente(5,"Leuven");
	
	public ReviewDb(){
		gemeentes = new ArrayList<>();
		addAntwerpen();
		addgent();
		addbrugge();
		addhasselt();
		addleuven();
		gemeentes.add(antwerpen);
		gemeentes.add(gent);
		gemeentes.add(brugge);
		gemeentes.add(hasselt);
		gemeentes.add(leuven);
	}

	private void addleuven() {
		leuven.addReview(new Review("Voor herhaling vatbaar", "Leuven is een mooie historische stad, met veel aandacht voor de fietsers onder ons,fijne winkels, leuke pleinen, mooi stadhuis,veel leuke cafeetjes en terrasjes. Zeker de moeite waard om tijdens het eindejaar eens te bezoeken.", "Myriam C", 8));
		leuven.addReview(new Review("Mooi stad, wel snel gezien", "Leuven is een mooie plaats maar het centrum is erg klein zodat je het al snel helemaal hebt gezien. Of je moet erg van de binnenkant van kerken houden want die zijn er een paar grote. De gebouwen en huizen zijn wel erg mooi en als het mooi weer is kun je echt genieten als je op de markt op een terras zit om alleen al naar het vol te kijken. De kruidtuin is wel leuk om door te wandelen, nu was het niet zo mooi als ik denk dat het in het voorjaar kan zijn als alles in bloei staat.", "tedje", 9));
	}

	private void addhasselt() {
		hasselt.addReview(new Review("toffe stad", "toffe winkelstraat en zeer veel en goeie resto's", "tasja moens", 8));
		hasselt.addReview(new Review("Hotel vreselijk, Hasselt leuk. We komen terug.", "Hasselt was leuk en sfeervol. Mooi centrum, leuke winkels en vriendelijk personeel. De kerstmarkt was klein maar gezellig. Goede koffie in een gezellig cafeetje met verwarmd terras. Minder was het ontbreken van wegwijsbordjes op cruciale punten. Verder goed naar onze zin gehad.", "H. Heuvelsland", 8));
	}

	private void addbrugge() {
		brugge.addReview(new Review("Prachtige stad", "Prachtige stad voor een weekendje weg. Goede restaurantjes (niet op het grote plein, maar vooral in de kleine zijstraatjes), leuke winkels, veel bezienswaardigheden en alles is op loopafstand", "irizzzbakker", 9));
		brugge.addReview(new Review("Prachtig, maar al die auto's...", "Wat een prachtige stad. Deze stad ademt de oude sferen en iedereen zou deze stad een keer moeten bezoeken.Wat echter enorm zonde is, zijn al die auto's in de stad. Allemaal zoekend naar een onvindbare parkeerplek, maar het doet ook enorm af aan de sfeer. Wij (45, 13, 11 en 9) vinden dat Brugge gewoon autovrij moet worden. Alleen koetsen door de straten, parkeren buiten de muren en vanaf daar met een pendelbus de stad in.", "tasja71", 9));
		brugge.addReview(new Review("Fantastisch stad", "mooie stad, fantastisch, mooie natuur", "Mina", 10));
	}

	private void addgent() {
		gent.addReview(new Review("Was leuk", "Erg moeilijk te bereiken met de auto verstandig is het met openbaar vervoer", "Anita suiker", 7));
		gent.addReview(new Review("Prachtige historische stad", "Wat je zeker moet doen is een boottochtje maken de gidsen weten je zoveel te vertellen over Gent. De vele historische en vaak middeleeuwse gebouwen laten je terug voeren in de tijd. Trek wel een paar goede schoenen aan want de straten bestaan uit kinderkoppen die glad kunnen zijn. In de stad zijn vele terrassen en restaurantjes. kortom een mooie stad met een grote historie", "Wilma Heemskerk Bruin", 10));
		gent.addReview(new Review("GENT = TOP", "Gent is een fantastische stad. Vooral bij de Graslei is het gezellig en mooi. De stad heeft net als Brugge mooie middeleewse gebouwen, maar het is minder toeristisch en minder pittoresk. Brugge lijkt 1 groot openlucht museum, Gent leeft meer.De Gentenaren zijn vriendelijk en trots op hun stad. Vele leuke winkelstraten en terrasjes. Als het goed weer is, kun je een boottochtje maken over de vele grachten. Ook de burcht (tevens museum) was erg mooi. Alles is beloopbaar.Vooral tijdens de Gentse feesten is de stad een aanrader. Tijdens deze dagen gaat de gezelligheid door tot in de vroege uurtjes op verschillende pleinen en markten. Wij vonden Pole Pole en het Baudelopark erg leuk. Lekker eten en veel soorten biertjes vind je op elke straathoek. Met zomerse temperaturen van dubbel succes verzekerd!Enorm de moeite waard om eens te bezoeken. Na drie dagen heb je het meeste wel gezien. Een aanrader voor een weekendje weg!", "Laura", 8));
	}

	private void addAntwerpen() {
		antwerpen.addReview(new Review("Heerlijke stad!", "Sinds wij hotel Banks hebben ontdekt verblijven wij vaak in Antwerpen. Een stad met cultuur, leuke sfeer, heerlijke restaurants en fijn om te winkelen!", "S. Sommer", 9));
		antwerpen.addReview(new Review("Bezoek aan Museum aan de stroom: heel bijzonder!", "Prachtig gebouw! Omgeving in ontwikkeling!", "Sunderman", 8));
		antwerpen.addReview(new Review("Super leuke stad", "Super leuke stad waar veel te beleven is. Leuke winkels en gezellige restaurantjes. Een mooie dierentuin in het centrum van Antwerpen waar je je wel een hele middag kunt vermaken. Ook is de bustour met de hop on hop off bus een echte aanrader. Makkelijke manier om veel van de stad te zien. En je kunt op meerdere plaatsen uitstappen", "maroesjuh1985", 10));
	}

	public List<Gemeente> getReviews() {
		return gemeentes;
	}

	public Gemeente getReviewsCity(String city) {
		for(Gemeente g: gemeentes){
			if(g.getNaam().equalsIgnoreCase(city)){
				return g;
			}
		}
		return null;
	}
	
	
}
