package com.iremguzel.registerdemo.finalhome.webtasarim;

import com.iremguzel.registerdemo.finalhome.webtasarim.data.entity.JqueryEntity;

import java.util.List;

public interface IJqueryService {
    // MODEL MAPPER
    public JqueryDto EntityToDto(JqueryEntity jqueryEntity  );
    public JqueryEntity DtoToEntity(JqueryDto jqueryDto);

    // CREATE
    public JqueryDto createRegister(JqueryDto jqueryDto);

    // LIST
    public List<JqueryDto> getAllRegisters();
}
