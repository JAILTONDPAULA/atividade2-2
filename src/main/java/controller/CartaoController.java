package controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RestController("/api/v1/cartoes")
public class CartaoController {

    @PostMapping("/{id}")
    public ResponseEntity<String> send(@PathVariable Long id) {
        return null;
    }

}
