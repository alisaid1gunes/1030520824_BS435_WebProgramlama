
@Stateless
public class ViewServise {

    @PersistenceContext
    private EntityManager em;

    public void deleteView(Long id) {
        em.createQuery("DELETE FROM Views v WHERE v.id = :id")
                .setParameter("id", id)
                .executeUpdate();
    }
}