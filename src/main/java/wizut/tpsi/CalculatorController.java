package wizut.tpsi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class CalculatorController {
    @RequestMapping("/wynik_1")
    public String wynik_1(Model model, Integer lvalue, Integer rvalue) {
        Integer result = lvalue + rvalue;
        model.addAttribute("lvalue", lvalue);
        model.addAttribute("rvalue", rvalue);
        model.addAttribute("result", result);
        return "wynik_1";
    }
    @RequestMapping("/wynik_2")
    public String wynik_2(Model model, CalculatorForm calc) {
        model.addAttribute("calc", calc);
        return "wynik_2";
    }
}