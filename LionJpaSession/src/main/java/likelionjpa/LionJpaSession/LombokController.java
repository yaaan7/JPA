package likelionjpa.LionJpaSession;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LombokController {

    @GetMapping("/yaaan")
    public String yaaan (Model model){
        model.addAttribute("data", "helloWorld");
        return "yaaan";
    }

}
