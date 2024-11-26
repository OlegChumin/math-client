package ru.gpb.ccl.math.client.mathclient.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class OperationRequestDTO {
    private double a;
    private double b;
}