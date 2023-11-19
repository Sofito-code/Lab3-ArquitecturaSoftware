package co.udea.ssmu.api.model.jpa.mapper.rates;

import co.udea.ssmu.api.model.jpa.dto.rates.RateDTO;
import co.udea.ssmu.api.model.jpa.model.rates.Rate;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-19T12:36:54-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.8 (Oracle Corporation)"
)
@Component
public class IRateMapperImpl implements IRateMapper {

    @Override
    public Rate toEntity(RateDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Rate rate = new Rate();

        rate.setId( dto.getId() );
        rate.setPrice( dto.getPrice() );
        rate.setSurcharge( dto.getSurcharge() );
        rate.setBegin_date( dto.getBegin_date() );
        rate.setEnd_date( dto.getEnd_date() );

        return rate;
    }

    @Override
    public RateDTO toDto(Rate entity) {
        if ( entity == null ) {
            return null;
        }

        Integer id = null;
        Integer price = null;
        BigDecimal surcharge = null;
        LocalDate begin_date = null;
        LocalDate end_date = null;

        id = entity.getId();
        price = entity.getPrice();
        surcharge = entity.getSurcharge();
        begin_date = entity.getBegin_date();
        end_date = entity.getEnd_date();

        RateDTO rateDTO = new RateDTO( id, price, surcharge, begin_date, end_date );

        return rateDTO;
    }

    @Override
    public List<Rate> toEntity(List<RateDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Rate> list = new ArrayList<Rate>( dtoList.size() );
        for ( RateDTO rateDTO : dtoList ) {
            list.add( toEntity( rateDTO ) );
        }

        return list;
    }

    @Override
    public List<RateDTO> toDto(List<Rate> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<RateDTO> list = new ArrayList<RateDTO>( entityList.size() );
        for ( Rate rate : entityList ) {
            list.add( toDto( rate ) );
        }

        return list;
    }

    @Override
    public Set<Rate> toEntity(Set<RateDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        Set<Rate> set = new LinkedHashSet<Rate>( Math.max( (int) ( dtoList.size() / .75f ) + 1, 16 ) );
        for ( RateDTO rateDTO : dtoList ) {
            set.add( toEntity( rateDTO ) );
        }

        return set;
    }

    @Override
    public Set<RateDTO> toDto(Set<Rate> entityList) {
        if ( entityList == null ) {
            return null;
        }

        Set<RateDTO> set = new LinkedHashSet<RateDTO>( Math.max( (int) ( entityList.size() / .75f ) + 1, 16 ) );
        for ( Rate rate : entityList ) {
            set.add( toDto( rate ) );
        }

        return set;
    }
}
