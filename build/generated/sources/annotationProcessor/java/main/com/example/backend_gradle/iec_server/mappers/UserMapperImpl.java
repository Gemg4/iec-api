package com.example.backend_gradle.iec_server.mappers;

import com.example.backend_gradle.iec_server.dtos.user.RegistrationRequest;
import com.example.backend_gradle.iec_server.dtos.user.UserDto;
import com.example.backend_gradle.iec_server.entities.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-12-26T16:20:49+0800",
    comments = "version: 1.6.3, compiler: IncrementalProcessingEnvironment from gradle-language-java-9.2.1.jar, environment: Java 25.0.1 (Eclipse Adoptium)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDto toDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setRoles( mapRole( user.getRole().name() ) );
        userDto.setId( user.getId() );
        userDto.setUsername( user.getUsername() );
        userDto.setEmail( user.getEmail() );
        if ( user.getStatus() != null ) {
            userDto.setStatus( user.getStatus().name() );
        }

        return userDto;
    }

    @Override
    public User toEntity(RegistrationRequest registrationRequest) {
        if ( registrationRequest == null ) {
            return null;
        }

        User user = new User();

        user.setUsername( registrationRequest.getUsername() );
        user.setPassword( registrationRequest.getPassword() );
        user.setEmail( registrationRequest.getEmail() );

        return user;
    }
}
