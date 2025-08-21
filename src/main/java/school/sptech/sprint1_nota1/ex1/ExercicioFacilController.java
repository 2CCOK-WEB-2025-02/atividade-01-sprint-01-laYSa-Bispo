package school.sptech.sprint1_nota1.ex1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExercicioFacilController {

    @GetMapping("/ex-01/{palavra}")
    public Boolean exercicioFacil(@PathVariable String palavra) {

        if (!palavra.isEmpty() ) {

            String pMin = palavra.toLowerCase();
            int inicio = 0;
            int fim = pMin.length() - 1;

            while(inicio < fim){

                char lInicio = pMin.charAt(inicio);
                char lFinal = pMin.charAt(fim);

                if (lInicio != lFinal) {
                    return false;
                }

                inicio++;
                fim--;

            }

        }

        return true;

    }
}
