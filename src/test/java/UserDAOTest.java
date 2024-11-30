import com.example.bookstorewebsite.dao.UserDAO;
import com.example.bookstorewebsite.entity.Users;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserDAOTest {
    @Test
    public void testCreateUser() {
        Users user1 = new Users();
        user1.setEmail("atiq@gmail.com");
        user1.setPassword("password");
        user1.setFullName("Atiq Rony");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("BookStoreWebsite");
        EntityManager em = emf.createEntityManager();

        UserDAO userDAO = new UserDAO(em);
        user1 = userDAO.create(user1);

        em.close();
        emf.close();

        assertTrue(user1.getUserId() > 0);
    }
}
