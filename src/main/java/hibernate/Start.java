package hibernate;

import hibernate.entity.Author;
import hibernate.entity.Book;
import org.hibernate.Session;
import org.jboss.logging.Logger;

public class Start {
    private static final Logger LOG = Logger.getLogger(AuthorHelper.class.getName());

    public static void main(String[] args) {
        // здесь не нужно открывать сессию - осталось от старого кода
        //Session session = HibernateUtil.getSessionFactory().openSession();

        //read
/*
            for (Book book : new BookHelper().getBookList()) {
            LOG.debug(book.getName());
                                                              }
*/

        //update
/*
        Author author = new Author("тест6");
        new AuthorHelper().addAuthor(author);
*/

        //выборка полей
//        new AuthorHelper().getAuthorList();

        // delete
        new AuthorHelper().delete();
    }
}