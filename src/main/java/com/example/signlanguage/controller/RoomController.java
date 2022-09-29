package com.example.signlanguage.controller;


//import com.example.signlanguage.chat.ChatRoomRepository;
import com.example.signlanguage.chatDTO.ChatRoomDTO;
import com.example.signlanguage.repository.RoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequiredArgsConstructor
@RequestMapping(value = "/chat")
public class RoomController {
    private final RoomRepository repository;

    // 채팅방 목록 조회
    @GetMapping(value = "/rooms")
    public ModelAndView getRooms() {

        ModelAndView mv = new ModelAndView("chat/rooms");
        mv.addObject("list", repository.findAll());
        return mv;
    }

    // 채팅방 개설
    @PostMapping(value = "/room")
    public String saveRoom(@RequestParam String name, RedirectAttributes rttr) {

        ChatRoomDTO room = new ChatRoomDTO(name);
        rttr.addFlashAttribute("roomName", repository.save(room));
        return "redirect:/hospital";
    }

    // 채팅방 조회
    @GetMapping("/room")
    public void getRoom(String roomId, Model model) {
        ChatRoomDTO room = repository.findById(roomId).get();
        model.addAttribute("room", room);
    }

    @DeleteMapping("/delete")
    public String deleteAllRooms() {
        repository.deleteAll();
        return "Deleted All";
    }

    @GetMapping("/roomtest")
    public ModelAndView test() {

        ModelAndView mv = new ModelAndView("chat/roomtest");
        mv.addObject("list", repository.findAll());
        return mv;
    }
}