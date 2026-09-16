package com.controller;

import com.entity.Trainer;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TrainerController {

    List<Trainer> trainers = new ArrayList<>();


    // 1) Add trainer list
    @PostMapping("/addtrainerlist")
    public String addtrainerlist(@RequestBody List<Trainer> tlist)
    {
        trainers.addAll(tlist);

        return "trainer list added";
    }


    // 2) Get all trainers
    @GetMapping("/findalltrainers")
    public List<Trainer> findalltrainers()
    {
        return trainers;
    }


    // 3) Update trainer using PATCH
    @PatchMapping("/updatetrainer")
    public String updatetrainer(@RequestParam int tid,
                                @RequestBody Trainer newtrainer)
    {
        // Step 1: Create empty object
        Trainer existingtrainer = new Trainer();


        // Step 2: Find matching trainer
        for(Trainer t : trainers)
        {
            if(t.getTid() == tid)
            {
                existingtrainer = t;
            }
        }


        // Step 3: Check matching trainer found or not
        if(existingtrainer.getTid() == 0)
        {
            return "No matching trainer found for given tid";
        }


        // Step 4: Check new data provided or not
        if(newtrainer.getTname() == null
                && newtrainer.getSubject() == null
                && newtrainer.getSalary() == 0.0
                && newtrainer.getExp() == 0.0)
        {
            return "No new data provided for updation";
        }


        // Step 5: Update only provided fields

        if(newtrainer.getTname() != null)
        {
            existingtrainer.setTname(newtrainer.getTname());
        }

        if(newtrainer.getSubject() != null)
        {
            existingtrainer.setSubject(newtrainer.getSubject());
        }

        if(newtrainer.getSalary() != 0.0)
        {
            existingtrainer.setSalary(newtrainer.getSalary());
        }

        if(newtrainer.getExp() != 0.0)
        {
            existingtrainer.setExp(newtrainer.getExp());
        }


        return "Trainer record updated successfully";
    }


    // 4) Update trainer using PUT
    @PutMapping("/updatetrainerput")
    public String updatetrainerput(@RequestParam int tid,
                                   @RequestBody Trainer newtrainer)
    {
        // Step 1: Create empty object
        Trainer existingtrainer = new Trainer();


        // Step 2: Find matching trainer
        for(Trainer t : trainers)
        {
            if(t.getTid() == tid)
            {
                existingtrainer = t;
            }
        }


        // Step 3: Check matching trainer found or not
        if(existingtrainer.getTid() == 0)
        {
            return "No matching trainer found for given tid";
        }


        // Step 4: Update complete trainer object

        existingtrainer.setTname(newtrainer.getTname());
        existingtrainer.setSubject(newtrainer.getSubject());
        existingtrainer.setSalary(newtrainer.getSalary());
        existingtrainer.setExp(newtrainer.getExp());


        return "Trainer record updated successfully using PUT";
    }


    // 5) Delete trainer using tid
    @DeleteMapping("/deletetrainer")
    public String deletetrainer(@RequestParam int tid)
    {
        // Step 1: Find matching trainer

        Trainer existingtrainer = new Trainer();

        for(Trainer t : trainers)
        {
            if(t.getTid() == tid)
            {
                existingtrainer = t;
            }
        }


        // Step 2: Check trainer found or not

        if(existingtrainer.getTid() == 0)
        {
            return "No matching trainer found for given tid";
        }


        // Step 3: Delete trainer

        trainers.remove(existingtrainer);


        return "Trainer record deleted successfully";
    }


    // 6) Add single trainer record
    @PostMapping("/addtrainer")
    public String addtrainer(@RequestBody Trainer t)
    {
        trainers.add(t);

        return "Single trainer record added successfully";
    }

}