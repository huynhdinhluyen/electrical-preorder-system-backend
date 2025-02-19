package com.example.electrical_preorder_system_backend.service.product;

import com.example.electrical_preorder_system_backend.dto.request.CreateProductRequest;
import com.example.electrical_preorder_system_backend.dto.request.UpdateProductRequest;
import com.example.electrical_preorder_system_backend.dto.response.ProductDTO;
import com.example.electrical_preorder_system_backend.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.UUID;

public interface IProductService {
    Product addProduct(CreateProductRequest request, List<MultipartFile> files);
    Page<Product> getProducts(Pageable pageable);

    Page<Product> getProductsByCategory(String categoryName, Pageable pageable);
    Product getProductById(UUID id);

    Product updateProduct(UpdateProductRequest request, UUID id, List<MultipartFile> files);
    void deleteProductById(UUID id);
    Long countProducts();
    Page<ProductDTO> getConvertedProducts(Pageable pageable);
    ProductDTO convertToDto(Product product);
}
