package grupo7.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class ApiController {
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
