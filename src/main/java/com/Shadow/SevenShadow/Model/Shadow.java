package com.Shadow.SevenShadow.Model;

import com.Shadow.SevenShadow.Repo.ShadowRepo;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Shadow {

@Id
private Integer Srank;
private String name;
private String fav_food;

}
