package co.edu.escuelaing.prueba;

import java.util.Random;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@SpringBootApplication
@Controller
public class Game {

    private int numero;
    private int picas;
    private int famas;
    private String intento;

    public Game() {
        Random r = new Random();
        numero = r.nextInt(9000) + 1000;
        picas = 0;
        famas = 0;
        intento = "x";

    }

    public static void main(String[] args) {
        SpringApplication.run(Game.class, args);
    }
    public void play(){
        
        picas = 0;
        famas = 0;
        String num = Integer.toString(numero);     
        if (intento!=null) {
            for (int i = 0; i < num.length(); i++) {
                if (intento.indexOf(num.charAt(i)) != i && intento.indexOf(num.charAt(i))!= -1) {
                    picas++;
                } else if (intento.indexOf(num.charAt(i)) == i && intento.indexOf(num.charAt(i))!= -1) {
                    famas++;
                }
            }
        }
    }
    @RequestMapping(value = "/", method = RequestMethod.POST, params = {"play"})
    public String post(String intento) {
        if(intento!=null){
            this.intento = intento;
            play();
        }
        return "redirect:/";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST, params = {"restart"})
    public String restart() {
        Random r = new Random();
        numero = r.nextInt(9000) + 1000;
        picas = 0;
        famas = 0;
        intento = "x";
        return "redirect:/";
    }

    @GetMapping("/")
    public String get(Model model) {
        model.addAttribute("intento", intento);
        model.addAttribute("picas", picas);
        model.addAttribute("famas", famas);
        return "index";
    }

    public int getPicas() {
        return picas;
    }

    public void setPicas(int picas) {
        this.picas = picas;
    }

    public int getFamas() {
        return famas;
    }

    public void setFamas(int famas) {
        this.famas = famas;
    }

    public String getIntento() {
        return intento;
    }

    public void setIntento(String intento) {
        this.intento = intento;
    }
    

}
