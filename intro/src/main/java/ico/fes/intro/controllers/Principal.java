
package ico.fes.intro;

        import ico.fes.intro.model.Empleado;
        import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.GetMapping;

        import java.sql.Date;

@Controller
public class Principal {

    @GetMapping("/inicio")
    public  String getInicio(Model model){
        Empleado emp= new Empleado(1,"José Sosa",23000,"Desarrollo","12/12/2000" );
        model.addAttribute("empleado",emp);
        return "index";
    }
}