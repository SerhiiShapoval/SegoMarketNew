package com.example.segomarketnew.dto;

import com.example.segomarketnew.domain.model.OrderDetails;
import com.example.segomarketnew.domain.model.Product;
import com.example.segomarketnew.mapper.ProductMapper;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetailsDTO {

    private ProductDto product;
    private BigDecimal amount;


}
