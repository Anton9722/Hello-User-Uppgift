package com.HelloUser.HelloUser;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class HelloUserController {
    
    @GetMapping("/")
    String getStartPage() {
        return "startpage";
    }

    @GetMapping("/members")
    String getMembersPage(Model model) {
        model.addAttribute("membersList", HelloUserApplication.membersList);
        return "members";
    }

    @GetMapping("/addnewmember")
    String getAddNewMemberPage(Model model) {
        model.addAttribute("newMember", new Members(null, null, 0));
        return "addnewmember";
    }

    @PostMapping("/new-member")
    String newMember(@ModelAttribute Members newMembers, Model model) {
        if (newMembers.getEmail() == "" || newMembers.getName() == "" || newMembers.getAge() <= 0) {
            System.out.println("Felaktig inmatning");
        }else{
            HelloUserApplication.membersList.add(newMembers);
        }
        return "redirect:/addnewmember";
    }

    @GetMapping("/remove-member/{memberIndex}")
    String removeMember(@PathVariable int memberIndex){
        System.out.println(memberIndex);
        HelloUserApplication.membersList.remove(memberIndex);
        return "redirect:/members";
    }
    

}
