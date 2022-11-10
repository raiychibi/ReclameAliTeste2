package br.com.gs.reclameali.mapper;

import br.com.gs.reclameali.dto.EnderecoDto;
import br.com.gs.reclameali.model.Endereco;

public class EnderecoMapper {

    public static Endereco dtoParaEndereco(EnderecoDto dto){
        return new Endereco(null, dto.getUrl(), null);
    }

}
