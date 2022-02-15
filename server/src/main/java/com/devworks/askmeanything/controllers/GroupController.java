package com.devworks.askmeanything.controllers;

import com.devworks.askmeanything.models.data.Group;
import com.devworks.askmeanything.repositories.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class GroupController {

    @Autowired
    GroupRepository groupRepository;

    @GetMapping("/api/groups")
    public List<Group> GetAllGroups() {
        return groupRepository.findAll();
    }

    @GetMapping("/api/groups/{groupId}")
    public Optional<Group> GetGroupById(@PathVariable String groupId) {
        return groupRepository.findById(groupId);
    }

    @PostMapping("/api/groups")
    public Group CreateGroup(@RequestBody Group group) {
        return groupRepository.save(group);
    }

}
