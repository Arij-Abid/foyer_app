package tn.esprit.tpfoyer17.controllers;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer17.entities.Etudiant;
import tn.esprit.tpfoyer17.services.interfaces.IEtudiantService;

import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequestMapping("api/etudiants")
@CrossOrigin(origins = "http://192.168.1.200")
public class EtudiantController {
    @GetMapping("/findByReservationsAnneeUniversitaire")
    public List<Etudiant> findByReservationsAnneeUniversitaire() {
        return etudiantService.findByReservationsAnneeUniversitaire();
    }

    @GetMapping("/retrieveAllEtudiants")
    public List<Etudiant> retrieveAllEtudiants() {
        return etudiantService.retrieveAllEtudiants();
    }

    @PostMapping("/addEtudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.addEtudiants(etudiant);
    }

    @PutMapping("/updateEtudiant")
    public Etudiant updateEtudiant(@RequestBody Etudiant e) {
        return etudiantService.updateEtudiant(e);
    }

    @GetMapping("/retrieveEtudiant/{idEtudiant}")
    public Etudiant retrieveEtudiant(@PathVariable("idEtudiant") long idEtudiant) {
        return etudiantService.retrieveEtudiant(idEtudiant);
    }

    @DeleteMapping("/removeEtudiant/{idEtudiant}")
    public void removeEtudiant(@PathVariable("idEtudiant") long idEtudiant) {
        etudiantService.removeEtudiant(idEtudiant);
    }

    IEtudiantService etudiantService;
}
