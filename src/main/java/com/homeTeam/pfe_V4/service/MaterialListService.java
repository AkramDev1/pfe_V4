package com.homeTeam.pfe_V4.service;

import com.homeTeam.pfe_V4.entity.MaterielList;
import com.homeTeam.pfe_V4.repositorie.MaterialListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialListService {
    @Autowired
    private MaterialListRepository materialListRepository;

    public MaterielList savematerielList(MaterielList materielList) {
        return materialListRepository.save(materielList);
    }
    public List<MaterielList> getmaterielsList() {
        return materialListRepository.findAll();
    }
}
