package com.workintech.s18d2.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@NoArgsConstructor
@Table(name = "vegetables", schema = "public")
public class Vegetable extends Plant {

    @NotNull
    @Column(name = "is_grown_on_tree")
    private boolean isGrownOnTree;
}
