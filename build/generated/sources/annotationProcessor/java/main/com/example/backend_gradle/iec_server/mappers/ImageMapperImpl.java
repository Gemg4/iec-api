package com.example.backend_gradle.iec_server.mappers;

import com.example.backend_gradle.iec_server.dtos.other.UploadedImage;
import com.example.backend_gradle.iec_server.entities.Image;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-12-14T16:40:02+0800",
    comments = "version: 1.6.3, compiler: IncrementalProcessingEnvironment from gradle-language-java-9.2.1.jar, environment: Java 25.0.1 (Eclipse Adoptium)"
)
@Component
public class ImageMapperImpl implements ImageMapper {

    @Override
    public Image toEntity(UploadedImage uploadedImage) {
        if ( uploadedImage == null ) {
            return null;
        }

        Image image = new Image();

        image.setImageName( uploadedImage.getImageName() );
        image.setImagePath( uploadedImage.getImagePath() );

        return image;
    }
}
