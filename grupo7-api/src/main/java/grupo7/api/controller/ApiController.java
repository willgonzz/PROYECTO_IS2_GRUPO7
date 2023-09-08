package grupo7.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ApiController {

//    @RequestMapping(value = "/miControlador", method = RequestMethod.GET)
//    public String mostrarPagina(Model model) {
//        // Lógica para cargar datos y enviarlos a la vista
//        model.addAttribute("mensaje", "¡Hola desde el controlador!");
//        return "index"; // Nombre de la vista JSP
//    }
    @RequestMapping(value = "/hola", method = RequestMethod.GET)
    public String hola(Model model) {
        // Lógica para cargar datos y enviarlos a la vista
        model.addAttribute("mensaje", "¡Hola desde el controlador!");
        return "index"; // Nombre de la vista JSP
    }

   @RequestMapping("/login")
   public String procesarInicioSesion(@RequestParam String nombreUsuario,
                                       @RequestParam String contrasena
                                       /*,Model model*/) {
        //TODO Validar en contra la BD
        if ("usuario123".equals(nombreUsuario) && "contrasena123".equals(contrasena)) {
            //model.addAttribute("nombreUsuario", nombreUsuario);
            return "bienvenido";
        } else {
            //model.addAttribute("error", "Credenciales inválidas");
            return "Credenciales invalidad";
        }
   }

}
