package co.udea.ssmu.api.model.jpa.mapper.cities;

import co.udea.ssmu.api.model.jpa.dto.cities.CityDTO;
import co.udea.ssmu.api.model.jpa.model.cities.City;
import java.math.BigDecimal;
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
public class ICityMapperImpl implements ICityMapper {

    @Override
    public City toEntity(CityDTO dto) {
        if ( dto == null ) {
            return null;
        }

        City city = new City();

        city.setPercentage( dto.getPercentage() );

        return city;
    }

    @Override
    public CityDTO toDto(City entity) {
        if ( entity == null ) {
            return null;
        }

        String name = null;
        BigDecimal percentage = null;
        Integer id = null;

        name = entity.getName();
        percentage = entity.getPercentage();
        id = entity.getId();

        CityDTO cityDTO = new CityDTO( id, name, percentage );

        return cityDTO;
    }

    @Override
    public List<City> toEntity(List<CityDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<City> list = new ArrayList<City>( dtoList.size() );
        for ( CityDTO cityDTO : dtoList ) {
            list.add( toEntity( cityDTO ) );
        }

        return list;
    }

    @Override
    public List<CityDTO> toDto(List<City> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<CityDTO> list = new ArrayList<CityDTO>( entityList.size() );
        for ( City city : entityList ) {
            list.add( toDto( city ) );
        }

        return list;
    }

    @Override
    public Set<City> toEntity(Set<CityDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        Set<City> set = new LinkedHashSet<City>( Math.max( (int) ( dtoList.size() / .75f ) + 1, 16 ) );
        for ( CityDTO cityDTO : dtoList ) {
            set.add( toEntity( cityDTO ) );
        }

        return set;
    }

    @Override
    public Set<CityDTO> toDto(Set<City> entityList) {
        if ( entityList == null ) {
            return null;
        }

        Set<CityDTO> set = new LinkedHashSet<CityDTO>( Math.max( (int) ( entityList.size() / .75f ) + 1, 16 ) );
        for ( City city : entityList ) {
            set.add( toDto( city ) );
        }

        return set;
    }
}
