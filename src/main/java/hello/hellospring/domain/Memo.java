package hello.hellospring.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="memo", schema = "testuser")
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Memo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "memo_sq")
    @SequenceGenerator(name="member_sq", sequenceName = "member_sq", allocationSize = 1)
    private Long mno;

    @Column(nullable = false)
    private String memoText;
}
