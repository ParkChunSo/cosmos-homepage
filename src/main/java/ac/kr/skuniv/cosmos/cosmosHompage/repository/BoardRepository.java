package ac.kr.skuniv.cosmos.cosmosHompage.repository;

import ac.kr.skuniv.cosmos.cosmosHompage.model.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<BoardEntity, Long> {
}
