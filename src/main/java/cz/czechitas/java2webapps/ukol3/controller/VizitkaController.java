package cz.czechitas.java2webapps.ukol3.controller;
import cz.czechitas.java2webapps.ukol3.entity.Vizitka;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

/**
 * Kontroler obsluhující zobrazování vizitek.
 */
@Controller
public class VizitkaController {

  private final List<Vizitka> seznamVizitek = List.of(
          new Vizitka("Sherlock Holmes", "The Conan Doyle Estate Ltd","221B Baker Street", "NW1 Londýn", "221b Baker Street, NW1 Westminster, Londýn, Velká Británie", null, null, null ),
          new Vizitka("Jára Cimrman", "Žižkovské divadlo Járy Cimrmana","Štítného 520/5", "13000 Praha 3-Žižkov", "Štítného 520/5, 13000 Praha 3-Žižkov", "info@zdjc.cz", "222 781 860", "www.zdjc.cz" ),
          new Vizitka("Joanne Rowling", "Wizarding World Digital","98 Theobalds Road", "WC1X 8WB Londýn", "98 Theobalds Road, WC1X 8WB Londýn, Velká Británie", null, null, "www.wizardingworld.com" ),
          new Vizitka("The Tolkien Society", "The Tolkien Society","267 Banbury Road", "OX2 7HT Oxford", "267 Banbury Road, OX2 7HT Oxford, Velká Británie", null, null, "www.tolkiensociety.org" )
  );
  @GetMapping("/")
  public ModelAndView seznam() {
    ModelAndView modelAndView = new ModelAndView("seznam");
    modelAndView.addObject("vizitky", seznamVizitek);
    return modelAndView;
  }
  @GetMapping("/detail/{id}")
  public ModelAndView detail(@PathVariable int id) {
    ModelAndView modelAndView = new ModelAndView ("detail");
    modelAndView.addObject("vizitka", seznamVizitek.get(id));
    return modelAndView;
  }
}
