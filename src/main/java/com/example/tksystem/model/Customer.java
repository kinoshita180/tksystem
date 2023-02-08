package com.example.tksystem.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * 顧客クラス。
 */
@Entity
@Data
public class Customer {

    /** シーケンス名 */
    private static final String SEQUENCE_NAME = "customer_id_seq";

    /** ID */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SEQUENCE_NAME)
    @SequenceGenerator(name = SEQUENCE_NAME, sequenceName = SEQUENCE_NAME, allocationSize = 1)
    private Long id;

    /** 名前 */
    @NotBlank
    private String name;
}