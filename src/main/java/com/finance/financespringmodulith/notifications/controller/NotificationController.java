package com.finance.financespringmodulith.notifications.controller;

import com.finance.financespringmodulith.notifications.domain.Notification;
import com.finance.financespringmodulith.notifications.service.NotificationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notifications")
public class NotificationController {

    private final NotificationService service;

    public NotificationController(NotificationService service) {
        this.service = service;
    }

    @PostMapping
    public Notification create(@RequestBody Notification notification) {
        return service.save(notification);
    }

    @GetMapping
    public List<Notification> list() {
        return service.findAll();
    }
}

