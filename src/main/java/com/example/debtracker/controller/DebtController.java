package com.example.debtracker.controller;
import com.example.debtracker.models.Debt;
import com.example.debtracker.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/debt")
public class DebtController {
    @Autowired
    com.example.debtracker.service.DebtService debtService;

    @GetMapping("/")
    public List<Debt> allDebts(){
        return debtService.getAllDebts();
    }

    @GetMapping("/{id}")
    public Debt getDebt(@PathVariable Long id){
           return debtService.getDebtById(id);
    }

    @PostMapping("/")
    public Debt saveUser(@RequestBody Debt debt){
        return debtService.saveDebt(debt);
    }

    @DeleteMapping("/{id}")
    public Debt deleteDebt(@PathVariable Long id){
        Debt deleteDebt = debtService.getDebtById(id);
        debtService.deleteDebt(id);
            return deleteDebt;
    }

}
