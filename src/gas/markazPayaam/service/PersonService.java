package gas.markazPayaam.service;

import java.util.List;
import gas.markazPayaam.entity.Person7se1;
import gas.markazPayaam.repository.PersonDA;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PersonService {
    private static final Logger logger = LogManager.getLogger(PersonService.class);

    private PersonService(){}
    private static final PersonService PERSON_SERVICE = new PersonService();

    public static PersonService getInstance() {
        return PERSON_SERVICE;
    }
    public void save(Person7se1 person)throws Exception
    {
        try (PersonDA personDA = new PersonDA()) {
            personDA.insert(person);
            personDA.commit();
            logger.info("شخص با موفقیت ذخیره شد: {}", person);
        } catch (Exception e) {
            logger.error("خطا در ذخیره‌سازی شخص: {}", person, e);
            throw e;
        }

    }
    public void change(Person7se1 person)throws Exception
    {
        try (PersonDA personDA = new PersonDA()) {
            personDA.update(person);
            personDA.commit();
            logger.info("شخص با موفقیت ویرایش شد: {}", person);
        } catch (Exception e) {
            logger.error("خطا در ویرایش شخص: {}", person, e);
            throw e;
        }
    }
    public void remove(Person7se1 person)throws Exception
    {
        try (PersonDA personDA = new PersonDA()) {
            personDA.delete(person);
            personDA.commit();
            logger.info("شخص با موفقیت حذف شد: {}", person);
        } catch (Exception e) {
            logger.error("خطا در حذف شخص: {}", person, e);
            throw e;
        }
    }

    public List<Person7se1> findAll()throws Exception
    {
        try(PersonDA personDA = new PersonDA()){
            return personDA.selectAll();
        }
    }
}