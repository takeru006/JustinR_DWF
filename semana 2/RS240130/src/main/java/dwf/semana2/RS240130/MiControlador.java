package dwf.semana2.RS240130;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/datos")
public class MiControlador {

    @Autowired
    private MiServicio miservicio;

    @GetMapping
    public List<String> obtenerDatos() {
        return miservicio.obtenerDatos();
    }

    @PostMapping
    public String agregarDato(@RequestBody String nuevoDato) {
        miservicio.agregarDato(nuevoDato);
        return "Dato agregado correctamente: " + nuevoDato;
    }

    
}
