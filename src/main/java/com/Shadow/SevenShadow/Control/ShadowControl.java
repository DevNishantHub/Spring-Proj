package com.Shadow.SevenShadow.Control;

import com.Shadow.SevenShadow.Model.Shadow;
import com.Shadow.SevenShadow.Service.ShadowService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/")

public class ShadowControl {

    private ShadowService shadowService;

    public ShadowControl(ShadowService shadowService) {
        this.shadowService = shadowService;
    }

    @GetMapping("/")
    public List<Shadow> getAllDetail(){
        return shadowService.getAllDetail();
    }
    @GetMapping("/{id}")
    public Optional<Shadow> getById(@PathVariable int id){
        return shadowService.getByRank(id);
    }
    @PostMapping
    public void addShadow(@RequestBody Shadow shadow){
        shadowService.addShadow(shadow);
    }
    @PutMapping
    public void updateShadow(@RequestBody Shadow shadow){
        shadowService.updateShadow(shadow);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Integer id){
        shadowService.deleteById(id);
    }
}
