package lk.bitproject.user;



import org.springframework.data.jpa.repository.JpaRepository;

                                                     //entity id data type
public interface UserRepository extends JpaRepository<User,Integer> {

    
} 
