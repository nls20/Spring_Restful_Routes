package com.example.files.Components;

import com.example.files.Models.File;
import com.example.files.Models.Folder;
import com.example.files.Models.User;
import com.example.files.Repositories.FileRepository;
import com.example.files.Repositories.FolderRepository;
import com.example.files.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;
    @Autowired
    FolderRepository folderRepository;
    @Autowired
    UserRepository userRepository;

    public DataLoader() {
    }
    public void run(ApplicationArguments args) {
        User user1= new User("John");
        userRepository.save(user1);
        User user2 = new User("Pearl");
        userRepository.save(user2);
        User user3 = new User("Joe");
        userRepository.save(user3);
        Folder folder1 = new Folder("Large", user1);
        folderRepository.save(folder1);
        Folder folder2 = new Folder("Small", user2);
        folderRepository.save(folder2);
        Folder folder3 = new Folder("Medium", user3);
        folderRepository.save(folder3);
        File file1 = new File("Red", "txt", 55, folder1);
        fileRepository.save(file1);
        File file2 = new File("Blue", "crs", 55, folder2);
        fileRepository.save(file2);
        File file3= new File("Yellow", "CSC", 35, folder3);
        fileRepository.save(file3);

    }

}


