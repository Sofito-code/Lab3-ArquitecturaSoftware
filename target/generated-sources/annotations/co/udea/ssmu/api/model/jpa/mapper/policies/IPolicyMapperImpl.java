package co.udea.ssmu.api.model.jpa.mapper.policies;

import co.udea.ssmu.api.model.jpa.dto.policies.PolicyDTO;
import co.udea.ssmu.api.model.jpa.model.policies.Policy;
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
    date = "2023-11-19T12:36:55-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.8 (Oracle Corporation)"
)
@Component
public class IPolicyMapperImpl implements IPolicyMapper {

    @Override
    public Policy toEntity(PolicyDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Policy policy = new Policy();

        policy.setAssociate( dto.getAssociate() );
        policy.setTaxes( dto.getTaxes() );
        policy.setPlatform( dto.getPlatform() );
        policy.setDate( dto.getDate() );

        return policy;
    }

    @Override
    public PolicyDTO toDto(Policy entity) {
        if ( entity == null ) {
            return null;
        }

        BigDecimal associate = null;
        BigDecimal taxes = null;
        BigDecimal platform = null;
        LocalDate date = null;
        Integer id = null;

        associate = entity.getAssociate();
        taxes = entity.getTaxes();
        platform = entity.getPlatform();
        date = entity.getDate();
        id = entity.getId();

        PolicyDTO policyDTO = new PolicyDTO( id, associate, taxes, platform, date );

        return policyDTO;
    }

    @Override
    public List<Policy> toEntity(List<PolicyDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Policy> list = new ArrayList<Policy>( dtoList.size() );
        for ( PolicyDTO policyDTO : dtoList ) {
            list.add( toEntity( policyDTO ) );
        }

        return list;
    }

    @Override
    public List<PolicyDTO> toDto(List<Policy> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PolicyDTO> list = new ArrayList<PolicyDTO>( entityList.size() );
        for ( Policy policy : entityList ) {
            list.add( toDto( policy ) );
        }

        return list;
    }

    @Override
    public Set<Policy> toEntity(Set<PolicyDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        Set<Policy> set = new LinkedHashSet<Policy>( Math.max( (int) ( dtoList.size() / .75f ) + 1, 16 ) );
        for ( PolicyDTO policyDTO : dtoList ) {
            set.add( toEntity( policyDTO ) );
        }

        return set;
    }

    @Override
    public Set<PolicyDTO> toDto(Set<Policy> entityList) {
        if ( entityList == null ) {
            return null;
        }

        Set<PolicyDTO> set = new LinkedHashSet<PolicyDTO>( Math.max( (int) ( entityList.size() / .75f ) + 1, 16 ) );
        for ( Policy policy : entityList ) {
            set.add( toDto( policy ) );
        }

        return set;
    }
}
