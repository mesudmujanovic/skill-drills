package com.example.demo.hexagonal_architecture.adapter.request.association;

import lombok.Data;
@Data
public class FieldRequest {
    private Long id;
    private String text;
    private String columnPosition;
    private String position;
}