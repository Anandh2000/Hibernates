package criteria;

import java.util.List;

import com.hibernate.Clerk;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class CriteriaDisplay {

	public static void main(String[] args) {
		Configuration cfg  = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Clerk.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Criteria cr = s.createCriteria(Clerk.class);
		//cr.add(Restrictions.gt("id", 2));
		//cr.add(Restrictions.lt("id", 11));
		List<Clerk> ll = cr.list();
		for(Clerk gg :ll) {
			System.out.println(gg);
		}
		s.close();

	}

}
