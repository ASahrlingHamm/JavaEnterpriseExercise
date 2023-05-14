package com.asahrlinghamm.individuelluppgiftjavaee.Controller;

import com.asahrlinghamm.individuelluppgiftjavaee.Entities.Member;
import com.asahrlinghamm.individuelluppgiftjavaee.Services.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MemberController {

    @Autowired
    private MemberService memberService;


    @PostMapping("/admin/addmember")
    public ResponseEntity<Member> addMember(@RequestBody Member member) {
        return new ResponseEntity<Member>(memberService.addMember(member), HttpStatus.OK);
    }

    @GetMapping("/admin/members")
    public List<Member> getAllMembers() {return memberService.getAllMembers(); }

    @PutMapping("/admin/member/{id}")
    public ResponseEntity<Member>updateMember(@PathVariable("id") int id, @RequestBody Member member) {
        return ResponseEntity.ok(memberService.updateMember(member, id));
    }

    @DeleteMapping("/admin/delete/{id}")
    public ResponseEntity<String> deleteMember(@PathVariable("id") int id) {
        memberService.deleteMember(id);
        return new ResponseEntity<String>("Member deleted!", HttpStatus.OK);
    }
}
