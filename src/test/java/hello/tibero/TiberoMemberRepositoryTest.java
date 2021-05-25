package hello.tibero;

import hello.hellospring.repository.TiberoMemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TiberoMemberRepositoryTest {

    @Autowired
    TiberoMemberRepository tiberoMemberRepository;

    @Test
    public void testClass() {
        System.out.println(tiberoMemberRepository.getClass().getName());
    }
}
