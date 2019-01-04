package ac.kr.skuniv.cosmos.cosmosHompage.repository;

import ac.kr.skuniv.cosmos.cosmosHompage.model.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<MemberEntity, Long> {
}
