package criteria;

import java.util.List;

import com.hibernate.Clerk;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Restrictions;

public class CriteriaMethods {

	public static void main(String[] args) {
		Configuration cf = new Configuration();
		cf.configure();
		cf.addAnnotatedClass(Clerk.class);
		SessionFactory sf = cf.buildSessionFactory();
		Session s = sf.openSession();
		Criteria c = s.createCriteria(Clerk.class);
		c.add(Restrictions.like("id", 11));
		List<Clerk> l = c.list();
		for(Clerk g : l) {
			System.out.println(g);
		}
	}

}
