package com.example.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductRepo repo;

    @PostMapping("/post")
    public String get(@RequestBody Product product){
        if (product.getOperation()=='+') {
            product.setResult(product.getInput1() + product.getInput2());
        }else if (product.getOperation()=='-') {
            product.setResult(product.getInput1() - product.getInput2());
        }else if (product.getOperation()=='*') {
            product.setResult(product.getInput1() * product.getInput2());
        }else if (product.getOperation()=='/') {
            product.setResult(product.getInput1() / product.getInput2());
        }
        repo.save(product);
        return product.toString();

    }
}
