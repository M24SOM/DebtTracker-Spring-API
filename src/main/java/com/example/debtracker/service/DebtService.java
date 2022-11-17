package com.example.debtracker.service;
import com.example.debtracker.models.Debt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DebtService {
    @Autowired
    com.example.debtracker.repository.DebtRepository debtRepository;

    public List<Debt> getAllDebts(){
        return debtRepository.findAll();
    }

    public Debt getDebtById(Long id){
        return debtRepository.findById(id).get();
    }

    public Debt saveDebt(Debt debt){
        return debtRepository.save(debt);
    }

    public void deleteDebt(Long id){
        debtRepository.deleteById(id);
    }

}
