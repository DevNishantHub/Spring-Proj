package com.Shadow.SevenShadow.Service;

import com.Shadow.SevenShadow.Model.Shadow;
import com.Shadow.SevenShadow.Repo.ShadowRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShadowService {

    @Autowired
    ShadowRepo shadowRepo;

    public List<Shadow> getAllDetail(){
        return shadowRepo.findAll();
    }
    public Optional<Shadow> getByRank(int Srank){
        return shadowRepo.findById(Srank);
    }
    public void addShadow(Shadow shadow){
            shadowRepo.save(shadow);
    }
    public void updateShadow(Shadow shadow){
        shadowRepo.save(shadow);
    }
    public void deleteById(Integer Srank){
        shadowRepo.deleteById(Srank);
    }


}
