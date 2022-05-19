package com.homeTeam.pfe_V4.controller;

import com.homeTeam.pfe_V4.entity.Materiel;
import com.homeTeam.pfe_V4.entity.MaterielList;
import com.homeTeam.pfe_V4.service.MaterialListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class MaterialListController {
    @Autowired
    private MaterialListService materialListService;

    @PostMapping("/addMaterielList")
    public MaterielList addMateriel(@RequestBody MaterielList materielList) {
        return materialListService.savematerielList(materielList);
    }
    @GetMapping("/materielsList")
    public List<MaterielList> findListMateriels() {
        return materialListService.getmaterielsList();
    }

}
