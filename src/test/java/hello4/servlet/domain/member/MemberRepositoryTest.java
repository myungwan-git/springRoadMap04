package hello4.servlet.domain.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberRepositoryTest {
  MemberRepository memberRepository = MemberRepository.getInstance();

  @AfterEach
  void afterEach() {
    memberRepository.clearStore();
  }

  @Test
  void save() {
    Member member = new Member("AAAA", 10);
//    memberRepository.save(member);
//    Long id = member.getId();
//    Member byId = memberRepository.findById(id);
//    Assertions.assertThat(member).isSameAs(byId);


    Member save = memberRepository.save(member);
    Member byId = memberRepository.findById(save.getId());
    Assertions.assertThat(save).isSameAs(byId);

  }

}