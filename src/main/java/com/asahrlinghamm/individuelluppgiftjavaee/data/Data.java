package com.asahrlinghamm.individuelluppgiftjavaee.data;

import com.asahrlinghamm.individuelluppgiftjavaee.Entities.Address;
import com.asahrlinghamm.individuelluppgiftjavaee.Repositories.MemberRepository;
import com.asahrlinghamm.individuelluppgiftjavaee.Entities.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Data implements CommandLineRunner {

    @Autowired
    private MemberRepository memberRepository;

    @Override
    public void run(String... args) throws Exception {
        Address address = new Address("Kedjegatan 12", 35467, "Borås");
        Member member = new Member("Anders", "Granbäck", address, "anders@email.com", "0319405011", "1980-02-15");
        Address address1 = new Address("Omtorget 3", 54389, "Ockelbo");
        Member member1 = new Member("Milanda", "Tenngren", address1, "milanda@email.com","0736904512", "1980-02-15");
        Address address2 = new Address("Algatan 2", 56890, "Umeå");
        Member member2 = new Member("Erin", "Svensson", address2, "erin@email.com", "632755928", "1992-04-23");
        Address address3 = new Address("Västergatan 3", 94567, "Stockholm");
        Member member3 = new Member("Bodil", "Algren", address3, "bodil@email.com", "372937750", "1970-07-08");
        Address address4 = new Address("Krutgränd 245", 56432, "Malmö");
        Member member4 = new Member("Sanjo", "Borén", address4, "sanjo@email.com", "334863693", "1995-09-15");


        memberRepository.save(member);
        memberRepository.save(member1);
        memberRepository.save(member2);
        memberRepository.save(member3);
        memberRepository.save(member4);
    }
}

