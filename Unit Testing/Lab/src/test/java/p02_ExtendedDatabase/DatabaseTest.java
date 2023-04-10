package p02_ExtendedDatabase;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

import static org.junit.Assert.*;

public class DatabaseTest {
    private Database database;
    private Person pesho = new Person(1, "Pesho");
    private Person toshko = new Person(2, "Toshko");
    private Person goshko = new Person(3, "Goshko");

    @Before
    public void prepare() throws OperationNotSupportedException {
        database = new Database(pesho, toshko, goshko);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testConstructorShouldThrowWithMoreThan16Users() throws OperationNotSupportedException {
        Person[] bigDb = new Person[17];
        database = new Database(bigDb);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testConstructorShouldThrowWithNoUsers() throws OperationNotSupportedException {
        Person[] bigDb = new Person[0];
        database = new Database(bigDb);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testFindByUsernameShouldThrowWithNull() throws OperationNotSupportedException{
        database.findByUsername(null);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testFindByUsernameShouldThrowIfMissing() throws OperationNotSupportedException{
        database.findByUsername("Sashko");
    }

    @Test
    public void testFindByUsernameShouldReturnUser() throws OperationNotSupportedException{
        Person person = database.findByUsername(pesho.getUsername());
        Assert.assertEquals(person.getId(), pesho.getId());
        Assert.assertEquals(person.getUsername(), pesho.getUsername());
    }

    @Test
    public void testAddShouldAddUser() throws OperationNotSupportedException{
        Person[] dbPerson = database.getElements();
        Person hristo = new Person(666, "Hristo");
        database.add(hristo);
        Person[] dbPersonAfterAdd = database.getElements();
        Assert.assertEquals(dbPersonAfterAdd[dbPersonAfterAdd.length - 1], hristo);
        Assert.assertEquals(dbPerson.length, dbPersonAfterAdd.length - 1);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testAddShouldThrowIfInputIsNull() throws OperationNotSupportedException{
        database.add(null);
    }

    @Test
    public void testIfRemoveIsRemovingCurrentUser() throws OperationNotSupportedException{
        Person[] dbPerson = database.getElements();
        database.remove();
        Person[] dbPersonAfterRemove = database.getElements();
        Assert.assertEquals(dbPersonAfterRemove[dbPersonAfterRemove.length - 1], toshko);
        Assert.assertEquals(dbPerson.length - 1, dbPersonAfterRemove.length);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testRemoveShouldThrowIfTryToRemoveFromEmptyArray() throws OperationNotSupportedException{
        database.remove();
        database.remove();
        database.remove();
        database.remove();
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testFindByIdShouldThrowIfEmptyDb() throws OperationNotSupportedException{
        Database dbPerson = new Database();
        database.findById(3);
    }

    @Test
    public void testFindByIdShouldReturnUser() throws OperationNotSupportedException {
        Person person = database.findById(pesho.getId());
        Assert.assertEquals(person.getId(), pesho.getId());
        Assert.assertEquals(person.getUsername(), pesho.getUsername());
    }

}