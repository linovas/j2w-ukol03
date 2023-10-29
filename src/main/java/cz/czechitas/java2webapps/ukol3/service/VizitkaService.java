package cz.czechitas.java2webapps.ukol3.service;

import cz.czechitas.java2webapps.ukol3.entity.Vizitka;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VizitkaService {
    private final List<Vizitka> seznamVizitek = new ArrayList<>();

    public VizitkaService() {
        seznamVizitek.add(
                new Vizitka(
                        "The Tolkien Society",
                        "The Tolkien Society",
                        "267 Bandbury Road",
                        "OX2 7HT Oxford",
                        null,
                        null,
                        "www.tolkiensociety.org"
                )
        );
        seznamVizitek.add(
                new Vizitka(
                        "Jára Cimrman",
                        "Žižkovské divadlo Járy Cimrmana",
                        "Štítného 520/5",
                        "13000 Praha 3-Žižkov",
                        "info@zdjc.cz",
                        "222 781 860",
                        "www.zdjc.cz"
                )
        );
        seznamVizitek.add(
                new Vizitka(
                        "Sherlock Holmes",
                        "The Conan Doyle Estate Ltd",
                        "221B Baker Street",
                        "NW1 Londýn",
                        null,
                        null,
                        null
                )
        );
        seznamVizitek.add(
                new Vizitka(
                        "Joanne Rowling",
                        "Wizarding World Digital",
                        "98 Theobalds Road",
                        "WC1X 8WB Londýn",
                        null,
                        null,
                        "www.wizardingworld.com"
                )
        );

    }

    public List<Vizitka> getAll() {
        return seznamVizitek;
    }

    public Vizitka getById(int id) {
        return seznamVizitek.get(id);
    }

    public void append(Vizitka vizitka) {
        seznamVizitek.add(vizitka);
    }

    public void deleteById(int id) {
        seznamVizitek.remove(id);
    }
}