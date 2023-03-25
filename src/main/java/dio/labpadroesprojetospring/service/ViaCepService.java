package dio.labpadroesprojetospring.service;

import dio.labpadroesprojetospring.model.Endereco;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {

    @GetMapping("/{cep}`/json/")
    Endereco consultarCep(@PathVariable("cep") String Cep);
}
