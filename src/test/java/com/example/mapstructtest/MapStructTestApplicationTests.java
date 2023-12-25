package com.example.mapstructtest;

import com.example.mapstructtest.Mappings.UserMapper;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
class MapStructTestApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void shouldConvertUserToUserDto(){
        User user = new User(1,"Abdelkrim", "Jouidri", "pa$$word");
        UserDto userDto = UserMapper.INSTANCE.userToUserDto(user);

        assertThat(userDto).isNotNull();
        assertThat(userDto.getFname()).isEqualTo("Abdelkrim");
        assertThat(userDto.getLname()).isEqualTo("Jouidri");


    }

}
