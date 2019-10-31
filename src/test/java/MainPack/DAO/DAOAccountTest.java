package MainPack.DAO;


import org.junit.Test;

public class DAOAccountTest {

    private DAOAccount ac = new DAOAccount();

    @Test
    public void allAccounts() {
        System.out.println(ac.allAccounts());
    }

    @Test
    public void totalBank() {
        System.out.println(ac.totalBank());
    }
}
