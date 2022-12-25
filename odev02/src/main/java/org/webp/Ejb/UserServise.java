
@Stateless
public class UserServise {

    @PersistenceContext
    private EntityManager em;

    public Users getUser(String username, String password) {
        try {
            return em.createQuery("SELECT u FROM Users u WHERE u.username = :username AND u.password = :password", Users.class)
                    .setParameter("username", username)
                    .setParameter("password", password)
                    .getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }
}