package principles.LoD;

public class Client {
    public static void main(String[] args) {
        Agent agent = new Agent();
        Company company = new Company("xf");
        agent.setCompany(company);
        Fans fans = new Fans("ncf");
        agent.setFans(fans);
        Star star = new Star("zzm");
        agent.setStar(star);
        agent.meeting();
        agent.business();

    }
}
