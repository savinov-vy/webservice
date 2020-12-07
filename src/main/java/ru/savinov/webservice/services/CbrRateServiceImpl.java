package ru.savinov.webservice.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CbrRateServiceImpl implements CbrRateService{

    @Value("$(app.data-time)")
    private Date date;

//    @Override
//    public List<Rate> gRate() {
//        return null;
//    }
}
