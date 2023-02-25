package com.example.Book_my_Show_Application_February.Services;

import com.example.Book_my_Show_Application_February.Entities.UserEntity;
import com.example.Book_my_Show_Application_February.EntryDtos.UserEntryDto;
import com.example.Book_my_Show_Application_February.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService
{

    @Autowired
    UserRepository userRepository;
    public void addUser(UserEntryDto userEntryDto)
    {
       UserEntity userEntity= UserEntity.builder().age(userEntryDto.getAge()).name(userEntryDto.getName()).address(userEntryDto.getAddress())
        .email(userEntryDto.getEmail()).mobNo(userEntryDto.getMobNo()).build();

       userRepository.save(userEntity);

    }

}
