package co.udea.ssmu.api.model.jpa.mapper.trips;

import co.udea.ssmu.api.model.jpa.dto.trips.TripDTO;
import co.udea.ssmu.api.model.jpa.model.trips.Trip;
import java.sql.Time;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-19T12:36:53-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.8 (Oracle Corporation)"
)
@Component
public class ITripMapperImpl implements ITripMapper {

    @Override
    public Trip toEntity(TripDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Trip trip = new Trip();

        return trip;
    }

    @Override
    public TripDTO toDto(Trip entity) {
        if ( entity == null ) {
            return null;
        }

        Integer id = null;
        String user = null;
        LocalDate date = null;
        Time time = null;
        Double distance = null;
        String city = null;

        id = entity.getId();
        user = entity.getUser();
        date = entity.getDate();
        time = entity.getTime();
        distance = entity.getDistance();
        city = entity.getCity();

        TripDTO tripDTO = new TripDTO( id, user, date, time, distance, city );

        return tripDTO;
    }

    @Override
    public List<Trip> toEntity(List<TripDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Trip> list = new ArrayList<Trip>( dtoList.size() );
        for ( TripDTO tripDTO : dtoList ) {
            list.add( toEntity( tripDTO ) );
        }

        return list;
    }

    @Override
    public List<TripDTO> toDto(List<Trip> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<TripDTO> list = new ArrayList<TripDTO>( entityList.size() );
        for ( Trip trip : entityList ) {
            list.add( toDto( trip ) );
        }

        return list;
    }

    @Override
    public Set<Trip> toEntity(Set<TripDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        Set<Trip> set = new LinkedHashSet<Trip>( Math.max( (int) ( dtoList.size() / .75f ) + 1, 16 ) );
        for ( TripDTO tripDTO : dtoList ) {
            set.add( toEntity( tripDTO ) );
        }

        return set;
    }

    @Override
    public Set<TripDTO> toDto(Set<Trip> entityList) {
        if ( entityList == null ) {
            return null;
        }

        Set<TripDTO> set = new LinkedHashSet<TripDTO>( Math.max( (int) ( entityList.size() / .75f ) + 1, 16 ) );
        for ( Trip trip : entityList ) {
            set.add( toDto( trip ) );
        }

        return set;
    }
}
