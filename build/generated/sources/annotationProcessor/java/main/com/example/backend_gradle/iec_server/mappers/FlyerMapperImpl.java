package com.example.backend_gradle.iec_server.mappers;

import com.example.backend_gradle.iec_server.dtos.flyer.FlyerDto;
import com.example.backend_gradle.iec_server.dtos.flyer.FlyerRequest;
import com.example.backend_gradle.iec_server.entities.Flyer;
import com.example.backend_gradle.iec_server.entities.Image;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-12-26T16:20:49+0800",
    comments = "version: 1.6.3, compiler: IncrementalProcessingEnvironment from gradle-language-java-9.2.1.jar, environment: Java 25.0.1 (Eclipse Adoptium)"
)
@Component
public class FlyerMapperImpl implements FlyerMapper {

    @Override
    public FlyerDto toDto(Flyer flyer) {
        if ( flyer == null ) {
            return null;
        }

        FlyerDto flyerDto = new FlyerDto();

        flyerDto.setId( flyer.getId() );
        flyerDto.setTitle( flyer.getTitle() );
        flyerDto.setDescription( flyer.getDescription() );
        flyerDto.setCategory( flyer.getCategory() );
        flyerDto.setCreatedBy( String.valueOf( flyer.getCreatedBy() ) );
        flyerDto.setCreatedAt( flyer.getCreatedAt() );
        flyerDto.setUpdatedAt( flyer.getUpdatedAt() );
        List<Image> list = flyer.getImages();
        if ( list != null ) {
            flyerDto.setImages( new ArrayList<Image>( list ) );
        }
        flyerDto.setRecord( flyer.getRecord() );

        return flyerDto;
    }

    @Override
    public Flyer toEntity(FlyerRequest flyerRequest) {
        if ( flyerRequest == null ) {
            return null;
        }

        Flyer flyer = new Flyer();

        flyer.setTitle( flyerRequest.getTitle() );
        flyer.setDescription( flyerRequest.getDescription() );
        flyer.setCategory( flyerRequest.getCategory() );

        return flyer;
    }
}
